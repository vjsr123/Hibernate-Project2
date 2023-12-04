package com.learn.project1.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class bike {
	@Id
	int bikeId;
	String brand;
	String colour;
	@OneToOne
	student1 stdnt;
	
	public bike() {
		
	}

	public bike(int bikeId, String brand, String colour, student1 stdnt) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.colour = colour;
		this.stdnt = stdnt;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public student1 getStdnt() {
		return stdnt;
	}

	public void setStdnt(student1 stdnt) {
		this.stdnt = stdnt;
	}
	
	
}
