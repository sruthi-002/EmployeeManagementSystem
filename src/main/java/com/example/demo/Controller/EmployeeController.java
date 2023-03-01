package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.PayrollRepo;
import com.example.demo.Service.EmployeeService;
import com.example.demo.response.EmployeeResponseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
	@GetMapping("/all_emp")
	@CrossOrigin(origins = "*")
	private List<Employee> all()
	{

		return service.all_employee();
	}
	@PutMapping("")
	public Employee edit_employee( @RequestBody Employee emp)
	{
		return service.edit_employee(emp);
	}
	@PostMapping("")
	private Employee add_employee(@RequestBody Employee emp)
	{
		return service.add_employee(emp);
	}
	@GetMapping("/{id}")
	private EmployeeResponseClass get_employee_information(@PathVariable("id") long emp_id)
	{
		return service.get_employee_information(emp_id);
	}
	@GetMapping("/all_employee")
	private List<EmployeeResponseClass> allemployee()
	{
		return service.all();
	}
	@GetMapping("/findall")
	private List<Employee> employee_department(@RequestParam(defaultValue = "1",name="id")  long id , @RequestParam(name="entity") String entity )
	{
		return service.filter(id,entity);
	}

}
