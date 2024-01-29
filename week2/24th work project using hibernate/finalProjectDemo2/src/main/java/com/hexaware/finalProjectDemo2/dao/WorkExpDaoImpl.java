package com.hexaware.finalProjectDemo2.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.finalProjectDemo2.HibernateUtil;
import com.hexaware.finalProjectDemo2.entity.workExperience;


@Repository
public class WorkExpDaoImpl implements IworkExpDao {
	
	
	

	@Override
	public boolean insert(workExperience w) {
		
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session=sessionfactory.openSession();
		 Transaction txn=session.beginTransaction();
		
			 Serializable ser=session.save(w);
			 session.getTransaction().commit();
			 session.close();
			 if(ser!=null)
			 {
				 
				 return true;
				 
				 
			 }
			 else
			 {
				 return false;
				 
				 
			 }
			 
		 
		
	}

	@Override
	public boolean update(workExperience w) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = null;
		boolean isSuccess = false;

		try {
		    session = sessionFactory.openSession();
		    session.beginTransaction();

		    // Perform your save operation here
		    session.update(w);

		    session.getTransaction().commit();
		    isSuccess=true;
		} catch (Exception e) {
		    // Handle the exception, log it, or print the stack trace
			
		    e.printStackTrace();

		    // Rollback the transaction to avoid leaving the database in an inconsistent state
		    if (session != null && session.getTransaction() != null) {
		        session.getTransaction().rollback();
		    }
		} finally {
		    // Close the session to release resources
		    if (session != null && session.isOpen()) {
		        session.close();
		    }
		}

		

		return isSuccess;

		
	}

	@Override
	public boolean delete(String companyName) {
		boolean isSuccess=false;
		
		SessionFactory sessionFctory=HibernateUtil.getSessionFactory();
		Session session=null;
		
		try
		{
			session=sessionFctory.openSession();
			session.beginTransaction();
		
		workExperience w=session.get(workExperience.class, companyName);
		session.delete(w);
		session.getTransaction().commit();
		isSuccess=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
//			 if (session != null && session.getTransaction() != null) {
//			        session.getTransaction().rollback();
//			    }
		}
		finally
		{
			 if (session != null && session.isOpen()) {
			        session.close();
			    }
			}
		return isSuccess;
		}		

	@Override
	public workExperience getWorkExperience(String designation) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		
		workExperience w=session.get(workExperience.class, designation);
		session.close();
		return w;
	}

	@Override
	public List<workExperience> getAllWorkExperiences() {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		String Query="select * from workexperience";
		NativeQuery<workExperience> query=session.createNativeQuery(Query,workExperience.class);
		
		
		List<workExperience> list=query.list();
		session.close();
		return list;
	}

}
