package com.Crud.Apk.dao.impl;


import org.hibernate.Session;

import com.Crud.Apk.dao.PriestDao;
import com.entity_creation.Hibernate_session_factry;
import com.entity_creation.entities.Priest;

public  class priestDaoImpl implements PriestDao {

	@Override
	public void AddPriestRecord(Priest priest) {
		// TODO Auto-generated method stub
	    try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    
	          
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

		
		
	

	@Override
	public void FetchPriestInfobyId(int priestId) {
		// TODO Auto-generated method stub
	    try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
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
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }

		
	

	@Override
	public void updatePriestById(int priestId, Double Salary) {
		// TODO Auto-generated method stub
	    try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
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
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }

		
	

	@Override
	public void deletePriestRecord(int priestId) {
		// TODO Auto-generated method stub
	    try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
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
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }

		
	}





	


