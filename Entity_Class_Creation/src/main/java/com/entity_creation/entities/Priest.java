package com.entity_creation.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Priest_Table")
public class Priest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "priest_id")
	private Integer priestId;
	
	@Column(name = "priest_name",length = 100,nullable = false)
	private String priestName;
	
	@Column(name = "email",unique = true)
	private String email;
	
	@Column(name = "date_Of_join")
	private Date DateOfjoin;
	
	@Column(name = "locker_Number",unique = true)
	private int locker_number;
	
	@Column(name = "Salary")
	private Double salary;
	
	public Integer getPriestId() {
		return priestId;
	}
	public void setPriestId(Integer priestId) {
		this.priestId = priestId;
	}
	public String getPriestName() {
		return priestName;
	}
	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfoin() {
		return DateOfjoin;
	}
	public void setDateOfoin(Date dateOfoin) {
		DateOfjoin = dateOfoin;
	}
	public int getLocker_number() {
		return locker_number;
	}
	public void setLocker_number(int locker_number) {
		this.locker_number = locker_number;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		salary = salary;
	}
	

}
