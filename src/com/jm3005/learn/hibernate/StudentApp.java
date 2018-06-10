package com.jm3005.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentAuto.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			//here
			StudentAuto studentAuto = new StudentAuto("Karan", 20, 90.19);
			Long rollNo = (Long)session.save(studentAuto);
			System.out.println(rollNo);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}

	}

}
