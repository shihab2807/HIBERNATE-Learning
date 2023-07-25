package com.test.Hibernate.Test.EmploeeProject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
private int e_id;
private String e_name;
private int e_experience;
//private int p_id;

//public int getP_id() {
//	return p_id;
//}
//public void setP_id(int p_id) {
//	this.p_id = p_id;
//}
@ManyToMany
private List<Project> pList;

public List<Project> getpList() {
	return pList;
}
public void setpList(List<Project> pList) {
	this.pList = pList;
}
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public int getE_experience() {
	return e_experience;
}
public void setE_experience(int e_experience) {
	this.e_experience = e_experience;
}
@Override
public String toString() {
	return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_experience=" + e_experience +""
			+ ", pList=" + pList + "]";
}


}
