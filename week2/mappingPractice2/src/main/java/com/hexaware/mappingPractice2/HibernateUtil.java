package com.hexaware.mappingPractice2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HibernateUtil {
	private static final SessionFactory sessionFactory;
static
{
	//collecting raw data from xml
	StandardServiceRegistry standardRegistry=new StandardServiceRegistryBuilder()
														.configure("hibernate.cfg.xml")
														.build();


	//collecting useful dataa
	Metadata metadata=new MetadataSources(standardRegistry)
							.getMetadataBuilder()
							.build();
	
	
	sessionFactory=metadata.getSessionFactoryBuilder().build();
	
}
public static SessionFactory getSessionFactory()
{
	return sessionFactory;
}







}
