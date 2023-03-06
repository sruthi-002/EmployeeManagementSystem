package com.example.demo.response;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name="employee_projects")
public class EmployeeProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="emp_id")
    private long empId;

    @Column(name="project_id")
    private long project_id;

    @Column(name="team_id")
    private long team_id;


    @Column(name="amount")
    private int amount;

    public EmployeeProjects(long id, long empId, long project_id, long team_id,int amount) {
        this.id = id;
        this.empId = empId;
        this.project_id = project_id;
        this.team_id = team_id;
        this.amount = amount;
    }

    public long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(long team_id) {
        this.team_id = team_id;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public EmployeeProjects() {
        super();
    }
}
