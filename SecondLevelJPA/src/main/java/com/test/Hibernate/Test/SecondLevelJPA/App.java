package com.test.Hibernate.Test.SecondLevelJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Foods f1=new Foods();
//    	f1.setfId(10);
//    	f1.setfName("Dosa");
//    	f1.setfPrice(40);
//    	
//    	Foods f2=new Foods();
//    	f2.setfId(34);
//    	f2.setfName("Poori");
//    	f2.setfPrice(45);
//    	
//    	Foods f3=new Foods();
//    	f3.setfId(52);
//    	f3.setfName("Idli");
//    	f3.setfPrice(30);
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("foodUnit");
        EntityManager em1=emf.createEntityManager();
        EntityTransaction et1=em1.getTransaction();
        et1.begin();
        Foods f1=em1.find(Foods.class, 10);
        System.out.println(f1);
//        em1.persist(f1);
//        em1.persist(f2);
//        em1.persist(f3);
        et1.commit();
        
        EntityManager em2=emf.createEntityManager();
        EntityTransaction et2=em1.getTransaction();
        et2.begin();
        Foods f2=em2.find(Foods.class, 34);
        System.out.println(f2);
        et2.commit();
        
        EntityManager em3=emf.createEntityManager();
        EntityTransaction et3=em1.getTransaction();
        et3.begin();
        Foods f3=em3.find(Foods.class, 34);
        System.out.println(f3);
        et3.commit();
    }
}
