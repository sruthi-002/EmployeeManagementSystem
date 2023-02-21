package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Project;
import com.example.demo.Model.Team;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.ProjectRepo;
import com.example.demo.Repo.TeamRepo;
import com.example.demo.Service.Exception.EmployeeNotFound;
import com.example.demo.Service.Exception.ProjectNotFound;
import com.example.demo.response.EmployeeDetails;
import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private TeamRepo teamRepo;
    public Project add_project(Project project){
        project.getProject_id();
        project.getEmp_ProId().forEach(pro->{
            long d = pro.getProject_id();
            pro.setProject_id(d);
        });
        project.getEmp_ProId().forEach(emp->{
            long d = emp.getEmpId();
            emp.setEmpId(d);
        });
        return  projectRepo.save(project);
    }
    public Project getproject(long projectId) {
        return projectRepo.findById(projectId).orElseThrow(() -> new EmployeeNotFound("Project with id: " + projectId + " is not found."));
    }


    public Project edit_project(Project p) {
        return projectRepo.save(p);
    }

    public ProjectResponse get_project(long projectId) {
        Project project = projectRepo.findById(projectId).orElseThrow(() -> new EmployeeNotFound("Project with id: " + projectId + " is not found."));
        ProjectResponse projectResponse = new ProjectResponse();
        List<EmployeeDetails> employeeDetails = new ArrayList<EmployeeDetails>();
        projectResponse.setProject_id(project.getProject_id());
        projectResponse.setProject_title(project.getTitle());
        projectResponse.setStart_date(project.getStart_date());
        projectResponse.setEnd_date(project.getEnd_date());
        List<EmployeeProjects> employeeProjects = project.getEmp_ProId();
        employeeProjects.forEach(id->{
            long empId = id.getEmpId();
            EmployeeDetails details = new EmployeeDetails();
            Employee emp = employeeRepo.findById(empId).orElseThrow(() -> new EmployeeNotFound("Employee  with id: " + empId + " is not found."));
            details.setName(emp.getFname());
            long team_id =id.getTeam_id();
            Team team  = teamRepo.findById(team_id).orElseThrow(() -> new EmployeeNotFound("Team with id: " + team_id + " is not found."));
            details.setTeam(team.getTeam_name());
            details.setAmount(id.getAmount());
            employeeDetails.add(details);
        });
        projectResponse.setDetails(employeeDetails);
        return projectResponse;
    }

    public List<ProjectResponse> all() {
        List<Project> projects = projectRepo.findAll();
        List<ProjectResponse> responses = new ArrayList<ProjectResponse>();
        projects.forEach(id->
        {
            long pid = id.getProject_id();
            System.out.println(pid);
            ProjectResponse projectResponse = new ProjectResponse();
            projectResponse= get_project(pid);
            responses.add(projectResponse);
        });
        return responses;
    }
}
