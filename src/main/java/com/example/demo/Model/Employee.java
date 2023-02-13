package com.example.demo.Model;

import java.util.List;

import com.example.demo.response.Employeeskills;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;
	@Column(name="emp_name")
	private String name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="employee")
	private List<Employeeskills> employeeskills;
	private long department_id;


	private long desigination_id;

	public Employee(long empId, String name, List<Employeeskills> employeeskills, long department_id, long desigination_id) {
		this.empId = empId;
		this.name = name;
		this.employeeskills = employeeskills;
		this.department_id = department_id;
		this.desigination_id = desigination_id;
	}

	public long getDesigination_id() {
		return desigination_id;
	}

	public void setDesigination_id(long desigination_id) {
		this.desigination_id = desigination_id;
	}

	public long getDepartment_id() {
		return department_id;
	}

	public void setDepartment(long d) {
		this.department_id = d;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employeeskills> getEmployeeskills() {
		return employeeskills;
	}
	public void setEmployeeskills(List<Employeeskills> employeeskills) {
		this.employeeskills = employeeskills;
	}
	public Employee() {
		super();
	}
}
