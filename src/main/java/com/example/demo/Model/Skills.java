package com.example.demo.Model;

import java.util.List;

import com.example.demo.response.Employeeskills;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Skills")
public class Skills {
	@Id
	@Column(name="skill_id")
	private long sid;
	@Column(name="skill")
	private String skill;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")
	private List<Employeeskills> skills;
	public Skills() {
		super();
	}
	public Skills(long sid, String skill, List<Employeeskills> skills) {
		super();
		this.sid = sid;
		this.skill = skill;
		this.skills = skills;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public List<Employeeskills> getEmployeeskills() {
		return skills;
	}
	public void setEmployeeskills(List<Employeeskills> skills) {
		this.skills = skills;
	}
}
