package com.test.Hibernate.Test.Restaurant_Food;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	private int r_id;
	private String r_name;
	private String r_address;

	@OneToMany(mappedBy = "rest",fetch = FetchType.EAGER)
	private List<Foods> fList=new ArrayList<Foods>();

	public List<Foods> getfList() {
		return fList;
	}
	public void setfList(List<Foods> fList) {
		this.fList = fList;
	}
	
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_address() {
		return r_address;
	}
	public void setR_address(String r_address) {
		this.r_address = r_address;
	}
	@Override
	public String toString() {
		return "Restaurant [r_id=" + r_id + ", r_name=" + r_name + ", r_address=" + r_address + "]";
	}

}
