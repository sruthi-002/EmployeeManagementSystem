package com.example.demo.Service;

import com.example.demo.Model.Team;
import com.example.demo.Repo.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;
    public Team add_team(Team team) {
        return teamRepo.save(team);
    }

    public List<Team> all() {
        return teamRepo.findAll();
    }
}
