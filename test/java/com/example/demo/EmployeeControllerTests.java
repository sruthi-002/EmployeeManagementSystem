package com.example.demo;

import com.example.demo.Controller.EmployeeController;
import com.example.demo.Model.Payroll;
import com.example.demo.Model.Role;
import com.example.demo.Service.EmployeeService;
import com.example.demo.response.EmployeeCertifications;
import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.Employeeskills;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTests {
    private long empId;
    private String employee_id;
    private String fname;
    private String lname;

    private String email;

    private LocalDate dob;

    private LocalDate jdate;
    private LocalDate ldate;


    private List<Employeeskills> employeeskills;

    private List<EmployeeCertifications> employeeCertifications;
    private long departmentId;
    private long desiginationId;
    private Date date=new Date();
    private List<EmployeeProjects> employeeprojects;

    private float experience;

    private String employment_type;

    private String status;

    private String password;
    private String city;
    private String address;

    private String country;

    private Payroll payroll;

    private Set<Role> roles=new HashSet<>();

    @Autowired
    private EmployeeController employeeController;
    @Autowired
    private EmployeeService employeeService;
}
