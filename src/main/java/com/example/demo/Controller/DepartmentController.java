package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @PostMapping("/adddepart")
    private Department add_department(@RequestBody Department d)
    {
        return service.add_department(d);
    }
   // @GetMapping("/getdepartment/{id}")
    //private String getdepart(@PathVariable ("id") long emp_id )
    //{
        //return service.getdepart(emp_id);
    //}
    @GetMapping("getnamebydepart/{name}")
    private long getname(@PathVariable ("name") String depart)
    {
        return service.getname(depart);
    }
    @GetMapping("/departments")
    private List<Department> displaydepartment()
    {
        return service.display_department();
    }

}
