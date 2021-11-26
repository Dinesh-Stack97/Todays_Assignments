package com.entity_creation;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

import com.entity_creation.entities.Priest;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	//CreatePriestRecord(session);
	    	//getPriestInfobyId(session);
	    	//updatePriestById(session);
	    	 deletePriestRecord(session);
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }

		private static void deletePriestRecord(Session session) {
			// TODO Auto-generated method stub
			Priest priest = session.get(Priest.class, 20);
			if(priest!= null)
			{
				session.beginTransaction();
				session.delete(priest);
				session.getTransaction().commit();
			}
			else
			{
				System.out.println("Employee doesnt exist for provided id");
			}
			
		}

		private static void updatePriestById(Session session) {
			// TODO Auto-generated method stub
			Priest priest = session.get(Priest.class, 1);
			if(priest != null) {
				priest.setSalary(1000.0);
				session.beginTransaction();
				
				session.update(priest);
				session.getTransaction().commit();
			}
			else
			{
				System.out.println("Priest record doesnt exits");
			}
			
			
		}

		private static void getPriestInfobyId(Session session) {
			// TODO Auto-generated method stub
			Priest priest = session.get(Priest.class, 1);
			if(priest != null)
			{
				System.out.println(priest);
			}
			else
			{
				System.out.println("Priest doesnt exits with provided id");
			}
			
		}

		private static void CreatePriestRecord(Session session) {
			Priest priest = getPriest();
	    
          
	    	session.beginTransaction();
	    	 Integer id = (Integer) session.save(priest);//-->it IS SERIALIZABLE THAT IS RETURN TYPE IS INT AND IT CAN BE TYPECAST TO INT AND RETURNS GENERATED PRIMARY KEY
	    	System.out.println("Priest record creaated with id: "+id);
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	
	    
	    	session.getTransaction().commit();
		}
	    


		private static Priest getPriest() {
	    	Priest priest = new Priest();
	    	priest.setPriestName("Priest2");
	    	priest.setDateOfoin(new Date());
	    	priest.setLocker_number(54344);
	    	priest.setSalary(2000.0);
	    	priest.setEmail("priest1@gmail.com");
	    	
	    	return priest;
	    }
	
}
