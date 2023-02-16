package com.example.demo.Model;

import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.Employeeskills;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="project")
public class Project {
    @Id
    @Column(name="project_id")
    private long project_id;
    @Column(name="title")
    private String title;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "project_id")
    private List<EmployeeProjects> emp_ProId;

    public Project() {
        super();
    }

    public Project(long project_id, String title) {
        this.project_id = project_id;
        this.title = title;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
