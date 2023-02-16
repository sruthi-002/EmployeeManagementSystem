package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Project;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.ProjectRepo;
import com.example.demo.Service.ProjectService;
import com.example.demo.response.EmployeeProjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ProjectRepo projectRepo;
    @PostMapping("/add-project")
    private Project add_project(@RequestBody Project project)
    {
        return projectService.add_project(project);
    }

//    @PostMapping("/add-project/{id}/{id2}")
//    private String add_project_employee(@PathVariable ("id") long emp_id ,@PathVariable ("id2") long project_id)
//    {
//        Optional<Project> project = projectRepo.findById(project_id);
//        Optional<Employee> emp = employeeRepo.findById(emp_id);
//        EmployeeProjects emppro = new EmployeeProjects();
//        emppro.setProject_id(project);
//        emppro.setEmp_id(emp);
////        Project p = new Project();
////        p.setEmp_ProId((List<EmployeeProjects>) emppro);
////        Employee e = new Employee();
////        e.setEmployeeprojects((List<EmployeeProjects>) emppro);
//        return " ";
//    }

}