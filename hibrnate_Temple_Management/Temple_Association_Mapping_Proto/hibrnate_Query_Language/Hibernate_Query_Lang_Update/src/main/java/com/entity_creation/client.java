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
	    	 
	    	UpdatePriestRecord(session);
	    
     
	    }
	    
	

	     
	    }

		private static void UpdatePriestRecord(Session session) {
			// TODO Auto-generated method stub
			String newEmail= "newPriest@Gmal.com";
			int pid = 1;
			try
			{
				String HQL = "UPDATE Priest setemail=newEmail WHERE priestId=pid";
				Query query = session.createQuery(HQL);
				query.setParameter(0, newEmail);
				query.setParameter(1, pid);
			        session.beginTransaction();
			        int exeecuteUpdate = query.executeUpdate();
			        if(exeecuteUpdate>0)
			        {
			        	System.out.println(exeecuteUpdate+"Record updated");
			        }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}


			
}

			
		

		
			
		

