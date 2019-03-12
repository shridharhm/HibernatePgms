package com.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Student_SelectClient_HQL3 {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		String hql3="Select s.name from Student s ";//Multiple Rows Single Column
		String hql4="Select s.id from Student s where s.id =105";
		
		Query query3 = session.createQuery(hql3);
		Query query4 = session.createQuery(hql4);
		
		System.out.println("Multiple Rows Single Column start ");
		List list3 = query3.list();
		Iterator iterator3 = list3.iterator();

		while(iterator3.hasNext())
		{
			Object object = iterator3.next();
			System.out.println("*************"+object);
		}
		System.out.println("Multiple Rows Single Column end");
		
		System.out.println("Single Row Single Column (Single cell value)start ");
		List list4 = query4.list();
		Iterator iterator4 = list4.iterator();

		while(iterator4.hasNext())
		{
			Object object =  iterator4.next();
			System.out.println("*************"+object);
		}
		System.out.println("Single Row Single Column (Single cell value)start ");

		Object s1 = query4.uniqueResult();
		System.out.println(("Name value using uniqueResult method "+s1));
		transaction.commit();
		session.close();
		factory.close();
	}

}
