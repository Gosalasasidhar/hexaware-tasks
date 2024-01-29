package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Listing {
	
	@Id
	private int listingId;
	private String profile;
	private String department;
	private String location;
	private int experienceReqFrom;
	private int experienceReqTo;
	private double salary;
	private LocalDate postDate;
	@ElementCollection
	private List<String> reqSkills;
	private String jd;
	private String benefitsProvided;
	public Listing(int listingId, String profile, String department, String location, int experienceReqFrom,
			int experienceReqTo, double salary, LocalDate postDate, String jd, String benefitsProvided) {
		super();
		this.listingId = listingId;
		this.profile = profile;
		this.department = department;
		this.location = location;
		this.experienceReqFrom = experienceReqFrom;
		this.experienceReqTo = experienceReqTo;
		this.salary = salary;
		this.postDate = postDate;
		this.jd = jd;
		this.benefitsProvided = benefitsProvided;
	}
	public int getListingId() {
		return listingId;
	}
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperienceReqFrom() {
		return experienceReqFrom;
	}
	public void setExperienceReqFrom(int experienceReqFrom) {
		this.experienceReqFrom = experienceReqFrom;
	}
	public int getExperienceReqTo() {
		return experienceReqTo;
	}
	public void setExperienceReqTo(int experienceReqTo) {
		this.experienceReqTo = experienceReqTo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getPostDate() {
		return postDate;
	}
	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}
	public List<String> getReqSkills() {
		return reqSkills;
	}
	public void setReqSkills(List<String> reqSkills) {
		this.reqSkills = reqSkills;
	}
	public String getJd() {
		return jd;
	}
	public void setJd(String jd) {
		this.jd = jd;
	}
	public String getBenefitsProvided() {
		return benefitsProvided;
	}
	public void setBenefitsProvided(String benefitsProvided) {
		this.benefitsProvided = benefitsProvided;
	}
	
	

}
