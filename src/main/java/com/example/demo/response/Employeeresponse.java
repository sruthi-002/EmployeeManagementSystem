package com.example.demo.response;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Employeeresponse {
    private long empId;
    private String name;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employeeresponse(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employeeresponse() {
        super();
    }
}
