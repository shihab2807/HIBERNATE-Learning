package com.test.Hibernate.Test.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {

	@Id
	private int pId;
	private String pName;
	private long pContact;

	@OneToMany(mappedBy = "per")
	private List<Vehicle> vList=new ArrayList<Vehicle>();
	public int getpId() {
		return pId;
	}
	public List<Vehicle> getvList() {
		return vList;
	}
	public void setvList(List<Vehicle> vList) {
		this.vList = vList;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpContact() {
		return pContact;
	}
	public void setpContact(long pContact) {
		this.pContact = pContact;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + ", vList=" + vList + "]";
	}
}
