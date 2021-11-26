package com.entity_creation;
import java.io.Serializable;
import java.lang.module.Configuration;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.entity_creation.entities.Laptop;

import com.entity_creation.entities.Student;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(
	    		 
	    		 
	    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	
	    
         
	    	session.beginTransaction();
	    
	    	
	    	//session.persist(priest);//ITS RETURN TYPE IS VOID
	    	Query q = session.createQuery("from Student");
	    	Query q1 = session.createQuery("from Student where marks=50");
	    	
	    	//working with sql in hibernate
	    	Query query  = session.createSQLQuery("select * from student where marks=60");
	    	((NativeQuery) query).addEntity(Student.class);
	    	List<Student> students = query.list();
	    	for(Student o:students)
	    	{
	    		System.out.println(o);
	    	}
	    	
	    	
	    	Query q3 = session.createQuery("select rollno,maarks,name from Student where rollno=7");
	    	Object[] student = (Object[]) q3.uniqueResult();
	    	for(Object o: student)
	    	{
	    		System.out.println(o);
	    	}
	    	Student student1 = (Student) q1.uniqueResult();
	    	System.out.println(student1);
	    	List<Student>student11 =  q.list();
	    	for(Student s: student11)
	    	{
	    		System.out.println(s);
	    	}
	    	
	    
	            session.getTransaction().commit();
	    }
	     
		 catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }
	    
	
}
