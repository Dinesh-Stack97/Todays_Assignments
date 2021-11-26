package com.entity_creation.entities;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name="Priest_Table")
@DynamicUpdate
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
    private Address address;
	
	
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
		this.salary = salary;
	}
	
public void setAddress(Address address) {
	this.address = address;
}
public Address getAddress() {
	return address;
}
	@Override
	public String toString() {
		return "Priest [priestId=" + priestId + ", priestName=" + priestName + ", email=" + email + ", DateOfjoin="
				+ DateOfjoin + ", locker_number=" + locker_number + ", salary=" + salary + ", address=" + address + "]";
	}
	

}
