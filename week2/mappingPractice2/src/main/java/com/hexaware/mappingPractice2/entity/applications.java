package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class applications {

	@Id
	private int applicationId;
	private String companyName;
	private String profile;
	private LocalDate applicationDate;
	private String status;
	private String coverLetter;
	
	
	
	public applications() {
		super();
	}



	public applications(int seekerId, String companyName, String profile, LocalDate applicationDate, String status,
			String coverLetter) {
		super();
		this.applicationId = seekerId;
		this.companyName = companyName;
		this.profile = profile;
		this.applicationDate = applicationDate;
		this.status = status;
		this.coverLetter = coverLetter;
	}



	public int getSeekerId() {
		return applicationId;
	}



	public void setSeekerId(int seekerId) {
		this.applicationId = seekerId;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getProfile() {
		return profile;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}



	public LocalDate getApplicationDate() {
		return applicationDate;
	}



	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCoverLetter() {
		return coverLetter;
	}



	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	
	
}
