package com.test.Hibernate.Test.EmploeeProject;

import java.util.ArrayList;
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
        Employee emp1=new Employee();
        emp1.setE_id(101);
        emp1.setE_name("King");
        emp1.setE_experience(4);
//        emp1.setP_id(1011);
        
        Employee emp2=new Employee();
        emp2.setE_id(102);
        emp2.setE_name("Ford");
        emp2.setE_experience(2);
//        emp2.setP_id(1011);
        
        Employee emp3=new Employee();
        emp3.setE_id(103);
        emp3.setE_name("John");
        emp3.setE_experience(3);
//        emp3.setP_id(1012);
        
        List<Employee> eList=new ArrayList<Employee>();
        eList.add(emp1);
        eList.add(emp2);
        eList.add(emp3);
        
        Project pr1=new Project();
        pr1.setP_id(1011);
        pr1.setP_name("Developing App");
        pr1.setP_duration(4);
//        pr1.setE_id(101);
        
        Project pr2=new Project();
        pr2.setP_id(1012);
        pr2.setP_name("Testing App");
        pr2.setP_duration(2);
//        pr2.setE_id(103);
        
        List<Project> pList=new ArrayList<Project>();
        pList.add(pr1);
        pList.add(pr2);
        
        emp1.setpList(pList);
        emp3.setpList(pList);
        pr1.seteList(eList);
        pr2.seteList(eList);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Project.class).addAnnotatedClass(Employee.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction trs=sess.beginTransaction();
//        sess.save(emp1);
//        sess.save(emp2);
//        sess.save(emp3);
//        sess.save(pr1);
//        sess.save(pr2);
        
//        SQLQuery<Employee> query=sess.createNativeQuery("Select * from Employee",Employee.class);
//        Query<Employee> query=sess.createQuery("from Employee");
        
//        List<Employee> lEmp=query.list();
//        for(Employee e:lEmp) {
//        	System.out.println(e);
//        }
        
//        SQLQuery<Project> query=sess.createNativeQuery("Select * from Project p,Employee e where e.p_id=p.p_id",Project.class);
      Query<Project> query=sess.createQuery("from Project p, Employee e ");
      
      List lPro=query.getResultList();
      
      for(int i=0;i<lPro.size();i++) {
      	System.out.println(lPro.get(i));
      }
        
        trs.commit();
        sess.close();
        
        
        
    }
}
