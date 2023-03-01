package com.example.demo.response;

import java.time.LocalDate;

public class PayrollResponse {
    private long empId;
    private String fname;
    private float ex;
    private long salary;
    private String type_of_employee;
    private String status;
    private LocalDate join_date;
    private String Department;

    public PayrollResponse() {
        super();
    }

    public PayrollResponse(long empId, String fname, float ex, long salary, String type_of_employee, String status, LocalDate join_date, String department) {
        this.empId = empId;
        this.fname = fname;
        this.ex = ex;
        this.salary = salary;
        this.type_of_employee = type_of_employee;
        this.status = status;
        this.join_date = join_date;
        Department = department;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getEx() {
        return ex;
    }

    public void setEx(float ex) {
        this.ex = ex;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getType_of_employee() {
        return type_of_employee;
    }

    public void setType_of_employee(String type_of_employee) {
        this.type_of_employee = type_of_employee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getJoin_date() {
        return join_date;
    }

    public void setJoin_date(LocalDate join_date) {
        this.join_date = join_date;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
