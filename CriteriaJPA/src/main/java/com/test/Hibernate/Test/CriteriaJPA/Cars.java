package com.test.Hibernate.Test.CriteriaJPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {
	@Id
	private int cId;
	private String cName;
	private int cPrice;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	@Override
	public String toString() {
		return "Cars [cId=" + cId + ", cName=" + cName + ", cPrice=" + cPrice + "]";
	}

}
