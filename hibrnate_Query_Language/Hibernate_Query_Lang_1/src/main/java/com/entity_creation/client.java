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
	    	 
	    	
	    
         getAlPriestDetailsUsingHQL(session);
         getAllPriest(session);
        // getPriestById(session);
        getPriestByIdandEmail(session);
         //getPriestByIdandEmailByNamedParameter(session);
         //gertAllPriestByName(session);
         getAllPriestIdAndName(session);
  
	    }
	    
	

	     
	    }

		private static void getAllPriest(Session session) {
			// TODO Auto-generated method stub
			try
			{
				String HQL = "from Priest";
				Query<Priest> query = session.createQuery(HQL,Priest.class );
				
				List<Priest>list = query.list();
				list.forEach(System.out::println);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

		private static void getAllPriestIdAndName(Session session) {
			// TODO Auto-generated method stub
			try
			{
				String HQL = "SELECT priestId,email FROM Priest";
				Query query = session.createQuery(HQL);
				
				List<Object[]>list = query.list();
				for (Object[] objects : list)
				{
					Integer PriestId =(Integer) objects[0];
					String PriestName = (String) objects[1];
					System.out.println(PriestName+" "+PriestId);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}

		private static void gertAllPriestByName(Session session) {
			// TODO Auto-generated method stub
			try
			{
				String HQL = "SELECT priestName FROM Priest";
				Query<String> query = session.createQuery(HQL);
				
				
				query.list().forEach(System.out::println);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}

		

		private static void getPriestByIdandEmail(Session session) {
			// TODO Auto-generated method stub
			int pId = 1;
			String email="priest1@gmail.com";
			
			try
			{  //using named query
				String HQL = "from Priest WHERE priestId:pId AND email:email";
				Query<Priest> query = session.createQuery(HQL,Priest.class );
				
			query.setParameter(0, pId);
			query.setParameter(1, email);
			Priest priest = query.uniqueResult();
			System.out.println(priest);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

		private static void getPriestById(Session session) {
			// TODO Auto-generated method stub
			int empId=1;
			try
			{
				String HQL = "from Pries WHERE priestId=?";
				
				Query<Priest> query = session.createQuery(HQL,Priest.class );
				query.setParameter(0, empId);
	        		Priest priest =	query.uniqueResult();
	        		System.out.println(priest);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}

		private static void getAlPriestDetailsUsingHQL(Session session) {
			// TODO Auto-generated method stub
			try
			{
				String HQL = "from Priest";
				Query<Priest> query = session.createQuery(HQL,Priest.class );
				
				List<Priest>list = query.list();
				list.forEach(System.out::println);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
}
