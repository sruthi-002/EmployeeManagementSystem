package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.PayrollRepo;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.Exception.DepartmentNotFound;
import com.example.demo.Service.Exception.EmployeeNotFound;
import com.example.demo.Service.PayrollService;
import com.example.demo.response.PayrollResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PayrollController {
    @Autowired
    private PayrollService service;
    @Autowired
    private PayrollRepo payrollRepo;

    @Autowired
    private DepartmentRepo departmentRepo;
    @GetMapping("/get_payroll/{id}")
    private PayrollResponse get_payroll(@PathVariable ("id") long empId)
    {
        return service.get_payroll(empId);
    }
    @GetMapping("/get_all_payroll")
    private List<PayrollResponse> get_all()
    {
        return service.get_all();
    }

}
