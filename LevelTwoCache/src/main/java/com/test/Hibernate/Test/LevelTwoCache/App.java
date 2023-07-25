package com.test.Hibernate.Test.LevelTwoCache;

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
//        Product p1=new Product();
//        p1.setP_id(101);
//        p1.setP_name("Soap");
//        p1.setP_price(30);
//        
//        Product p2=new Product();
//        p2.setP_id(102);
//        p2.setP_name("Shampoo");
//        p2.setP_price(10);
//        
//        Product p3=new Product();
//        p3.setP_id(103);
//        p3.setP_name("ToothBrush");
//        p3.setP_price(25);
//        
//        Product p4=new Product();
//        p4.setP_id(104);
//        p4.setP_name("ToothPaste");
//        p4.setP_price(40);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
        SessionFactory sf=cfg.buildSessionFactory();
        
        System.out.println("------------Product 1---------------");
        Session sess1=sf.openSession();
        Transaction trans1=sess1.beginTransaction();
        Product p1=sess1.get(Product.class, 101);
        System.out.println(p1);
        trans1.commit();
        sess1.close();
        
        System.out.println("------------Product 2---------------");
        Session sess2=sf.openSession();
        Transaction trans2=sess2.beginTransaction();
        Product p2=sess2.get(Product.class, 102);
        System.out.println(p2);
        trans2.commit();
        sess2.close();
        
        System.out.println("------------Product 3---------------");
        Session sess3=sf.openSession();
        Transaction trans3=sess3.beginTransaction();
        Product p3=sess3.get(Product.class, 102);
        System.out.println(p3);
        trans3.commit();
        sess3.close();
        
        System.out.println("------------Product 4---------------");
        Session sess4=sf.openSession();
        Transaction trans4=sess4.beginTransaction();
        Product p4=sess4.get(Product.class, 104);
        System.out.println(p4);
        trans4.commit();
        sess4.close();
        
//        sess.save(p1);
//        sess.save(p2);
//        sess.save(p3);
//        sess.save(p4);
    }
}
