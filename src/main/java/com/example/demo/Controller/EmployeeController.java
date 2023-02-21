package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Department;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.PayrollRepo;
import com.example.demo.Service.Exception.EmployeeNotFound;
import com.example.demo.response.EmployeeResponseClass;
import com.example.demo.response.PayrollResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Skills;
import com.example.demo.Service.EmployeeService;
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@Autowired
	private EmployeeService employeeRepo;
	@Autowired
	private PayrollRepo payrollRepo;

	@Autowired
	private DepartmentRepo departmentRepo;
	@GetMapping("/allemp")
	@CrossOrigin(origins = "*")
	private List<Employee> all()
	{

		return service.all_employee();
	}
	@GetMapping("/emp/{id}")
	private Employee get_employee(@PathVariable("id") long emp_id) {
		return service.get_employee(emp_id);
	}
	@PutMapping("/edit")
	public Employee edit_employee( @RequestBody Employee emp)
	{
		return service.edit_employee(emp);
	}
	@PostMapping("/add")
	private Employee add_employee(@RequestBody Employee emp)
	{
		return service.add_employee(emp);
	}
	@PostMapping("/addskills")
	private Skills add_skill(@RequestBody Skills skill)
	{
		return service.add_skill(skill);
	}

	@GetMapping("/allskills")
	private List<Skills> all_skills()
	{
		return service.all_skills();
	}
	@GetMapping("/employee_information/{id}")
	private EmployeeResponseClass get_employee_information(@PathVariable("id") long emp_id)
	{
		return service.get_employee_information(emp_id);
	}
	@GetMapping("/all_employee")
	private List<EmployeeResponseClass> allemployee()
	{
		return service.all();
	}
}
