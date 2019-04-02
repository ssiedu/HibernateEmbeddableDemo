package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {

	public static void main(String[] args) {

		
		Address address=new Address();
		address.setHno(111);
		address.setCity("Indore");
		address.setState("MP");
		
		Customer c1=new Customer();
		c1.setCode("C111");
		c1.setCname("AAA");
		c1.setAddress(address);


		
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1);
		tr.commit();
		session.close();
		System.out.println("Customer Info Stored");

	}

}
