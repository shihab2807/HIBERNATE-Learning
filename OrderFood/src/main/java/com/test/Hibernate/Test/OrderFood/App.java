package com.test.Hibernate.Test.OrderFood;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OrderFood of1=new OrderFood();
        of1.setO_id(101);
        of1.setO_name("Dosa");
        of1.setO_price(50);
        
        OrderFood of2=new OrderFood();
        of2.setO_id(102);
        of2.setO_name("Poori");
        of2.setO_price(40);
        
        OrderFood of3=new OrderFood();
        of3.setO_id(103);
        of3.setO_name("Idly");
        of3.setO_price(30);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(OrderFood.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction trans=sess.beginTransaction();
//        sess.save(of1);
//        sess.save(of2);
//        sess.save(of3);
        
//        Query query=sess.createQuery("from OrderFood");
//        Query query=sess.createQuery("from OrderFood where o_id=101");
//        Query query=sess.createQuery("from OrderFood group by o_id");
//        Query query=sess.createQuery("from OrderFood order by o_price");
        
        SQLQuery query= sess.createNativeQuery("Select * from OrderFood",OrderFood.class);
//       SQLQuery query= sess.createSQLQuery("select * from OrderFood");
        
        List<OrderFood> oList=query.list();
        for(OrderFood o:oList) {
        	System.out.println(o);
        }
        
        trans.commit();
        sess.close();
        
    }
}
