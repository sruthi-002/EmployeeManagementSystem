package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private long id;
    @Column(name = "roles")
    private String roles;


    public Role() {
        super();
    }

    public Role(long id, String role) {
        this.id = id;
        this.roles = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return roles;
    }

    public void setRole(String roles) {
        this.roles = roles;
    }
}
