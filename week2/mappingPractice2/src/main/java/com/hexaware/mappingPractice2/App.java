package com.hexaware.mappingPractice2;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappingPractice2.HibernateUtil;
import com.hexaware.mappingPractice2.entity.Certifications;
import com.hexaware.mappingPractice2.entity.Education;
import com.hexaware.mappingPractice2.entity.Projects;
import com.hexaware.mappingPractice2.entity.WorkExperience;
import com.hexaware.mappingPractice2.entity.resume;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		/*
		 * WorkExperience w1=new WorkExperience("hexaware", "pget",
		 * LocalDate.parse("2002-08-21"), LocalDate.parse("2002-12-21"), 50000); resume
		 * r1=new resume("dno 8-86,sujathanagar"); r1.getWorkExperience().add(w1);
		 * WorkExperience w2=new WorkExperience("cognizant", "get",
		 * LocalDate.parse("2016-08-21"), LocalDate.parse("2020-12-21"), 50000);
		 * r1.getWorkExperience().add(w2)
		 */
		
		  resume r2=session.get(resume.class, 1); 
			/*
			 * r2.getEducation().add(new Education("raghu", "btech",
			 * "ece",LocalDate.parse("2019-08-23"), LocalDate.parse("2023-08-23"), 75 ));
			 * r2.getEducation().add(new Education("chaitanya", "inter",
			 * "mpc",LocalDate.parse("2017-06-23"), LocalDate.parse("2019-08-23"), 95 ));
			 */
		  
//		  r2.getCertifications().add(new Certifications(1, "Artificial intelligence", "learnt at college", LocalDate.parse("2022-09-29"), LocalDate.parse("2023-01-15"), "www.google.com"));
//		  r2.getCertifications().add(new Certifications(2, "machine learning", "learnt at home", LocalDate.parse("2020-09-29"), LocalDate.parse("2022-01-15"), "www.youtube.com"));
//		  session.update(r2);
//		 r2.getProjects().add(new Projects(11,"antenna array", "based on the software matlab",LocalDate.parse("2022-12-15"), LocalDate.parse("2023-05-15"), "www.rit.com", "www.iit.com"));
//		 r2.getProjects().add(new Projects("fire alarm", "based on the networks",LocalDate.parse("2022-12-15"), LocalDate.parse("2023-05-15"), "www.rit.com", "www.iit.com"));

		  
//		  r2.getAccomplishments().add("participated in many hackathons");
//		  r2.getAccomplishments().add("got managed many events");
		 

		 
		
		
		
		txn.commit();
		session.close();
    }
}
