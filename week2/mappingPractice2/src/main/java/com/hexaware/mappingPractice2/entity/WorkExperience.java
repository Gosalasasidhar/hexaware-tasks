package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class WorkExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  workid;
	private String company_name;
	private String designation;
	private LocalDate start_date;
	private LocalDate end_date;
	private int salary;
	public WorkExperience(String company_name, String designation, LocalDate start_date, LocalDate end_date,
			int salary) {
		super();
		this.company_name = company_name;
		this.designation = designation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.salary = salary;
	}
	
	
	
	
}
