package com.entity_creation;



import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;



public class Hibernate_session_factry {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	static {
               
		//Creating stansdardErvice Registry builder
		StandardServiceRegistryBuilder  registrybuilder = new StandardServiceRegistryBuilder();
		
		//hibernate setting 
		 Map<String, String> dbSettings = new HashMap<>();
		 dbSettings.put(Environment.URL, "jdbc:mysql://localhost:3301/bloodBank");
		 dbSettings.put(Environment.USER, "root");
		 dbSettings.put(Environment.PASS, "root123");
		 dbSettings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		 dbSettings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		 
		 //Apply databaSE SETINGS
		 registrybuilder.applySettings(dbSettings);
		 //creating registry
		 standardServiceRegistry = registrybuilder.build();
		 //creating metadata source
		 MetadataSources sources = new MetadataSources(standardServiceRegistry);
		 //creating metadataa
		 Metadata metadata = sources.getMetadataBuilder().build();
		 //creating sessionfactory
		 sessionFactory = metadata.getSessionFactoryBuilder().build();
		 
			
		}
	public static SessionFactory geSessionFactory() {
		return sessionFactory;
		
	}
	}


