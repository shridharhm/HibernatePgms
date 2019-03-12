package com.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Student_SelectClient_HQL {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		String hql1="from Student ";//Entire Table
		String hql2="from Student s where s.id=102"; //Single Row, All colmnns
		
		Query query1 = session.createQuery(hql1);
		Query query2 = session.createQuery(hql2);
		
		System.out.println("Entire table , all columns start ");
		List<Student> list1 = query1.list();
		Iterator iterator = list1.iterator();

		while(iterator.hasNext())
		{
			Student s =(Student) iterator.next();
			System.out.println(s);
		}
		System.out.println("Entire table , all columns end ");
		

		System.out.println("Single Row , all columns using query.list start ");
		List<Student> list2 = query2.list();
		Iterator iterator2 = list2.iterator();
		System.out.println("No fo students in collection "+list2.size());
		while(iterator2.hasNext())
		{
			Object s =(Student) iterator2.next();
			System.out.println(s);
		}
		
		System.out.println("Single Row , all columns using query.list end ");
		
		System.out.println("Student object obtained from unique result method start");
		Student s =  (Student) query2.uniqueResult();
		System.out.println("Student object obtained from unique result method"+s);
		
		System.out.println("Student object obtained from unique result method end");

		System.out.println("\"hello world\"");

		transaction.commit();
		session.close();
		factory.close();
	}

}
