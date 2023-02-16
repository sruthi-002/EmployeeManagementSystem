package com.example.demo.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.Employeeskills;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Data
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;
	@Column(name="emp_firstname")
	private String fname;

	@Column(name="emp_lastname")
	private String lname;

	@Column(name="email")
	private String email;

	@Column(name="DOB")
	private LocalDate dob;

	@Column(name="joined_date")
	private LocalDate jdate;
	@Column(name="last_date")
	private LocalDate ldate;


	@OneToMany(cascade = CascadeType.ALL,mappedBy="employee")
	private List<Employeeskills> employeeskills;
	private long department_id;
	private long desigination_id;
	@Column(name="timestamp")
	private Date date=new Date();
	@OneToMany(cascade = CascadeType.ALL,mappedBy="emp_id")
	private List<EmployeeProjects> employeeprojects;
	public Employee(long empId, String fname, String lname, String email, LocalDate dob, LocalDate jdate, LocalDate ldate, List<Employeeskills> employeeskills, long department_id, long desigination_id) {
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.jdate = jdate;
		this.ldate = ldate;
		this.employeeskills = employeeskills;
		this.department_id = department_id;
		this.desigination_id = desigination_id;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getJdate() {
		return jdate;
	}

	public void setJdate(LocalDate jdate) {
		this.jdate = jdate;
	}

	public LocalDate getLdate() {
		return ldate;
	}

	public void setLdate(LocalDate ldate) {
		this.ldate = ldate;
	}

	public List<Employeeskills> getEmployeeskills() {
		return employeeskills;
	}

	public void setEmployeeskills(List<Employeeskills> employeeskills) {
		this.employeeskills = employeeskills;
	}

	public long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}

	public long getDesigination_id() {
		return desigination_id;
	}

	public void setDesigination_id(long desigination_id) {
		this.desigination_id = desigination_id;
	}

	public Employee() {
		super();
	}
}
