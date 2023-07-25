package com.test.Hibernate.Test.LevelOneCache;

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
//        User u1=new User();
//        u1.setU_id(101);
//        u1.setU_name("Ram");
//        u1.setU_password("Sita@123");
//        
//        User u2=new User();
//        u2.setU_id(102);
//        u2.setU_name("Krishna");
//        u2.setU_password("Radha@123");
//        
//        User u3=new User();
//        u3.setU_id(103);
//        u3.setU_name("Shiv");
//        u3.setU_password("Sathi@123");
//        
//        User u4=new User();
//        u4.setU_id(104);
//        u4.setU_name("Vishnu");
//        u4.setU_password("Lakshmi@123");
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
//        Transaction trans=sess.beginTransaction();
        
//        List<User> uList=new ArrayList<User>();
//        uList.add(u1);
//        uList.add(u2);
//        uList.add(u3);
//        uList.add(u4);
        
//        for(User u:uList) {
//        	sess.save(u);
//        }
        System.out.println("-----------------------Client 1-----------------------");
       User sess1= sess.get(User.class, 101);
        System.out.println(sess1);
        User sess3=sess.get(User.class, 101);
        System.out.println(sess3);
        
        System.out.println("-----------------------Client 2-----------------------");
        User sess2=sess.get(User.class, 102);
        System.out.println(sess2);
       
//        trans.commit();
        sess.close();
        
    }
}
