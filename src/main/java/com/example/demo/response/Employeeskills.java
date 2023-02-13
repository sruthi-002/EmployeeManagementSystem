package com.example.demo.response;

import com.example.demo.Model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Employee_Skills")
public class Employeeskills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	@JsonIgnore
	private Employee employee;
	
	@Column(name="skill_id")
	private long skillId;

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public long getSkillId() {
		return skillId;
	}



	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}



	public Employeeskills(long id, long skillId) {
		super();
		this.id = id;
		this.skillId = skillId;
	}

	

	public Employeeskills() {
		super();
	}
}
