package com.test.Hibernate.Test.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int s_id;
	private String s_name;

	@ManyToMany(mappedBy = "sList",fetch = FetchType.LAZY)
	private List<Books> bList=new ArrayList<Books>();

	public List<Books> getbList() {
		return bList;
	}
	public void setbList(List<Books> bList) {
		this.bList = bList;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", bList=" + bList + "]";
	}



}
