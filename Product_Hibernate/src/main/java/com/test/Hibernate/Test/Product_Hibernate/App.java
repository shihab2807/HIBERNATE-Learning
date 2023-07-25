package com.test.Hibernate.Test.Product_Hibernate;

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
		//        Product pro=new Product();
		//        pro.setP_id(101);
		//        pro.setP_name("Mobile");
		//        pro.setP_price(18000);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Product pro=sess.get(Product.class, 101);
		//  sess.save(pro);
		tr.commit();
		System.out.println(pro);    
	}
}
