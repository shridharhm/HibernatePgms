package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Student_InsertClient {

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
		Student s4 = new Student(104, "Ram", "ram@cc.com");
		Student s5 = new Student(105, "Sham", "sham@dc.com");
		Student s6 = new Student(106, "Ann", "ann@ac.com");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		
		transaction.commit();
		
		System.out.println("Student Data Inserted SUccessfully");
		session.close();

	}

}
