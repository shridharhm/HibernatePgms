package com.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Adress;
import com.model.Student;

public class StudentInsertClient {
	public static void main(String[] args) 
	{
		Map<Integer,Adress> s1 = new HashMap<>();
		Map<Integer,Adress> s2 = new HashMap<>();
		Map<Integer,Adress> s3 = new HashMap<>();
		Map<Integer,Adress> s4 = new HashMap<>();

		Adress ad1 = new Adress("Church", "Mumbai", "Maharashtra", "123987");
		Adress ad2 = new Adress("Temple", "Mysore", "Karnataka", "560085");
		Adress ad3 = new Adress("Cotton", "Hyderabad", "Andhra", "896362");
		Adress ad4 = new Adress("Boat", "Cochin", "Kerala", "852741");

		Adress ad5 = new Adress("Yellow", "Udaypur", "MP", "859632");
		Adress ad6 = new Adress("Orange", "Davangere", "Uttranchal", "789632");
		Adress ad7 = new Adress("Red", "Shimla", "HP", "148965");
		Adress ad8 = new Adress("Green", "Ghazi", "UP", "248365");

		s1.put(101,ad1);
		s1.put(102,ad2);

		s2.put(104,ad3);
		s2.put(105,ad4);

		s3.put(106,ad5);
		s3.put(107,ad6);

		s3.put(106,ad7);
		s3.put(107,ad8);

		Student st1 = new Student(121, "John", "Harvard", s1);
		Student st2 = new Student(122, "Smith", "Oxford", s2);
		Student st3 = new Student(123, "Glenn", "Sydney", s3);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(st1);
		session.save(st2);
		session.save(st3);

		transaction.commit();
		session.close();

		factory.close();
	}
}
