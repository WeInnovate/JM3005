package com.jm3005.learn.hibernate.associations.onetoone.uni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class)
				.addAnnotatedClass(CarDetail.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			// Save
			// CarDetail carDetail = new CarDetail("Black", 30.2, true);
			// Car car = new Car("Auto", carDetail);
			// long primaryKey = (long)session.save(car);
			// System.out.println(primaryKey);

			// Fetch
			// Car car = session.get(Car.class, 3l);
			// System.out.println(car);

			// Merge
//			Car car = session.get(Car.class, 3l);
//			car.setName("Audi");
//			car.getCarDetail().setColor("Red");
//			System.out.println(car);

			
//			Remove
			Car car = session.get(Car.class, 3l);
			session.delete(car);
			
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}

}
