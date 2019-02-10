package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateUpdateClient {

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*Product p = session.get(Product.class, 129);
		p.setCategory("Fruits");
		p.setPname("Mamngo");
		p.setPrice(1000);
		p.setCity("Davangere");*/
		
		
		Product p= new Product(129, "Vegetable", 100, "Spinach", "Racihur");
		session.update(p);
		transaction.commit();
		session.close();
		
	}

}
