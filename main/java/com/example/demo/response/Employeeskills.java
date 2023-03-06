package com.example.demo.response;

import com.example.demo.Model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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

	@Column(name="timestamp")
	private Date date=new Date();

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
