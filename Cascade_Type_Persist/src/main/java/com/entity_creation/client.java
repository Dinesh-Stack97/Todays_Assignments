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
	     try(
	    		 
	    		 
	    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	           Laptop laptop = new Laptop();
	           laptop.setLid(1);
	           laptop.setLname("Dell");
	           
	           Student student = new Student();
	           student.setRollno(1);
	           student.setName("Dinesh");
	           student.setMarks(60);
	           
	           student.getLaptop().add(laptop);
	    	
	            session.persist(student);
	          //  session.save(laptop);
	            session.getTransaction().commit();
	    }
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	
}
