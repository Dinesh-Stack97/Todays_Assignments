package com.entity_creation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
@Table(name="responsibility")
public class Responsibility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_id")
	private int Id;
	
	@Column(name="person_Responsible")
	private String Name;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Priest> priest = new ArrayList<>();

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

	@Override
	public String toString() {
		return "Responsibility [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
	
	

}
