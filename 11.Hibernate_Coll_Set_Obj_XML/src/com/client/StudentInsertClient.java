package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Adress;
import com.model.Student;

public class StudentInsertClient {
	public static void main(String[] args) 
	{
		Set<Adress> a1 = new HashSet<>();
		Set<Adress> a2 = new HashSet<>();
		Set<Adress> a3 = new HashSet<>();
		Set<Adress> a4 = new HashSet<>();
		
		Adress ad1 = new Adress("Church", "Mumbai", "Maharashtra", "123987");
		Adress ad2 = new Adress("Temple", "Mysore", "Karnataka", "560085");
		Adress ad3 = new Adress("Cotton", "Hyderabad", "Andhra", "896362");
		Adress ad4 = new Adress("Boat", "Cochin", "Kerala", "852741");
		
		Adress ad5 = new Adress("Yellow", "Udaypur", "MP", "859632");
		Adress ad6 = new Adress("Orange", "Davangere", "Uttranchal", "789632");
		Adress ad7 = new Adress("Red", "Shimla", "HP", "148965");
		Adress ad8 = new Adress("Green", "Ghazi", "UP", "248365");
		
		a1.add(ad1);
		a1.add(ad2);
		a2.add(ad3);
		a2.add(ad4);
		a3.add(ad5);
		a3.add(ad6);
		a4.add(ad7);
		a4.add(ad8);
		
		Student s1 = new Student(121, "Ramesh", "ram@eurokids", a1);
		Student s2 = new Student(122, "Suresh", "ram@kidzee", a2);
		Student s3 = new Student(123, "Yogesh", "ram@websters", a3);
		Student s4 = new Student(124, "Rakesh", "raki@dps", a4);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		transaction.commit();
		session.close();
		
		factory.close();
		


	}
}
