package com.jm3005.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloHibernate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			// here - save
			User user = new User(100L, "Karan", 20);
//			session.save(user);
			User u = session.get(User.class, 100L);
			System.out.println(u);
			
//			u.setAge(18);
			
			session.delete(u);

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}

}
