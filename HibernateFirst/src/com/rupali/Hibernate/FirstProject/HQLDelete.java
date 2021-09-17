package com.rupali.Hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;

public class HQLDelete {

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
		session.createQuery("delete from Employee where basic>100000").executeUpdate();
		
		System.out.println("deleted Records .....");
	 //	commit transaction
		session.getTransaction().commit();
		}finally {
        factory.close();
}

}
}