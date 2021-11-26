package com.entity_creation;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

import com.entity_creation.entities.Address;
import com.entity_creation.entities.Priest;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	    	
	   
	    
	   

	

	
	    	Priest priest = new Priest();
	    	priest.setPriestName("Priest15");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(588946);
	    	priest.setSalary(60000.0);
	    	priest.setEmail("priest15@gmail.com");
	    	
	    	Address address1= new Address();
	    	address1 .setCity("pune");
	    	address1.setState("maharastrsa");
	    	address1.setStreet("2nd cross");
	    	address1.setPincode(560091L);
	    	
	    	Address address2= new Address();
	    	address2 .setCity("chennai");
	    	address2.setState("Tamil");
	    	address2.setStreet("2nd cross");
	    	address2.setPincode(560091L);
	    	
	    	priest.getAddressList().add(address1);
	    	priest.getAddressList().add(address2);
	    	
	            session.persist(priest);
	            session.getTransaction().commit();
	    }
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	
}
