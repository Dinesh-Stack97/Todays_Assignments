package com.entity_creation;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity_creation.entities.Address;
import com.entity_creation.entities.Priest;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	getPriestAddressById(session);
	    
     
	    }
	    
	

	     
	    
	    }
		private static void getPriestAddressById(Session session) {
			// TODO Auto-generated method stub
			 try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
		    	 
			
			
		}

	
			
}

			
		

		
			
		

