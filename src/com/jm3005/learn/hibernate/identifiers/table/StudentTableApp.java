package com.jm3005.learn.hibernate.identifiers.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTableApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentTable.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			/*
			 * there is no need to provide roll number, it'll be generated
			 * automatically as sequence number
			 */
			StudentTable std01 = new StudentTable("Atul", "atul.wnw@gmail.com", "9110460027", "Bengaluru");
			StudentTable std02 = new StudentTable("John Rodson", "john@springframework.org", "9876543210", "New York");
			StudentTable std03 = new StudentTable("Martin Fowler", "martin@martinfowler.com", "9876543211", "LA");

			session.save(std01);
			session.save(std02);
			session.save(std03);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}

	}
}
