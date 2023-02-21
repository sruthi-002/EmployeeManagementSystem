package com.example.demo.response;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProjectResponse {

    private long project_id;
    private String project_title;
    private Date start_date;
    private Date end_date;

    private List<EmployeeDetails> details;

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public String getProject_title() {
        return project_title;
    }

    public void setProject_title(String project_title) {
        this.project_title = project_title;
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

    public ProjectResponse(long project_id, String project_title, Date start_date, Date end_date, List<EmployeeDetails> details) {
        this.project_id = project_id;
        this.project_title = project_title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.details = details;
    }

    public ProjectResponse() {
        super();
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<EmployeeDetails> getDetails() {
        return details;
    }

    public void setDetails(List<EmployeeDetails> details) {
        this.details = details;
    }
}
