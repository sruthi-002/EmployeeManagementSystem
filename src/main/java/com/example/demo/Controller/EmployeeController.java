package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Skills;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/allemp")
	private List<Employee> all()
	{

		return service.all_employee();
	}
	@GetMapping("/emp/{id}")
	private Optional<Employee> get_employee(@PathVariable("id") long emp_id) {
		return service.get_employee(emp_id);
	}
	@PutMapping("/edit/{id}")
	public Employee edit_employee(@PathVariable ("id")long emp_id , @RequestBody Employee emp)
	{
		return service.edit_employee(emp_id,emp);
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
}
