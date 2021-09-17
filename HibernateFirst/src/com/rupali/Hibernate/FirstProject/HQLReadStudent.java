package com.rupali.Hibernate.FirstProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rupali.entity.Employee;
import com.rupali.entity.Student;

public class HQLReadStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
	               .configure()
	               .addAnnotatedClass(Student.class)
	               .buildSessionFactory();
		//create Sessionobject
		Session session=factory.getCurrentSession();

		try {
			//begin Transaction
			session.beginTransaction();
			
			//list of students with email yahoo.com
			List<Student> studList=session.createQuery("from Student s where s.email LIKE '%yahoo.com' ").getResultList();

			System.out.println("List of students with email like yahoo.com");
			for(Student st:studList)
			  System.out.println(st);

	//commit transaction
			session.getTransaction().commit();

	}
	finally {
   factory.close();
    }
  }
}
