package com.example.demo.Service;

import com.example.demo.Model.Desigination;
import com.example.demo.Repo.DesiginationRepo;
import com.example.demo.Service.Exception.DesignationNotFound;
import com.example.demo.Service.Exception.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesiginationService {
    @Autowired
    private DesiginationRepo desiginationRepo;
    public Desigination add_desigination(Desigination d ) {
        return desiginationRepo.save(d);
    }

    public List<Desigination> display_desigination() {
        return desiginationRepo.findAll();
    }

    public Desigination getdesignation(long id) {
        return desiginationRepo.findById(id).orElseThrow(() -> new DesignationNotFound("Designation with id: " + id + " is not found."));
    }
}
