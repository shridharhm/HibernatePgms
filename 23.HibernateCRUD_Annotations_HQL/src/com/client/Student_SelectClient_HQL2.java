package com.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Student_SelectClient_HQL2 {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		String hql1="Select s.id,s.name from Student s"; //Mutiple Rows ,Partial Columns
		String hql2="Select s.id,s.name from Student s where s.id =105";//Single Row Partial Columns
		
		Query query1 = session.createQuery(hql1);
		Query query2 = session.createQuery(hql2);
		
		System.out.println("Entire table , partial columns start ");
		List list1 = query1.list();
		Iterator iterator = list1.iterator();

		while(iterator.hasNext())
		{
			Object object = iterator.next();
			Object[] o = (Object[]) object;
			Integer i = (Integer) o[0];
			String s123  = (String) o[1];
			System.out.println("Id is "+i);
			System.out.println("Name is "+s123);
		}
		System.out.println("Entire table , partial columns end ");
		
		System.out.println("Single row, partial columns start ");
		List list2 = query2.list();
		Iterator iterator2 = list2.iterator();

		while(iterator2.hasNext())
		{
			Object object = iterator2.next();
			Object[] o = (Object[]) object;
			Integer i = (Integer) o[0];
			String s123  = (String) o[1];
			System.out.println("Id is "+i);
			System.out.println("Name is "+s123);
		}
		
		System.out.println("Single row , partial columns end ");
		
		Object uniqueResult = query2.uniqueResult();
		Object[] o2 =(Object[]) uniqueResult ;
		System.out.println("Id using unique result is "+o2[0]);
		System.out.println("Name using unique result is "+o2[1]);
		transaction.commit();
		session.close();
		factory.close();
	}

}
