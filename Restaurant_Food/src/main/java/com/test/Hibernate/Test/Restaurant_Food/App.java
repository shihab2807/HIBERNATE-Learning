package com.test.Hibernate.Test.Restaurant_Food;

import java.util.ArrayList;
import java.util.List;

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
//		        Restaurant res1=new Restaurant();
//		        res1.setR_id(101);
//		        res1.setR_name("Udupi Hotel");
//		        res1.setR_address("B.G.Road");

//		    	 Restaurant res2=new Restaurant();
//		       res2.setR_id(102);
//		       res2.setR_name("G Foods");
//		       res2.setR_address("R.R.Nagar");

//		        Foods f1=new Foods();
//		        f1.setF_id(23);
//		        f1.setF_name("Poori");
//		        f1.setF_price(45);
//		        f1.setRest(res1);
//		        
//		        
//		        Foods f2=new Foods();
//		        f2.setF_id(34);
//		        f2.setF_name("Idly");
//		        f2.setF_price(30);
//		        f2.setRest(res1);
//		        
//		        Foods f3=new Foods();
//		        f3.setF_id(71);
//		        f3.setF_name("Dosa");
//		        f3.setF_price(40);
//		        f3.setRest(res1);
//		        
//		        List<Foods> fList=new ArrayList<Foods>();
//		        fList.add(f1);
//		        fList.add(f2);
//		        fList.add(f3);
//
//		        res1.setfList(fList);
		        
		       


		Configuration cfg=new Configuration().configure().addAnnotatedClass(Restaurant.class).addAnnotatedClass(Foods.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
//		        sess.save(res1);
//		        sess.save(f1);
//		        sess.save(f2);
//		        sess.save(f3);
		        

		        System.out.println("--------------Food 1----------------");
		        Foods sess1=sess.get(Foods.class, 23);
		        System.out.println(sess1);

		        System.out.println("--------------Food 2----------------");
		      Foods sess2=sess.get(Foods.class, 23);
		      System.out.println(sess2);

//		Restaurant res=sess.get(Restaurant.class, 101);
//		System.out.println(res);
		trans.commit();
		sess.close();
	}
}
