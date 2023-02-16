package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Project;
import com.example.demo.Repo.ProjectRepo;
import com.example.demo.response.EmployeeProjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    public Project add_project(Project project){
        return  projectRepo.save(project);
    }
}
