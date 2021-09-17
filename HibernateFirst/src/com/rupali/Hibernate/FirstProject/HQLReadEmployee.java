package com.rupali.Hibernate.FirstProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;


public class HQLReadEmployee {

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
		//retrieve all records using HQL
		List<Employee> employees=session.createQuery("from Employee").getResultList();
		
		//display all records
		System.out.println("All records of Employee table ");
		displayEmployee(employees);
		
		//commit transaction
		session.getTransaction().commit();
		
		// display employees with total CL <10
		Session session2=factory.getCurrentSession();
		session2.beginTransaction();
		
		//perform dbs operation
		List<Employee> empList=session2.createQuery("from Employee e where e.totalCl<10").getResultList();
		
		System.out.println("List of employees with CL <10");
		displayEmployee(empList);
		
		//commit transaction
		 session2.getTransaction().commit();
       
      
		 
	 
			
		//perform dbs operation
		
		
		
		}
		finally {
			factory.close();
		}
		
		
	}

	/**
	 * @param employees
	 */
	private static void displayEmployee(List<Employee> employees) {
		for(Employee e:employees)
			System.out.println(e);
	}

}
