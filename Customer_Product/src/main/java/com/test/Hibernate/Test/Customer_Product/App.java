package com.test.Hibernate.Test.Customer_Product;

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
				Customer cus1=new Customer();
				cus1.setC_id(101);
				cus1.setC_name("Ram");
				cus1.setC_contact(98765445678l);
		
				Customer cus2=new Customer();
				cus2.setC_id(102);
				cus2.setC_name("Iman");
				cus2.setC_contact(9865434567654l);
		
				Product pro1=new Product();
				pro1.setP_id(71);
				pro1.setP_name("Soap");
		
				Product pro2=new Product();
				pro2.setP_id(67);
				pro2.setP_name("Fan");
				    
		//		    ManyToOne-->
		//		pro1.setCus(cus1);
		//		pro2.setCus(cus1);


		//OneToOne-->
		//    cus1.setPro(pro1);
		//    cus2.setPro(pro2);
		//    
		//    pro1.setCust(cus1);
		//    pro2.setCust(cus2);
		//    

//		ManyToMany-->
		    List<Product> lPro=new ArrayList<Product>();
		   lPro.add(pro1);
		   lPro.add(pro2);
		   
		   List<Customer> lCus=new ArrayList<Customer>();
		   lCus.add(cus1);
		   lCus.add(cus2);

		   cus1.setpList(lPro);
		   cus2.setpList(lPro);
		   
		   pro1.setcList(lCus);
		   pro2.setcList(lCus);
		    

		//OneToMany-->
		//	    List<Product> lPro=new ArrayList<Product>();
		//   lPro.add(pro1);
		//   lPro.add(pro2);
		//    cus1.setPro(lPro);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
//				sess.save(pro2);
//				sess.save(pro1);
//				sess.save(cus2);
//				sess.save(cus1);
//				trans.commit();

				Customer c=sess.get(Customer.class, 101);
//				   System.out.println(c.getC_id()+" "+c.getC_name()+" "+c.getC_contact()+" "+c.getpList());
				System.out.println(c);
		//		Product p=sess.get(Product.class, 67);
		//		System.out.println(p.getP_id()+p.getP_name()+p.getCus());



	}
}
