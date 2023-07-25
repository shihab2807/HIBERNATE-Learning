package com.test.Hibernate.Test.Customer_Product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Customer {
	@Id
	private int c_id;
	private String c_name;
	private long c_contact;

	//@OneToOne(fetch = FetchType.LAZY)
	//private Product pro;
	//
	//public Product getPro() {
	//	return pro;
	//}
	//public void setPro(Product pro) {
	//	this.pro = pro;
	//}
	//-------------------------------------------------
	//@OneToMany(mappedBy = "cus",fetch = FetchType.EAGER)
	//private List<Product> pro=new ArrayList<Product>(); 
	//public List<Product> getPro() {
	//	return pro;
	//}
	//public void setPro(List<Product> pro) {
	//	this.pro = pro;
	//}
	//-------------------------------------------------
	@ManyToMany(mappedBy = "cList",fetch = FetchType.EAGER)
	private List<Product> pList=new ArrayList<Product>();
	
	public List<Product> getpList() {
		return pList;
	}
	public void setpList(List<Product> pList) {
		this.pList = pList;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_contact=" + c_contact + ", pList=" + pList + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public long getC_contact() {
		return c_contact;
	}
	public void setC_contact(long c_contact) {
		this.c_contact = c_contact;
	}


}
