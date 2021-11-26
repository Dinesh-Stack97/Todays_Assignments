package com.entity_creation.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="Vehicle_number")
	private String Numer;
	
	@Column(name="brand")
	private String Brand;
	
	@Column(name="color")
	private String Color;
	
	@Column(name="isinsured")
	private boolean  IsInsured;
	
	@Column(name="insurance_validity")
	private Date Insurane_Validity;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Priest priest;
    
	@Column(name="id")
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNumer() {
		return Numer;
	}

	public void setNumer(String numer) {
		Numer = numer;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public boolean isIsInsured() {
		return IsInsured;
	}

	public void setIsInsured(boolean isInsured) {
		IsInsured = isInsured;
	}

	public Date getInsurane_Validity() {
		return Insurane_Validity;
	}

	public void setInsurane_Validity(Date insurane_Validity) {
		Insurane_Validity = insurane_Validity;
	}

	public Priest getPriest() {
		return priest;
	}
	
	public void setPriest(Priest priest) {
		this.priest = priest;
	}
	
	@Override
	public String toString() {
		return "Vehicle [Id=" + Id + ", Numer=" + Numer + ", Brand=" + Brand + ", Color=" + Color + ", IsInsured="
				+ IsInsured + ", Insurane_Validity=" + Insurane_Validity + ", priest=" + priest + "]";
	}
	
	
	
	

}
