package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Department;
import com.example.demo.Repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Skills;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.SkillRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private SkillRepo skillRepo;

	@Autowired
	private DepartmentRepo departmentRepo;
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

	public Optional<Employee> get_employee(long empId) {
		return employeeRepo.findById(empId);
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
}
