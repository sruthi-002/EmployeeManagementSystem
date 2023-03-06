package com.example.demo.Model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="desigination")
public class Desigination {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    @NonNull
    private long id;
    @Column(name = "des_id")
    private long designId;
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

    public Desigination(@NonNull long id, long designId, String design, Date date) {
        this.id = id;
        this.designId = designId;
        this.design = design;
        this.date = date;
    }

    public long getDesignId() {
        return designId;
    }

    public void setDesignId(long des_id) {
        this.designId = des_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
