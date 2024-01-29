package com.hexaware.mappingPractice2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class resume {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resume_id;
	private String address;
	@ElementCollection
	private List<String> languages;
	@ElementCollection
	private List<String> skills;
	@ElementCollection
	private List<String> referenceLinks;
	@ElementCollection
	private List<String> accomplishments;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="resume_id")
	private List<WorkExperience> workExperience=new ArrayList<WorkExperience>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="resume_id")
	private List<Education> education=new ArrayList<Education>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="resume_id")
	private List<Certifications> certifications =new ArrayList<Certifications>();
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="resume_id")
	private List<Projects> projects=new ArrayList<Projects>();
	
	public resume() {
		super();
	}

	public resume(String address) {
		super();
		
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}


	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public int getResume_id() {
		return resume_id;
	}

	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}

	public List<Certifications> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certifications> certifications) {
		this.certifications = certifications;
	}

	@Override
	public String toString() {
		return "resume [resume_id=" + resume_id + ", address=" + address + ", workExperience=" + workExperience
				+ ", education=" + education + ", certifications=" + certifications + "]";
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getReferenceLinks() {
		return referenceLinks;
	}

	public void setReferenceLinks(List<String> referenceLinks) {
		this.referenceLinks = referenceLinks;
	}

	public List<String> getAccomplishments() {
		return accomplishments;
	}

	public void setAccomplishments(List<String> accomplishments) {
		this.accomplishments = accomplishments;
	}

	
	
	
	
}
