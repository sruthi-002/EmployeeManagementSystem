package com.example.demo.response;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
@Table(name="employee_projects")
public class EmployeeProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="emp_id")
    private Employee emp_id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="project_id")
    private Project project_id;

    public EmployeeProjects(long id, Employee emp_id, Project project_id) {
        this.id = id;
        this.emp_id = emp_id;
        this.project_id = project_id;
    }

    public EmployeeProjects() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    //GET AN EMPLOYEE
    public Employee getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Employee emp_id) {
        this.emp_id = emp_id;
    }

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
    }
}
