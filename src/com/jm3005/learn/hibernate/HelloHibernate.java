package com.jm3005.learn.hibernate;

import java.util.List;

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

			// save
//			 User user = new User(100L, "Karan", 20);
//			 session.save(user);

			// get
			// User u = session.get(User.class, 100L);
			// System.out.println(u);

			// update
			// User u = session.get(User.class, 100L);
			// u.setAge(18);

			// delete
			// User u = session.get(User.class, 100L);
			// session.delete(u);
			
			
			//retrieve multiple records
//			List<User> users = session.createQuery("from User").getResultList();
//			System.out.println(users);
			
			//retrieve multiple records with criteria
			List<User> users = session.createQuery("from User u where u.age > 10 AND name LIKE '%ran'").getResultList();
			System.out.println(users);

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}

}
