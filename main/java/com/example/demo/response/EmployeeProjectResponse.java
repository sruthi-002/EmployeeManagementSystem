package com.example.demo.response;

public class EmployeeProjectResponse {
    private String project_title;
    private int amount;
    private String team;



    public EmployeeProjectResponse() {
        super();
    }

    public EmployeeProjectResponse(String project_title, int amount, String team) {
        this.project_title = project_title;
        this.amount = amount;
        this.team = team;
    }

    public String getProject_title() {
        return project_title;
    }

    public void setProject_title(String project_title) {
        this.project_title = project_title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
