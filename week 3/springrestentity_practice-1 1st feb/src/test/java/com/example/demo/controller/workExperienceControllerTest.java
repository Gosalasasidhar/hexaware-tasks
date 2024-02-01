package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.workExperience;

@SpringBootTest
class workExperienceControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@Test
	@Disabled
	void testInsert() {
		workExperience w=new workExperience(106, "Hexaware", "get", LocalDate.parse("2006-08-15"), LocalDate.parse("2009-08-15"), 50000);
		
		workExperience w1=restTemplate.postForObject("http://localhost:8080/api/workexperience/add", w, workExperience.class);
		
		assertEquals(w.getWorkid(),w1.getWorkid());
	}

	@Test
	@Disabled
	void testUpdate() {
workExperience w=new workExperience(102, "Hexaware", "get", LocalDate.parse("2006-08-15"), LocalDate.parse("2009-08-15"), 50000);
		
		restTemplate.put("http://localhost:8080/api/workexperience/update", w);
		
		assertEquals(0,0);
		
	}

	@Test
	@Disabled
	void testDelete() {
		restTemplate.delete("http://localhost:8080/api/workexperience/delete/106");
		assertTrue(true);
		
	}

	@Test
	@Disabled
	void testGetWorkExperience() {
		workExperience w=restTemplate.getForObject("http://localhost:8080/api/workexperience/get/102", workExperience.class);
		assertEquals(102, w.getWorkid());
	}

	@Test
	void testGetAllWorkExperiences() {
		ResponseEntity<List> resoinse=restTemplate.getForEntity("http://localhost:8080/api/workexperience/getall", List.class);
		List<workExperience> list=resoinse.getBody();
		assertNotEquals(0, list.size());
	}

	@Test
	void testSelectByYears() {
	}

}
