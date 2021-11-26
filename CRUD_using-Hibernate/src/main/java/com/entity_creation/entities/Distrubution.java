package com.entity_creation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Table(name="distrubution")
public class Distrubution {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Distrubution_id")
	private int Id;
	
	@Column(name="Date_of_Distrubution")
	private Date DateofDistrubution;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Priest priest;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Distrubution_Detail> distrubution_detail = new ArrayList();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDateofDistrubution() {
		return DateofDistrubution;
	}
	public void setDateofDistrubution(Date dateofDistrubution) {
		DateofDistrubution = dateofDistrubution;
	}
	
	public Priest getPriest() {
		return priest;
	}
	
	public void setPriest(Priest priest) {
		this.priest = priest;
	}
	
	public List<Distrubution_Detail> getDistrubution_detail() {
		return distrubution_detail;
	}
	
	public void setDistrubution_detail(List<Distrubution_Detail> distrubution_detail) {
		this.distrubution_detail = distrubution_detail;
	}
	@Override
	public String toString() {
		return "Distrubution [Id=" + Id + ", DateofDistrubution=" + DateofDistrubution + ", priest=" + priest
				+ ", distrubution_detail=" + distrubution_detail + "]";
	}
	
	

}
