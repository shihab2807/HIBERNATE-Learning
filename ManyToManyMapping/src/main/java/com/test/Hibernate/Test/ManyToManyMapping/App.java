package com.test.Hibernate.Test.ManyToManyMapping;

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
//		Books b=new Books();
//		b.setB_id(101);
//		b.setB_name("DaVinciCode");
//		b.setB_price(800);
//
//		Books b1=new Books();
//		b1.setB_id(102);
//		b1.setB_name("Angels and Demons");
//		b1.setB_price(1200);
//
//		List<Books> book=new ArrayList<Books>();
//		book.add(b);
//		book.add(b1);
//
//		Student s=new Student();
//		s.setS_id(81);
//		s.setS_name("Ganesh");
//
//		Student s1=new Student();
//		s1.setS_id(82);
//		s1.setS_name("Ram");
//
//		List<Student> stu=new ArrayList<Student>();
//		stu.add(s);
//		stu.add(s1);
//
//
//		b.setsList(stu);
//		s.setbList(book);
//		b1.setsList(stu);
//		s1.setbList(book);


		Configuration cfg=new Configuration().configure().addAnnotatedClass(Books.class).addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
//		sess.save(b);
//		sess.save(s);
//		sess.save(b1);
//		sess.save(s1);
//		trans.commit();
		        
		        Student stu=sess.get(Student.class, 82);
		        System.out.println(stu);
//		       List<Books> bList=stu.getbList();
//		       for(Books b:bList) {
//		    	   System.out.println(b.getB_id()+" "+b.getB_name()+" "+b.getB_price()+" "+b.getsList());
//		    	   System.out.println(b);
//		    	   
//		       }


	}
}
