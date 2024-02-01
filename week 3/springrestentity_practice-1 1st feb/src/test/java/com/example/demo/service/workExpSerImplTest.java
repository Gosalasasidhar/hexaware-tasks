package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.workExperience;

@SpringBootTest
class workExpSerImplTest {
	@Autowired
	IWorkExperience workexp;

	@Test
	@Disabled
	void testInsert() {
workExperience w=new workExperience(106, "Hexaware", "get", LocalDate.parse("2006-08-15"), LocalDate.parse("2009-08-15"), 50000);
		
		workExperience w1=workexp. insert(w);
		
		assertEquals(w.getWorkid(),w1.getWorkid());
	}

	@Test
	@Disabled
	void testUpdate() {
workExperience w=new workExperience(102, "accenture", "get", LocalDate.parse("2006-08-15"), LocalDate.parse("2009-08-15"), 50000);
		
		workExperience w1=workexp.  update(w);
		
		assertEquals("accenture",w1.getCompany());
		
	}

	@Test
	@Disabled
	void testDelete() {
		int wid=106;
		assertEquals("deleted", workexp.delete(wid));
	
	}

	@Test
	void testGetWorkExperience() {
		int wid=102;
		assertEquals("accenture", workexp.getWorkExperience(wid).getCompany());
		
	}

	@Test
	void testGetAllWorkExperiences() {
		assertNotNull(workexp.getAllWorkExperiences());
	}

}
