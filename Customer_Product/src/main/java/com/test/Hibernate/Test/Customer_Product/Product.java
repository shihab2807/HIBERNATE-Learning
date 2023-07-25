package com.test.Hibernate.Test.Customer_Product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Product {

	@Id
	private int p_id;
	private String p_name;
	//@ManyToOne(fetch = FetchType.LAZY)
	//private Customer cus;
	//
	//public Customer getCus() {
	//	return cus;
	//}
	//public void setCus(Customer cus) {
	//	this.cus = cus;
	//}
	//------------------------------------------------------------------------
	@ManyToMany
	private List<Customer> cList=new ArrayList<Customer>();
	
	public List<Customer> getcList() {
		return cList;
	}
	public void setcList(List<Customer> cList) {
		this.cList = cList;
	}
	//-------------------------------------------------------------------------
	//@OneToOne(fetch = FetchType.LAZY)
	//private Customer cust;
	//
	//public Customer getCust() {
	//	return cust;
	//}
	//public void setCust(Customer cust) {
	//	this.cust = cust;
	//}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + "]";
	}
}
