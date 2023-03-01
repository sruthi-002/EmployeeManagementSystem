package com.example.demo.Controller;

import com.example.demo.Model.Skills;
import com.example.demo.Service.SkillService;
import com.example.demo.response.Employeeskills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/skills")
@RestController
public class SkillController {
    @Autowired
    private SkillService skillService;

    @PostMapping("")
    private Skills add_skill(@RequestBody Skills skill)
    {
        return skillService.add_skill(skill);
    }

    @GetMapping("")
    private List<Skills> all_skills()
    {
        return skillService.all_skills();
    }

    @PostMapping("/employee_skill")
    private List<Employeeskills> add(@RequestBody List<Employeeskills> employeeskills)
    {
        return skillService.add(employeeskills);
    }
}
