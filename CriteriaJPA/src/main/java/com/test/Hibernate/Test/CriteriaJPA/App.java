package com.test.Hibernate.Test.CriteriaJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Cars c1=new Cars();
//        c1.setcId(101);
//        c1.setcName("BMW");
//        c1.setcPrice(5000000);
//        
//        Cars c2=new Cars();
//        c2.setcId(102);
//        c2.setcName("Ferrari");
//        c2.setcPrice(6000000);
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("carUnit");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        CriteriaBuilder cr=em.getCriteriaBuilder();
        CriteriaQuery<Cars> query=cr.createQuery(Cars.class);
        Root<Cars> car=query.from(Cars.class);
        et.begin();
//        em.persist(c1);
//        em.persist(c2);
        et.commit();
        
        CriteriaQuery<Cars> sel=query.select(car);
        TypedQuery<Cars> tq=em.createQuery(sel);
        List<Cars> res=tq.getResultList();
        
        for(Cars c:res) {
        	
        	System.out.println("Car ID: "+c.getcId()+", Car Name: "+c.getcName()+", Car Price: "+c.getcPrice() );
        }
        
        
    }
}
