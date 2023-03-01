package com.example.demo.Controller;

import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.PayrollRepo;
import com.example.demo.Service.PayrollService;
import com.example.demo.response.PayrollResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/payroll")
public class PayrollController {
    @Autowired
    private PayrollService service;
    @Autowired
    private PayrollRepo payrollRepo;

    @Autowired
    private DepartmentRepo departmentRepo;
    @GetMapping("/{id}")
    private PayrollResponse get_payroll(@PathVariable ("id") long empId)
    {
        return service.get_payroll(empId);
    }
    @GetMapping("")
    private List<PayrollResponse> get_all()
    {
        return service.get_all();
    }

}
