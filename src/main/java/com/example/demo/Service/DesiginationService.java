package com.example.demo.Service;

import com.example.demo.Model.Desigination;
import com.example.demo.Repo.DesiginationRepo;
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
}
