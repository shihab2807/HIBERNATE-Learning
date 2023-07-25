package com.test.Hibernate.Test.HibernateJPA;

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
    	Employee e=new Employee();
    	e.seteId(101);
    	e.seteName("ABC");
    	e.seteSal(20000);
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        em.persist(e);
        et.commit();
    }
}
