package com.entity_creation;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

import com.entity_creation.entities.Distrubution;
import com.entity_creation.entities.Distrubution_Detail;
import com.entity_creation.entities.Prasadam;
import com.entity_creation.entities.PrasadamType;
import com.entity_creation.entities.Priest;
import com.entity_creation.entities.Vehicle;
public class client {
	
	

	
	    public static void main( String[] args )
	    {
	     try(Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
	    	 
	    	//CreatePriestRecord(session);
	    	//getPriestInfobyId(session);
	    	//updatePriestById(session);
	    	//deletePriestRecord(session);
	    	 
	    	 session.beginTransaction();
	    	 
	    	 Distrubution_Detail distributionDetail = new Distrubution_Detail();
	    	 //distributionDetail.setDistrubutionId(1);
	    	 distributionDetail.setPrasadamId(1);
	    	 distributionDetail.setQuantity(500);
	    	 distributionDetail.setUnitPrice(5000);
	    	 
	    	 Distrubution distribution = new Distrubution();
	    	// distribution.setId(1);
	    	 distribution.setDateofDistrubution(new Date());
	    	 distribution.getDistrubution_detail().add(distributionDetail);
	    	 
	    	PrasadamType prasadamType =new PrasadamType();
	    	//prasadamType.setId(1);
	    	prasadamType.setName("Laddu");
	    	
	    	
	    	Prasadam prasadam = new Prasadam();
	    	//prasadam.setId(1);
	    	prasadam.setName("Sweet");
	    	prasadam.getPrasadamType().add(prasadamType);
	    	prasadam.setUnitprice(30);
	    	
	    	Vehicle vehicle = new Vehicle();
	    //	vehicle.setId(1);
	    	vehicle.setBrand("Innova");
	    	vehicle.setColor("Red");
	    	vehicle.setInsurane_Validity(new Date());
	    	vehicle.setIsInsured(true);
	    	vehicle.setNumer("5547");
	    	
	    	
	    	Priest priest = new Priest();
	    	//priest.setPriestId(1);
	    	priest.setPriestName("Preist1");
	    	priest.setLocker_number(567845);
	    	priest.setDateOfoin(new Date());
	    	priest.setEmail("priest1@gmail.com");
	    	priest.getDistribution().add(distribution);
	    	priest.getVehicle().add(vehicle);
	    	
	    	session.persist(priest);
	    	session.getTransaction().commit();
	    	 
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	    }

	

	

		
		}

	
	    


	

