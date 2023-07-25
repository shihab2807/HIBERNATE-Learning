package com.test.Hibernate.Test.Restaurant_Food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Foods {
	@Id
	private int f_id;
	private String f_name;
	private int f_price;

	@ManyToOne
	private Restaurant rest;

	public Restaurant getRest() {
		return rest;
	}
	public void setRest(Restaurant rest) {
		this.rest = rest;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public int getF_price() {
		return f_price;
	}
	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	@Override
	public String toString() {
		return "Foods [f_id=" + f_id + ", f_name=" + f_name + ", f_price=" + f_price + ", rest=" + rest + "]";
	}

}
