package com.hibernate.basics.Hibernate_Basics;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
    	 
    	 String SQL = "SELECT Version();";
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
