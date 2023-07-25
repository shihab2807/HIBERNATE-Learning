package com.test.Hibernate.Test.EmploeeProject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
private int p_id;
private String p_name;
private int p_duration;
//private int e_id;
//public int getE_id() {
//	return e_id;
//}
//public void setE_id(int e_id) {
//	this.e_id = e_id;
//}
@ManyToMany(mappedBy = "pList")
private List<Employee> eList;

public List<Employee> geteList() {
	return eList;
}
public void seteList(List<Employee> eList) {
	this.eList = eList;
}
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
public int getP_duration() {
	return p_duration;
}
public void setP_duration(int p_duration) {
	this.p_duration = p_duration;
}
@Override
public String toString() {
	return "Project [p_id=" + p_id + ", p_name=" + p_name + ", p_duration=" + p_duration + "]";
}


}
