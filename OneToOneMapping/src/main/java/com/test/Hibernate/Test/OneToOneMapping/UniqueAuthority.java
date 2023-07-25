package com.test.Hibernate.Test.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniqueAuthority {

	@Id
	private int u_Id;
	private long u_Contact;

	public int getU_Id() {
		return u_Id;
	}
	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}
	public long getU_Contact() {
		return u_Contact;
	}
	public void setU_Contact(long u_Contect) {
		this.u_Contact = u_Contect;
	}

}
