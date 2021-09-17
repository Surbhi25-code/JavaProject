package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class HQLUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Session Factory
		SessionFactory factory=new Configuration()
				                   .configure("hibernate.cfg.xml")
				                   .addAnnotatedClass(Employee.class)
				                   .buildSessionFactory();
		
		//session
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		
	  //	dbs manipulation code
		session.createQuery("update Employee e set e.basic=e.basic-10000 where e.basic<50000").executeUpdate();
		System.out.println("Records updated .....");
	 //	commit transaction
		session.getTransaction().commit();

	}

}
