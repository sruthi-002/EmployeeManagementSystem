package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.PayrollRepo;
import com.example.demo.Service.Exception.DepartmentNotFound;
import com.example.demo.response.PayrollResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PayrollService {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PayrollRepo payrollRepo;

    @Autowired
    private DepartmentRepo departmentRepo;
    public PayrollResponse get_payroll(long empId)
    {
        Employee emp = employeeService.get_employee(empId);
        PayrollResponse payrollResponse = new PayrollResponse();
        long salary = emp.getPayroll().getSalary();
        payrollResponse.setSalary(salary);
        payrollResponse.setEmpId(emp.getEmpId());
        payrollResponse.setFname(emp.getFname());
        payrollResponse.setEx(emp.getExperience());
        payrollResponse.setStatus(emp.getStatus());
        payrollResponse.setJoin_date(emp.getJdate());
        payrollResponse.setType_of_employee(emp.getEmployment_type());
        long d = emp.getDepartmentId();
        Department department = departmentRepo.findById(d).orElseThrow(() -> new DepartmentNotFound("Department with id: " + d + " is not found."));
        payrollResponse.setDepartment(department.getDepart());
        return payrollResponse;
    }

    public List<PayrollResponse> get_all() {
        List<Employee> employees = employeeService.all_employee();
        List<PayrollResponse> payrollResponses = new ArrayList<PayrollResponse>();
        employees.forEach(id -> {
            long empId = id.getEmpId();
            payrollResponses.add(get_payroll(empId));
        });
        return payrollResponses;
    }
}
