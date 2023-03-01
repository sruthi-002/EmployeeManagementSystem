package com.example.demo.Service;

import com.example.demo.Model.Skills;
import com.example.demo.Repo.EmployeeSkillRepo;
import com.example.demo.Repo.SkillRepo;
import com.example.demo.response.Employeeskills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepo skillRepo;

    @Autowired
    private EmployeeSkillRepo employeeSkillRepo;
    public Skills add_skill(Skills skill) {
        return skillRepo.save(skill);
    }

    public List<Skills> all_skills() {
        return skillRepo.findAll();
    }


    public List<Employeeskills> add(List<Employeeskills> employeeskills) {
        return employeeSkillRepo.saveAll(employeeskills);
    }
}
