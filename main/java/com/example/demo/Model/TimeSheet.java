package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "timesheet")
public class TimeSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="employee_id")
    private long employee_id;
    @Column(name = "project_id")
    private long project_id;
    @Column(name = "duration")
    private int duration;

    @Column(name = "date")
    private Date date=new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
