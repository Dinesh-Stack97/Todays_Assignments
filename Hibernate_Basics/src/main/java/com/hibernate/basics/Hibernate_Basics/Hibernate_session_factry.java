package com.hibernate.basics.Hibernate_Basics;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Hibernate_session_factry {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	static {
		try
		{
		if(sessionFactory== null) {
			new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metadataSources= new  MetadataSources(standardServiceRegistry);
			Metadata metadata = metadataSources.getMetadataBuilder().build();
			sessionFactory =  metadata.getSessionFactoryBuilder().build();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(standardServiceRegistry!=null)
			{
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
			
		}
	public static SessionFactory geSessionFactory() {
		return sessionFactory;
		
	}
	}


