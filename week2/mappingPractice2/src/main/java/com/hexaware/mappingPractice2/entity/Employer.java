package com.hexaware.mappingPractice2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employer {
	@Id
	private int employerId;
	private String name;
	private String email;
	private String phno;
	private String address;
	private String companyName;
	private String token;
	public Employer() {
		super();
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employerId")
	private List<Listing> listing;
	public Employer(int employerId, String name, String email, String phno, String address, String companyName,
			String token) {
		super();
		this.employerId = employerId;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.companyName = companyName;
		this.token = token;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<Listing> getListing() {
		return listing;
	}
	public void setListing(List<Listing> listing) {
		this.listing = listing;
	}
	
}
