package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//updated single employee

import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class UpdateEmployee {
	
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
		Employee emp=session.get(Employee.class, 6);
		System.out.println("Updating object details......");
		emp.setBasic(20000); //setter method of Employeee
		
		session.getTransaction().commit();
		}finally {
			factory.close();
		}
}
}
