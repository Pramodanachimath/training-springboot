package com.bookapp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Adress {

	@Id
	@GeneratedValue(generator = "adress_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "adress_gen",sequenceName = "address_sequence",initialValue = 10,allocationSize = 1)
	private Integer adressId;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	public Adress() {
		super();
	}
	public Adress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Integer getAddressId() {
		return adressId;
	}
	public void setAddressId(Integer addressId) {
		this.adressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adress [addressId=" + adressId + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
