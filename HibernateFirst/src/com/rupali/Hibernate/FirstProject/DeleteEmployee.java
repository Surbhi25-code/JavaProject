package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Session Factory
				SessionFactory factory=new Configuration()
						                   .configure("hibernate.cfg.xml")
						                   .addAnnotatedClass(Employee.class)
						                   .buildSessionFactory();
				
				try {
				//session
				Session session=factory.getCurrentSession();
				session.beginTransaction();
				
				
			  //	dbs manipulation code
				
				//get the OBJECT to be deleted
				Employee e=session.get(Employee.class,11);
				
				//delete the object
				
				session.delete(e);
				System.out.println("deleted Record .....");
			 //	commit transaction
				session.getTransaction().commit();
				}finally {
                factory.close();
	}

}
}
