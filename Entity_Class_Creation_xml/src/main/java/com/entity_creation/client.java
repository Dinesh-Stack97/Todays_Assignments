package com.entity_creation;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

import com.entity_creation.entities.Priest;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	Priest priest = getPriest();
	    
            Priest priest1 = getPreist1();
            
            Priest priest2 = getPreist2();
	    	session.beginTransaction();
	    	 Integer id = (Integer) session.save(priest);//-->it IS SERIALIZABLE THAT IS RETURN TYPE IS INT AND IT CAN BE TYPECAST TO INT AND RETURNS GENERATED PRIMARY KEY
	    	System.out.println("Priest record creaated with id: "+id);
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    	session.persist(priest1);
	    	
	    	session.saveOrUpdate(priest2);
	    	session.getTransaction().commit();
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	    private static Priest getPreist2() {
			// TODO Auto-generated method stub
	    	Priest priest2 = new Priest();
	    	priest2.setPriestName("Priest2");
	    	priest2.setDateOfoin(new Date());
	    	priest2.setLocker_number(54343);
	    	priest2.setSalary(20000.0);
	    	priest2.setEmail("priest@gmail.com");
			return priest2;
	    	
			
		}

		private static Priest getPreist1() {
			// TODO Auto-generated method stub
	    	Priest priest1 = new Priest();
	    	priest1.setPriestName("Priest2");
	    	priest1.setDateOfoin(new Date());
	    	priest1.setLocker_number(54343);
	    	priest1.setSalary(20000.0);
	    	priest1.setEmail("priest@gmail.com");
			return priest1;
		}

		private static Priest getPriest() {
	    	Priest priest = new Priest();
	    	priest.setPriestName("Priest2");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(54343);
	    	priest.setSalary(20000.0);
	    	priest.setEmail("priest@gmail.com");
	    	
	    	return priest;
	    }
	
}
