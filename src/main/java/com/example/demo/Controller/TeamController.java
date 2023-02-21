package com.example.demo.Controller;

import com.example.demo.Model.Team;
import com.example.demo.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
public class TeamController {
    @Autowired
    private TeamService service;

    @PostMapping("/add_team")
    private Team add_team(@RequestBody Team team)
    {
        return service.add_team(team);
    }
}
