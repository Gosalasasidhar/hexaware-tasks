package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;


@Component
@Entity
public class workExperience {

	@Id
	@Min(100)
	private int workid;
	private String Company;
	private String designation;
	@Past
	private LocalDate start_date;
	@Past
	private LocalDate end_date;
	@Min(5000)
	private double salary;
	public workExperience() {
		super();
	}
	public workExperience(int workid,String company, String designation, LocalDate start_date, LocalDate end_date, double salary) {
		super();
		this.workid=workid;
		this.Company = company;
		this.designation = designation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.salary = salary;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		this.Company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "workExperience [Company=" + Company + ", designation=" + designation + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", salary=" + salary + "]";
	}
	public int getWorkid() {
		return workid;
	}
	public void setWorkid(int workid) {
		this.workid = workid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Company, designation, end_date, salary, start_date);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		workExperience other = (workExperience) obj;
		return Objects.equals(Company, other.Company) && Objects.equals(designation, other.designation)
				&& Objects.equals(end_date, other.end_date)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(start_date, other.start_date);
	}
	
	
	
	
	
}
