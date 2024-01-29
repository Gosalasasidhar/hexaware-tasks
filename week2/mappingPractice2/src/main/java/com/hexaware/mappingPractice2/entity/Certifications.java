package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certifications {
	
	@Id
	private int certificationId;
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String certificateLink;
	public Certifications() {
		super();
	}
	public Certifications(int certificationId, String title, String description, LocalDate startDate, LocalDate endDate,
			String certificateLink) {
		super();
		this.certificationId = certificationId;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.certificateLink = certificateLink;
	}
	public int getCertificationId() {
		return certificationId;
	}
	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getCertificateLink() {
		return certificateLink;
	}
	public void setCertificateLink(String certificateLink) {
		this.certificateLink = certificateLink;
	}
	@Override
	public String toString() {
		return "Certifications [certificationId=" + certificationId + ", title=" + title + ", description="
				+ description + ", startDate=" + startDate + ", endDate=" + endDate + ", certificateLink="
				+ certificateLink + "]";
	}
	

}
