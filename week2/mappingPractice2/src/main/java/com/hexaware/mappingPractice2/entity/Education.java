package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Education_id;
	private String collegeName;
	private String degree;
	private String specialization;
	private LocalDate startdate;
	private LocalDate endDate;
	private double percentage;
	public Education(String collegeName, String degree, String specialization, LocalDate startdate, LocalDate endDate,
			double percentage) {
		super();
		this.collegeName = collegeName;
		this.degree = degree;
		this.specialization = specialization;
		this.startdate = startdate;
		this.endDate = endDate;
		this.percentage = percentage;
	}
	public int getEducation_id() {
		return Education_id;
	}
	public void setEducation_id(int education_id) {
		Education_id = education_id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Education [Education_id=" + Education_id + ", collegeName=" + collegeName + ", degree=" + degree
				+ ", specialization=" + specialization + ", startdate=" + startdate + ", endDate=" + endDate
				+ ", percentage=" + percentage + "]";
	}
	
	
	
	
	
	
	
}
