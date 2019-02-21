package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Developer;
import com.model.Employee;
import com.model.Tester;

public class EmployeeInsert {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		Session session = cfg.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Developer d1 = new Developer(101, "Sham", "sham@infy.com", "JAVA", "Eclipse");
		Developer d2 = new Developer(102, "Bhavya", "bhavay@intel.com", ".Net", "InetlliJ");
		Developer d3 = new Developer(103, "GuuruPrasad", "guru@ammajan.com", "AWS", "Netbeans");

		Tester t1 = new Tester(104, "Mahesh", "Mahesh@seimens.com", "Automation");
		Tester t2 = new Tester(105, "Santosh", "Santosh@Yavdondu.com", "Selenium");
		Tester t3 = new Tester(106, "Vageesh", "vageesh@sisksikkidu.com", "Manual");
		
		Employee e1 = new Employee(111, "Steven", "steve@ca.com");
		Employee e2 = new Employee(112, "Smith", "smith@nzcb.com");
		session.save(d1);
		session.save(d2);
		session.save(d3);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(e1);
		session.save(e2);

		transaction.commit();
		System.out.println("Data Insereted Successfully");
		session.close();
	}

}
