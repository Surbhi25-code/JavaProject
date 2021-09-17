package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//craete SesssionFactory
		SessionFactory factory=new Configuration()
				               .configure()
				               .addAnnotatedClass(Employee.class)
				               .buildSessionFactory();
		//create Sessionobject
		Session session=factory.getCurrentSession();
		
		try {
		//begin Transaction
		session.beginTransaction();
		
		//perform operations
		//retrieve a record
		Employee emp=session.get(Employee.class, 5);
		System.out.println("Retrieved object details......");
		System.out.println(emp);
		
		
		//commit transaction
		session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
		
		
	}

}
