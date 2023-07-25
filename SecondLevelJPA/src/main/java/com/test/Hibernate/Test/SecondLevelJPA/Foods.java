package com.test.Hibernate.Test.SecondLevelJPA;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Foods {
	@Id
	private int fId;
	private String fName;
	private int fPrice;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getfPrice() {
		return fPrice;
	}
	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}
	@Override
	public String toString() {
		return "Foods [fId=" + fId + ", fName=" + fName + ", fPrice=" + fPrice + "]";
	}

}
