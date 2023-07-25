package com.test.Hibernate.Test.OrderFood;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderFood {

	@Id
	private int o_id;
	private String o_name;
	private int o_price;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public int getO_price() {
		return o_price;
	}
	public void setO_price(int o_price) {
		this.o_price = o_price;
	}
	@Override
	public String toString() {
		return "OrderFood [o_id=" + o_id + ", o_name=" + o_name + ", o_price=" + o_price + "]";
	}


}
