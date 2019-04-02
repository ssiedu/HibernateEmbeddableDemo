package com.ssi;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SearchCustomer {

	public static void main(String[] args) {

		
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Customer c=session.get(Customer.class, "c111");
		//System.out.println(c);

		System.out.println(c.getCode());
		System.out.println(c.getCname());
		System.out.println(c.getAddress().getHno());
		System.out.println(c.getAddress().getCity());
		System.out.println(c.getAddress().getState());
		
		
/*		String s1=c.getCode();
		String s2=c.getCname();
		Address adr=c.getAddress();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(adr.getHno());
		System.out.println(adr.getCity());
*/		session.close();

	}

}
