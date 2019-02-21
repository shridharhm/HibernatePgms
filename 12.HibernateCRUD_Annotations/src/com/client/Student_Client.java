package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Student_Client {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s1 = new Student(101, "Anup", "anup@dps.com");
		Student s2 = new Student(102, "Krish", "krish@nps.com");
		Student s3 = new Student(103, "Neil", "neil@bc.com");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		transaction.commit();
		
		System.out.println("Student Data Inserted SUccessfully");
		session.close();

	}

}
