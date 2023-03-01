package com.example.demo.Model;

import com.example.demo.response.EmployeeCertifications;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="Certifications")
public class Certifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cert_id")
    private long certId;

    @Column(name = "certification")
    private String certificate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "certId")
    private List<EmployeeCertifications> certifications;
    public Certifications(long cert_id, String certificate) {
        this.certId = cert_id;
        this.certificate = certificate;
    }

    public long getId() {
        return certId;
    }

    public void setId(long cert_id) {
        this.certId = cert_id;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Certifications() {
        super();
    }
}
