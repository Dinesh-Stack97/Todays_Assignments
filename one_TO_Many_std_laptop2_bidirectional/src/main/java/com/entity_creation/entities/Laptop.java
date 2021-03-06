package com.entity_creation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	
	@ManyToOne()
	private Student student;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	

}
