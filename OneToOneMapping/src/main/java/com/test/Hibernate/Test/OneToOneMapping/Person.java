package com.test.Hibernate.Test.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int p_Id;
	private String p_Name;
	private long p_Contact;

	@OneToOne
	private UniqueAuthority uidai;


	public UniqueAuthority getUidai() {
		return uidai;
	}
	public void setUidai(UniqueAuthority uidai) {
		this.uidai = uidai;
	}
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	public String getP_Name() {
		return p_Name;
	}
	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}
	public long getP_Contact() {
		return p_Contact;
	}
	public void setP_Contact(long p_Contact) {
		this.p_Contact = p_Contact;
	}


}
