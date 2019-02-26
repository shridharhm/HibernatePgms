package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Adress;
import com.model.Student;

public class StudentInsertClient {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Adress ad1 = new Adress("Church", "Mumbai", "Maharashtra", "123987");
		Adress ad2 = new Adress("Temple", "Mysore", "Karnataka", "560085");
		Adress ad3 = new Adress("Cotton", "Hyderabad", "Andhra", "896362");
		Adress ad4 = new Adress("Boat", "Cochin", "Kerala", "852741");
		
		Adress ad5 = new Adress("Church", "Mumbai", "Maharashtra", "123987");
		Adress ad6 = new Adress("Temple", "Mysore", "Karnataka", "560085");
		Adress ad7 = new Adress("Cotton", "Hyderabad", "Andhra", "896362");
		Adress ad8 = new Adress("Boat", "Cochin", "Kerala", "852741");
		
		Student s1 = new Student(121, "Ramesh", "ram@eurokids", ad1,ad5);
		Student s2 = new Student(122, "Suresh", "ram@kidzee", ad2,ad6);
		Student s3 = new Student(123, "Yogesh", "ram@websters", ad3,ad7);
		Student s4 = new Student(124, "Rakesh", "raki@dps", ad4,ad8);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		transaction.commit();
		System.out.println("Student Data Inserted Sccessfully");
		session.close();
		factory.close();
		
	}

}
