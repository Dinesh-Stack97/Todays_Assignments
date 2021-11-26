package com.entity_creation;
import java.util.Date;

import org.hibernate.Session;

import com.entity_creation.entities.Priest;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	Priest priest = getPriest();
	    	session.beginTransaction();
	    	session.save(priest);
	    	session.getTransaction().commit();
	    	 
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	    private static Priest getPriest() {
	    	Priest priest = new Priest();
	    	priest.setPriestName("Priest1");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(54343);
	    	priest.setSalary(20000.0);
	    	priest.setEmail("priest@gmail.com");
	    	
	    	return priest;
	    }
	}



