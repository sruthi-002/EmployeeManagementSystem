package com.example.demo.response;

import com.example.demo.Model.Payroll;

import java.time.LocalDate;
import java.util.List;

public class EmployeeResponseClass {

    private long empId;

    private String employee_id;

    private String fname;

    private String lname;


    private String email;

    private LocalDate dob;


    private LocalDate jdate;

    private LocalDate ldate;

    public EmployeeResponseClass() {
        super();
    }

    private List<String> employeeskills;
    private String department;
    private String desigination;
    private List<String> certifications;

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    private List<EmployeeProjectResponse> employeeprojects;

    private float experience;

    private String employment_type;

    private String status;

    private Payroll payroll;

    public EmployeeResponseClass(long empId, String employee_id, String fname, String lname, String email, LocalDate dob, LocalDate jdate, LocalDate ldate, List<String> employeeskills, String department, String desigination, List<String> certifications, List<EmployeeProjectResponse> employeeprojects, float experience, String employment_type, String status, Payroll payroll) {
        this.empId = empId;
        this.employee_id = employee_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.jdate = jdate;
        this.ldate = ldate;
        this.employeeskills = employeeskills;
        this.department = department;
        this.desigination = desigination;
        this.certifications = certifications;
        this.employeeprojects = employeeprojects;
        this.experience = experience;
        this.employment_type = employment_type;
        this.status = status;
        this.payroll = payroll;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getJdate() {
        return jdate;
    }

    public void setJdate(LocalDate jdate) {
        this.jdate = jdate;
    }

    public LocalDate getLdate() {
        return ldate;
    }

    public void setLdate(LocalDate ldate) {
        this.ldate = ldate;
    }

    public List<String> getEmployeeskills() {
        return employeeskills;
    }

    public void setEmployeeskills(List<String> employeeskills) {
        this.employeeskills = employeeskills;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesigination() {
        return desigination;
    }

    public void setDesigination(String desigination) {
        this.desigination = desigination;
    }

    public List<EmployeeProjectResponse> getEmployeeprojects() {
        return employeeprojects;
    }

    public void setEmployeeprojects(List<EmployeeProjectResponse> employeeprojects) {
        this.employeeprojects = employeeprojects;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getEmployment_type() {
        return employment_type;
    }

    public void setEmployment_type(String employment_type) {
        this.employment_type = employment_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }
}
