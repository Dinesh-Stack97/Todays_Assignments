package com.entity_creation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="distribution_Details")
public class Distrubution_Detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Distribution_Id")
	private int DistrubutionId;
	
	@Column(name="Prasadam_Id")
	private int PrasadamId;
	
	@Column(name="Unit_Price")
	private int unitPrice;
	
	@Column(name="quantity")
	private int Quantity;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Distrubution  distrubution;

	public int getDistrubutionId() {
		return DistrubutionId;
	}

	public void setDistrubutionId(int distrubutionId) {
		DistrubutionId = distrubutionId;
	}

	public int getPrasadamId() {
		return PrasadamId;
	}

	public void setPrasadamId(int prasadamId) {
		PrasadamId = prasadamId;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public Distrubution getDistrubution() {
		return distrubution;
	}
	public void setDistrubution(Distrubution distrubution) {
		this.distrubution = distrubution;
	}
	
	

}
