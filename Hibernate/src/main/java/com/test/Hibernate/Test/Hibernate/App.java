package com.test.Hibernate.Test.Hibernate;

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
		
		Bar b=new Bar();
		b.setDrinkId(300);
		b.setDrinkName("Pepsi");
		b.setDrinkPrice(60);
		
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Bar.class);//Step 1
		SessionFactory sf= cfg.buildSessionFactory();//Step 2
		Session sess=sf.openSession();//Step 3
		Transaction trans=sess.beginTransaction();//Step 4
		sess.save(b);
		trans.commit();
		
	}
}
