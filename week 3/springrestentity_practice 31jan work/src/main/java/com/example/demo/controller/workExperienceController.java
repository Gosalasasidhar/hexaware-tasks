package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.workExperience;
import com.example.demo.service.IWorkExperience;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/workexperience")
public class workExperienceController {
	
	@Autowired
	IWorkExperience service;
	

	
	@PostMapping("/add")
	public workExperience insertworkExperience(@RequestBody @Valid workExperience workExperience)
	{
		 return service.insert(workExperience);
	}
	@PutMapping("/update")
	public workExperience updateworkExperience(@RequestBody @Valid workExperience workExperience)
	{
		 return service.update(workExperience);
	}
	
	@GetMapping("/get/{we}")
	public workExperience getworkExperienceById(@PathVariable int we)
	{
		return service.getWorkExperience(we);
	}
	
	@GetMapping("/getall")
	public List<workExperience> getAll()
	{
		return service.getAllWorkExperiences();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteworkExperienceById(@PathVariable("id") int id)
	{
		return service.delete(id);
	}
	

	@GetMapping("/getbyyears")
	public List<workExperience> getByyEARS()
	{
		return service.selectByYears();
	}
	
	
}
