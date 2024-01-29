package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class JobSeeker {
	@Id
	private int seekerId;
	private String name;
	private String tagline;
	private String email;
	private String summary;
	private LocalDate dateOfBirth;
	private String phno;
	private String address;
	private String country;
	private int ctc;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="resume_id")
	private resume resume;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="seekerId")
	private List<applications> applications;

	public JobSeeker() {
		super();
	}

	public JobSeeker(int seekerId, String name, String tagline, String email, String summary, LocalDate dateOfBirth,
			String phno, String address, String country, int ctc) {
		super();
		this.seekerId = seekerId;
		this.name = name;
		this.tagline = tagline;
		this.email = email;
		this.summary = summary;
		this.dateOfBirth = dateOfBirth;
		this.phno = phno;
		this.address = address;
		this.country = country;
		this.ctc = ctc;
	}

	public int getSeekerId() {
		return seekerId;
	}

	public void setSeekerId(int seekerId) {
		this.seekerId = seekerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public resume getResume() {
		return resume;
	}

	public void setResume(resume resume) {
		this.resume = resume;
	}

	public List<applications> getApplications() {
		return applications;
	}

	public void setApplications(List<applications> applications) {
		this.applications = applications;
	}
	
	
	

}
