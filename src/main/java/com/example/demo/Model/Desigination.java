package com.example.demo.Model;

import com.example.demo.response.Employeeskills;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="desigination")
public class Desigination {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    @NonNull
    private long id;
    @Column(name="desigination_name")
    private String design;

    @Column(name="timestamp")
    private Date date=new Date();

    public Desigination(long id,  String design) {
        this.id = id;
        this.design = design;
    }

    public Desigination() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
