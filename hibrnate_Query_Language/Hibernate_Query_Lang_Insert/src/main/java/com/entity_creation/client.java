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
	    	 
	    	insertPriestRecord(session);
	    
     
	    }
	    
	

	     
	    }

		private static void insertPriestRecord(Session session) {
			// TODO Auto-generated method stub
			try
			{
				String HQL = "INSERT INTO Priest(priestId,priestName,email,DateOfjoin,locker_number,salary)"+
			"SELECT priestName,email,DateOfjoin,locker_number,salary FROM BackupPriest.java";
				Query query = session.createQuery(HQL);
				session.beginTransaction();
				int executeUpdate = query.executeUpdate();
				if(executeUpdate >0)
				{
					System.out.println(executeUpdate+" records are inserted");
				}
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
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

	
			
}

			
		

		
			
		

