package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class CuustomerClient {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Set<String> s1 = new HashSet();
		Set<String> s2 = new HashSet();
		Set<String> s3 = new HashSet();
		Set<String> s4 = new HashSet();
		
		s1.add("ABCDE12345");
		s1.add("859632147");
		s1.add("INDKA05W78965");
		
		s2.add("JKLI74582");
		s2.add("15236958");
		s2.add("INDMP04W4859");
		
		s3.add("OLPKL1360");
		s3.add("859632147");
		s3.add("INDTS08W7596");
		
		s4.add("GTHY2635");
		s4.add("2596325");
		s4.add("INDAP05W7965");
		
		Customer c1 = new Customer(121, "Ram", 123654, s1);
		Customer c2 = new Customer(122, "Sham", 125000, s2);
		Customer c3 = new Customer(123, "Ann", 150000, s3);
		Customer c4 = new Customer(124, "Smith", 125032, s4);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		
		transaction.commit();
		System.out.println("Customer Data Inserted Successfully");
		session.close();
	}

}
