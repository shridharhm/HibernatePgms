package com.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Adress;
import com.model.Customer;

public class CuustomerClient {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Adress> s1 = new ArrayList();
		List<Adress> s2 = new ArrayList();
		List<Adress> s3 = new ArrayList();
		List<Adress> s4 = new ArrayList();

		Adress ad1 = new Adress("Church", "Mumbai", "Maharashtra", "123987");
		Adress ad2 = new Adress("Temple", "Mysore", "Karnataka", "560085");
		Adress ad3 = new Adress("Cotton", "Hyderabad", "Andhra", "896362");
		Adress ad4 = new Adress("Boat", "Cochin", "Kerala", "852741");
		
		Adress ad5 = new Adress("Yellow", "Udaypur", "MP", "859632");
		Adress ad6 = new Adress("Orange", "Davangere", "Uttranchal", "789632");
		Adress ad7 = new Adress("Red", "Shimla", "HP", "148965");
		Adress ad8 = new Adress("Green", "Ghazi", "UP", "248365");
		
		s1.add(ad1);
		s1.add(ad2);
		
		s2.add(ad3);
		s2.add(ad4);
		
		s3.add(ad5);
		s3.add(ad6);
		
		s4.add(ad7);
		s4.add(ad8);
		
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
