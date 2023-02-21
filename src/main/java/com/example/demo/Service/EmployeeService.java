package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.*;
import com.example.demo.Repo.*;
import com.example.demo.Service.Exception.DepartmentNotFound;
import com.example.demo.Service.Exception.DesignationNotFound;
import com.example.demo.Service.Exception.EmployeeNotFound;
import com.example.demo.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private SkillRepo skillRepo;

	@Autowired
	private DesiginationRepo desiginationRepo;
	@Autowired
	private DepartmentRepo departmentRepo;
	@Autowired
	private ProjectRepo projectRepo;

	@Autowired
	private TeamRepo teamRepo;
	public List<Employee> all_employee() {
		return employeeRepo.findAll();
	}
	public Employee add_employee(Employee emp) {
		emp.getEmployeeskills().forEach(em -> em.setEmployee(emp));
		return employeeRepo.save(emp);
	}
	public Skills add_skill(Skills skill) {
		return skillRepo.save(skill);
	}

	public Employee get_employee(long empId) {
		return employeeRepo.findById(empId).orElseThrow(() -> new EmployeeNotFound("Employee with id: " + empId + " is not found."));
	}

	/**
	 * this method is tp edit the employee details
	 * @param emp
	 * @return Employee
	 */
	public Employee edit_employee( Employee emp) {
		emp.getEmployeeskills().forEach(em -> em.setEmployee(emp));
		return employeeRepo.save(emp);
	}
	public List<Skills> all_skills() {
		return skillRepo.findAll();
	}

	public EmployeeResponseClass get_employee_information(long emp_id) {
		Employee employee = employeeRepo.findById(emp_id).orElseThrow(() -> new EmployeeNotFound("Employee with id: " + emp_id + " is not found."));
		EmployeeResponseClass response = new EmployeeResponseClass();
		response.setEmpId(employee.getEmpId());
		response.setEmployee_id(employee.getEmployee_id());
		response.setFname(employee.getFname());
		response.setLname(employee.getLname());
		response.setEmail(employee.getEmail());
		response.setDob(employee.getDob());
		List<EmployeeProjectResponse> employeeProjectResponses = new ArrayList<EmployeeProjectResponse>();
		List<EmployeeProjects> employeeProjects = employee.getEmployeeprojects();
		employeeProjects.forEach(id-> {
			long p_id = id.getProject_id();
			Project project = projectRepo.findById(p_id).orElseThrow(() -> new DepartmentNotFound("Department with id: " + p_id + " is not found."));
			String title = project.getTitle();
			long team_id = id.getTeam_id();
			Team team = teamRepo.findById(team_id).orElseThrow(() -> new DepartmentNotFound("Department with id: " + p_id + " is not found."));
			String team_title = team.getTeam_name();
			int amount = id.getAmount();
			EmployeeProjectResponse employeeproject = new EmployeeProjectResponse();
			employeeproject.setProject_title(title);
			employeeproject.setTeam(team_title);
			employeeproject.setAmount(amount);
			employeeProjectResponses.add(employeeproject);
		});
		response.setEmployeeprojects(employeeProjectResponses);
		List<Employeeskills> skills = employee.getEmployeeskills();
		List<String> skillResponseList = new ArrayList<String>();
		skills.forEach(id->{
			long skill_id = id.getSkillId();
			Skills skill = skillRepo.findById(skill_id).orElseThrow(() -> new DepartmentNotFound("Department with id: " + skill_id + " is not found."));
			String skill_name = skill.getSkill();
			skillResponseList.add(skill_name);
		});
		response.setEmployeeskills(skillResponseList);
		response.setExperience(employee.getExperience());
		response.setEmployment_type(employee.getEmployment_type());
		response.setPayroll(employee.getPayroll());
		response.setStatus(employee.getStatus());
		long department_id = employee.getDepartment_id();
		Department department = departmentRepo.findById(department_id).orElseThrow(() -> new DepartmentNotFound("Department with id: " + department_id + " is not found."));
		String depart = department.getDepart();
		response.setDepartment(depart);
		long designation_id = employee.getDesigination_id();
		Desigination designation = desiginationRepo.findById(designation_id).orElseThrow(() -> new DesignationNotFound("Designation with id: " + designation_id + " is not found."));
		String design = designation.getDesign();
		response.setDesigination(design);
		response.setJdate(employee.getJdate());
		response.setLdate(employee.getLdate());
		return response;
	}

	public List<EmployeeResponseClass> all() {
		List<Employee> employeeList = employeeRepo.findAll();
		List<EmployeeResponseClass> employeresponse = new ArrayList<EmployeeResponseClass>();
		employeeList.forEach(id ->{
			employeresponse.add(get_employee_information(id.getEmpId()));
		});
		return employeresponse;
	}
}
