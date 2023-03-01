package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payroll_id")
    private long id;

    private long empId;
    @Column(name="salary")
    private long salary;

    public Payroll(long id, long empId, long salary) {
        this.id = id;
        this.empId = empId;
        this.salary = salary;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Payroll() {
        super();
    }
}
