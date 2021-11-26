package com.entity_creation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Prasadam")
public class Prasadam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Prasadam_id")
	private int id;
	
	@Column(name="Prasadam_Name")
	private String Name;
	
	@Column(name="Prasadam_Price")
	private int Unitprice;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<PrasadamType> prasadamType = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getUnitprice() {
		return Unitprice;
	}

	public void setUnitprice(int unitprice) {
		Unitprice = unitprice;
	}
	
	public List<PrasadamType> getPrasadamType() {
		return prasadamType;
	}
	
	public void setPrasadamType(List<PrasadamType> prasadamType) {
		this.prasadamType = prasadamType;
	}
	

	@Override
	public String toString() {
		return "Prasadam [id=" + id + ", Name=" + Name + ", Unitprice=" + Unitprice + ", prasadamType=" + prasadamType
				+ "]";
	}
	
	
	
	
	

}
