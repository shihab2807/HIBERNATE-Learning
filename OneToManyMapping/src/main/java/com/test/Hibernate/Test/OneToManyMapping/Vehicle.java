package com.test.Hibernate.Test.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	private int vId;
	private String vName;
	
	@ManyToOne
	private Person per;
	
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + "]";
	}


}
