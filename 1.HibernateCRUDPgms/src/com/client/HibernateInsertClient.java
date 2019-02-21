package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateInsertClient {

	public static void main(String[] args) 
	{
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			//factory.getcur
			Transaction transaction = session.beginTransaction();
			
			Product p4 = new Product(127, "Electronincs", 13999, "Mobile", "Bangalore");
			Product p5 = new Product(128, "Apparels", 799, "Jeans", "Mysore");
			Product p6 = new Product(129, "Appliance", 17999, "Fridge", "Indore");
			
			session.save(p4);
			session.save(p5);
			session.save(p6);
			
			transaction.commit();
			System.out.println("Data inserted successfully");
			session.close();
	}

}
