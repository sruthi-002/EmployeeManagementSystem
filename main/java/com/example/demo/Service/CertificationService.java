package com.example.demo.Service;

import com.example.demo.Model.Certifications;
import com.example.demo.Repo.CertificationRepo;
import com.example.demo.Repo.EmployeeCertificationRepo;
import com.example.demo.response.EmployeeCertifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {
    @Autowired
    private CertificationRepo certificationRepo;
    @Autowired
    private EmployeeCertificationRepo employeeCertificationRepo;
    public Certifications add(Certifications certifications) {
        return certificationRepo.save(certifications);
    }

    public List<EmployeeCertifications> employee_certificate(List<EmployeeCertifications> certifications) {
        return employeeCertificationRepo.saveAll(certifications);
    }
}
