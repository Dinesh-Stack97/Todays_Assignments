package com.entity_creation;
import org.hibernate.Session;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	 String SQL = "SELECT version();";
	    	String result = (String) session.createNativeQuery(SQL).getSingleResult();
	    	System.out.println("Mysql version is:::");
	    	System.out.println(result);
	    	 
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	}



