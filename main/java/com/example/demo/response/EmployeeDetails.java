package com.example.demo.response;

public class EmployeeDetails {
    private String name;
    private int amount;
    private String team;

    public EmployeeDetails(String name, int amount, String team) {
        this.name = name;
        this.amount = amount;
        this.team = team;
    }

    public EmployeeDetails() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
