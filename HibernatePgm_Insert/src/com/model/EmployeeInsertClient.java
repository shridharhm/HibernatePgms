package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class EmployeeInsertClient {
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		 Employee e1 = new Employee();
		 e1.setId(101);
		 e1.setName("Shruti");
		 e1.setDepartment("Developer");
		 e1.setEmail("shr@infy.com");
		 
		 Employee e2 = new Employee(102, "Suresh", "sresh@tcs.com", "admin");
		 Employee e3 = new Employee(103, "Ramesh", "ramesh@tcs.com", "Network");
		 Employee e4 = new Employee(104, "Ram", "ram@intel.com", "Operations");
		 Employee e5 = new Employee(105, "Mukesh", "muk@ambani.com", "Owner");
		 
		 session.save(e1);
		 session.save(e2);
		 session.save(e3);
		 session.save(e4);
		 session.save(e5);
		 
		 transaction.commit();
		 session.close();
		 
		 
	}
}
