package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory=new Configuration()
	               .configure("hibernate.cfg.xml")
	               .addAnnotatedClass(Employee.class)
	               .buildSessionFactory();

        //create object of session
       Session session=factory.getCurrentSession();
		
		
		try {
		//create object of session factory
		
		
	  //create transaction
		session.beginTransaction();
		
	 //perform database operations insert a record in Employee
		Employee e1=new Employee(7,500000,120,30,10);
		session.save(e1);
		
     //commit transaction
		session.getTransaction().commit();
	}
	finally {
       factory.close();
}
}//main
}//class