package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/departments")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @PostMapping("")
    private Department add_department(@RequestBody Department d)
    {
        return service.add_department(d);
    }
    @GetMapping("/{id}")
    private Department get_department(@PathVariable ("id") long did)
    {
        return service.get_department(did);
    }
    @GetMapping("/{name}")
    private long getname(@PathVariable ("name") String depart)
    {
        return service.getname(depart);
    }
    @GetMapping("")
    private List<Department> displaydepartment()
    {
        return service.display_department();
    }

}
