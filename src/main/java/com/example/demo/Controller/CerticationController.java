package com.example.demo.Controller;

import com.example.demo.Model.Certifications;
import com.example.demo.Service.CertificationService;
import com.example.demo.response.EmployeeCertifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CerticationController {
    @Autowired
    private CertificationService certificationService;
    @PostMapping("/add_certification")
    private Certifications add_certificate(@RequestBody Certifications certifications){
        return certificationService.add(certifications);
    }
    @PostMapping("/employee_certificate")
    private List<EmployeeCertifications> employeeCertifications(@RequestBody List<EmployeeCertifications> certifications){
        return certificationService.employee_certificate(certifications);
    }
}
