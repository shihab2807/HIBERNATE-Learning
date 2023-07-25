package com.test.Hibernate.Test.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		UniqueAuthority ua=new UniqueAuthority();
		ua.setU_Id(78320);
		ua.setU_Contact(987654234l);

		Person p=new Person();
		p.setP_Id(101);
		p.setP_Name("Tom");
		p.setP_Contact(809765746l);
		p.setUidai(ua);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(UniqueAuthority.class).addAnnotatedClass(Person.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
		sess.save(ua);
		sess.save(p);
		trans.commit();
	}
}
