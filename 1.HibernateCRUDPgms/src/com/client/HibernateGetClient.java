package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateGetClient {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product p = session.get(Product.class, 127);

		System.out.println("Product id is"+p.getPid());
		System.out.println("Product Name is"+p.getPname());
		System.out.println("Product Category is"+p.getCategory());
		System.out.println("Product City is"+p.getCity());
	}

}
