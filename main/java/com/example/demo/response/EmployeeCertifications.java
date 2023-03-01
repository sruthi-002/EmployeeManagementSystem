package com.example.demo.response;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_certifications")
public class EmployeeCertifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "empId")
    private long employee;

    @Column(name = "cert_id")
    private long certId;

    public EmployeeCertifications(long id, long employee, long certId) {
        this.id = id;
        this.employee = employee;
        this.certId = certId;
    }

    public EmployeeCertifications() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployee() {
        return employee;
    }

    public void setEmployee(long employee) {
        this.employee = employee;
    }

    public long getCertId() {
        return certId;
    }

    public void setCertId(long certId) {
        this.certId = certId;
    }
}
