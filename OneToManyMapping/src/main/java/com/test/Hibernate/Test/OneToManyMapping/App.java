package com.test.Hibernate.Test.OneToManyMapping;

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
        Vehicle v=new Vehicle ();
        v.setvId(101);
        v.setvName("BMW");
        
        Vehicle v1=new Vehicle();
        v1.setvId(102);
        v1.setvName("Audi");
        
        Person p=new Person();
        p.setpId(45);
        p.setpName("Heath");
        p.setpContact(987654345678l);
        
        v.setPer(p);
        v1.setPer(p);
        
        List<Vehicle> l=new ArrayList<Vehicle>();
        l.add(v);
        l.add(v1);
        
        p.setvList(l);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Vehicle.class).addAnnotatedClass(Person.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction trans=sess.beginTransaction();
        sess.save(p);
        sess.save(v);
        sess.save(v1);
        trans.commit();
    }
}
//Write a Hibernate Program to achieve ManyToMany mapping wrt Student and Book table
