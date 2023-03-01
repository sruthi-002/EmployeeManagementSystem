package com.example.demo.Model;

import com.example.demo.response.EmployeeCertifications;
import com.example.demo.response.EmployeeProjects;
import com.example.demo.response.Employeeskills;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;

	@Column(name="employee_id")
	private String employee_id;

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

	@OneToMany(cascade = CascadeType.ALL,mappedBy="employee")
	private List<EmployeeCertifications> employeeCertifications;
	private long departmentId;
	private long desiginationId;
	@Column(name="timestamp")
	private Date date=new Date();
	@OneToMany(cascade = CascadeType.ALL,mappedBy="empId")
	private List<EmployeeProjects> employeeprojects;

	@Column(name="Experience")
	private float experience;

	@Column(name="employment_type")
	private String employment_type;

	@Column(name="status")
	private String status;

	@Column(name = "password")
	private String password;
	@Column(name="city")
	private String city;
	@Column(name="address")
	private String address;

	@Column(name = "country")
	private String country;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_payroll_id")
	private Payroll payroll;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name ="user_roles", joinColumns = @JoinColumn (name="user_id"), inverseJoinColumns = @JoinColumn (name="role_id"))
	private Set<Role> roles=new HashSet<>();

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@Column(name="enabled")
	private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Employee(long empId, String employee_id, String fname, String lname, String email, LocalDate dob, LocalDate jdate, LocalDate ldate, List<Employeeskills> employeeskills, long department_id, long desigination_id, Date date, List<EmployeeProjects> employeeprojects, float experience, String employment_type, String status, Payroll payroll) {
		this.empId = empId;
		this.employee_id = employee_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.jdate = jdate;
		this.ldate = ldate;
		this.employeeskills = employeeskills;
		this.departmentId = department_id;
		this.desiginationId = desigination_id;
		this.date = date;
		this.employeeprojects = employeeprojects;
		this.experience = experience;
		this.employment_type = employment_type;
		this.status = status;
		this.payroll = payroll;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<EmployeeProjects> getEmployeeprojects() {
		return employeeprojects;
	}

	public void setEmployeeprojects(List<EmployeeProjects> employeeprojects) {
		this.employeeprojects = employeeprojects;
	}

	public Employee(long empId, String employee_id, String fname, String lname, String email, LocalDate dob, LocalDate jdate, LocalDate ldate, List<Employeeskills> employeeskills, long department_id, long desigination_id, Date date, List<EmployeeProjects> employeeprojects) {
		this.empId = empId;
		this.employee_id = employee_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.jdate = jdate;
		this.ldate = ldate;
		this.employeeskills = employeeskills;
		this.departmentId = department_id;
		this.desiginationId = desigination_id;
		this.date = date;
		this.employeeprojects = employeeprojects;
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

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getDesiginationId() {
		return desiginationId;
	}

	public void setDesiginationId(long desiginationId) {
		this.desiginationId = desiginationId;
	}
	
	public List<EmployeeCertifications> getEmployeeCertifications() {
		return employeeCertifications;
	}

	public void setEmployeeCertifications(List<EmployeeCertifications> employeeCertifications) {
		this.employeeCertifications = employeeCertifications;
	}

	public Employee() {
		super();
	}
}
