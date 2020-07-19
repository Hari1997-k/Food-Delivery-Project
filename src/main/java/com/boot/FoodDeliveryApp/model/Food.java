package com.boot.FoodDeliveryApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fid;
	private String fname;
	private double price;
	private String description;
	private String image_url;

	public Food() {

	}

	public Food(int fid, String fname, double price, String description, String image_url) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.price = price;
		this.description = description;
		this.image_url = image_url;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

}
