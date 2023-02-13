package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private long id;
    @Column(name="project_title")
    private String title;
}
