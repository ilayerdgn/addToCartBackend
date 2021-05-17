package com.proje.addToCart.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="Customers")
public class Customer {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	
	@Column(name="name")
	private String customerName;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="passw")
	private String passw;
	
	
	@Column(name="city")
	private String city;
	
	public Customer() {
		
	}

public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

public Customer(int customerId, String customerName, String surname, String mail, String passw, String contactName, String companyName,
		String city) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.surname = surname;
	this.mail=mail;
	this.passw=passw;
	this.city = city;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}



public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
};


}
