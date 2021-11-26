package com.entity_creation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
@Table(name="Prasadam_Type")
public class PrasadamType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="name")
	private String Name;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Prasadam prasadam;

	public int getId() {
		return Id;
	}
	


	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public Prasadam getPrasadam() {
		return prasadam;
	}
	
	public void setPrasadam(Prasadam prasadam) {
		this.prasadam = prasadam;
	}

	@Override
	public String toString() {
		return "PrasadamType [Id=" + Id + ", Name=" + Name + ", prasadam=" + prasadam + "]";
	}
	
	

}
