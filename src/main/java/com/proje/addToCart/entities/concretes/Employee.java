package com.proje.addToCart.entities.concretes;
import javax.persistence.*;
@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="title")
	private String title;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="hireDate")
	private String hireDate;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String name, String lastName, String title, String email, String pass,
			String hireDate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.lastName = lastName;
		this.title = title;
		this.email = email;
		this.pass = pass;
		this.hireDate = hireDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	

}
