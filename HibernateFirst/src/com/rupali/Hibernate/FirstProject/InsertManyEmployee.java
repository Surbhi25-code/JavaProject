package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class InsertManyEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object of SessionFactory
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Employee.class)
				               .buildSessionFactory();
		
		
		//create object of Session
		Session session=factory.getCurrentSession();
		
		try {
		//begin Transaction
		session.beginTransaction();
				
		//perform dbs operations
		
		//create 3 objects of Employee class
		
		Employee e1=new Employee(3333333,333,33,10);
		Employee e2=new Employee(6663333,666,66,8);
		Employee e3=new Employee(7773333,777,77,7);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		
		//commit transaction
		session.getTransaction().commit();
		
		}
		finally {
			factory.close();
		}
	}

}
