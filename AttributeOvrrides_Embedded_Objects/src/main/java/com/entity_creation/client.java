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
	    	priest.setPriestName("Priest7");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(54893);
	    	priest.setSalary(70000.0);
	    	priest.setEmail("priest7@gmail.com");
	    	
	    	Address HomeAddress= new Address();
	    	HomeAddress.setCity("Banglore");
	    	HomeAddress.setState("Karnataka");
	    	HomeAddress.setStreet("2nd cross");
	    	HomeAddress.setPincode(560091L);
	    	
	    	Address OfficeAddress= new Address();
	    	OfficeAddress.setCity("Banglore");
	    	OfficeAddress.setState("Karnataka");
	    	OfficeAddress.setStreet("2nd cross");
	    	OfficeAddress.setPincode(560091L);
	    	
	    	priest.setHomeAddress(HomeAddress);
	    	priest.setOfficeAddress(OfficeAddress);
	    	
	    	
	    	
	    	return priest;
	    }
	
}
