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
	    	 
	    	Priest priest = getPriest();
	    
         
	    	session.beginTransaction();
	    	 Integer id = (Integer) session.save(priest);//-->it IS SERIALIZABLE THAT IS RETURN TYPE IS INT AND IT CAN BE TYPECAST TO INT AND RETURNS GENERATED PRIMARY KEY
	    	System.out.println("Priest record creaated with id: "+id);
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	
	    	session.getTransaction().commit();
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	   

	

		private static Priest getPriest() {
	    	Priest priest = new Priest();
	    	priest.setPriestName("Priest15");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(588946);
	    	priest.setSalary(60000.0);
	    	priest.setEmail("priest15@gmail.com");
	    	
	    	Address address1= new Address();
	    	address1 .setCity("manglore");
	    	address1.setState("Karnataka");
	    	address1.setStreet("2nd cross");
	    	address1.setPincode(560091L);
	    	
	    	
	    	
	 priest.setAddress(address1);
	    	
	    	
	    	return priest;
	    }
	
}
