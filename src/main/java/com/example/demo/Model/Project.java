package com.example.demo.Model;

import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.Employeeskills;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
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

    @Column(name="start_date")
    private Date start_date;

    @Column(name="end_date")
    private Date end_date;

    @Column(name="type_of_project")
    private String type_of_project;

    @Column(name="timestamp")
    private Date date=new Date();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "project_id")
    private List<EmployeeProjects> emp_ProId;


    public Project() {
        super();
    }

    public Project(long project_id, String title, Date start_date, Date end_date, List<EmployeeProjects> emp_ProId) {
        this.project_id = project_id;
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.emp_ProId = emp_ProId;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<EmployeeProjects> getEmp_ProId() {
        return emp_ProId;
    }

    public void setEmp_ProId(List<EmployeeProjects> emp_ProId) {
        this.emp_ProId = emp_ProId;
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
