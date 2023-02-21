package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="team_id")
    private long team_id;
    @Column(name = "team_name")
    private String team_name;

    public Team(long team_id, String team_name) {
        this.team_id = team_id;
        this.team_name = team_name;
    }

    public long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(long team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Team() {
        super();
    }
}
