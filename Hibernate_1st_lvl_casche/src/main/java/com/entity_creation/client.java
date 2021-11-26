package com.entity_creation;
import java.io.Serializable;
import java.lang.module.Configuration;
import java.util.Date;

import org.hibernate.Session;


import com.entity_creation.entities.Laptop;

import com.entity_creation.entities.Student;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	    	Student s = null;
	     try(
	    		 
	    		 
	    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	       s  = (Student)session.get(Student.class,1);
	       System.out.println(s);
	            session.getTransaction().commit();
	            session.close();
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	     try (
	            Session session2 =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	            	session2.beginTransaction();
	            	s = session2.get(Student.class, 1);
	            	System.out.println(s);
	            	session2.getTransaction().commit();
	            	session2.close();
	            }
	            
	    
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	
}
