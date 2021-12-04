package com.example.app.model;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Venue extends AbstractEntity {

	private String name;
	private String streeAddress1;
	private String streeAddress2;
	private String city;
	private String state;
	private String country;
	private String postalCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreeAddress1() {
		return streeAddress1;
	}

	public void setStreeAddress1(String streeAddress1) {
		this.streeAddress1 = streeAddress1;
	}

	public String getStreeAddress2() {
		return streeAddress2;
	}

	public void setStreeAddress2(String streeAddress2) {
		this.streeAddress2 = streeAddress2;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Venue) obj).getId());
	}
}
