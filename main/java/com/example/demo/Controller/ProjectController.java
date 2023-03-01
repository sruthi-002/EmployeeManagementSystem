package com.example.demo.Controller;

import com.example.demo.Model.Project;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.ProjectRepo;
import com.example.demo.Service.ProjectService;
import com.example.demo.response.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        System.out.println(project);
        return projectService.add_project(project);
    }
    @GetMapping("/get_project/{id}")
    private Project getproject(@PathVariable ("id") long project_id){
        return projectService.getproject(project_id);
    }

    @PutMapping("/edit-project")
    private Project edit_project(@RequestBody Project P)
    {
        return projectService.edit_project(P);
    }
    @GetMapping("/get_project_information/{id}")
    private ProjectResponse get_information(@PathVariable ("id") long project_id)
    {
        return projectService.get_project(project_id);
    }
    @GetMapping("/get_all_projects")
    private List<ProjectResponse> get_all()
    {
        return projectService.all();
    }
}