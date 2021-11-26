package com.entity_creation;
import java.io.Serializable;
import java.lang.module.Configuration;
import java.util.Date;

import org.hibernate.Session;


import com.entity_creation.entities.Laptop;

import com.entity_creation.entities.Student;
public class client {
	
	

	
	    public static void main( String[] args ) {
	    Student student=null;
	    {
	     try(
	    		 
	    		 
	    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	       student = session.get(Student.class, 1);
	       System.out.println(student);
	          //  session.save(laptop);
	            session.getTransaction().commit();
	    }
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	     
	     student.setMarks(100);
	     try(
	    		 
	    		 
	    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	     Student  student2 = session.get(Student.class, 1);
	          session.merge(student);
	            session.getTransaction().commit();
	    }
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	    }
}
