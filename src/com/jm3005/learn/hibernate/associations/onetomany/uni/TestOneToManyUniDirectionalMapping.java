package com.jm3005.learn.hibernate.associations.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToManyUniDirectionalMapping {

	private static SessionFactory sessionFactory;

	private static Session session;

	public static void main(String[] args) {
		sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Assignment.class)
				.buildSessionFactory();

		try {
//			saveCourse();
//			getCourse();
			deleteCourse();
//			getAllCourses();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static void getAllCourses() {
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Course> courses = session.createQuery("from Course").getResultList();
		System.out.println(courses);
		session.getTransaction().commit();
	}

	private static void saveCourse() {
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		// create assignments for course
		Assignment assign01 = new Assignment("Write code for login flow.");
		Assignment assign02 = new Assignment("Write code to take input from user and save in database.");

		List<Assignment> assignemnts = new ArrayList<Assignment>();
		assignemnts.add(assign01);
		assignemnts.add(assign02);

		// create course
		Course course = new Course("Spring Framework", assignemnts);

		// save the course
		long coursePk = (long) session.save(course);
		System.out.println(coursePk);

		session.getTransaction().commit();
	}

	private static void getCourse() {
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Course course = session.get(Course.class, 1l);
		System.out.println(course);

		session.getTransaction().commit();
	}

	private static void deleteCourse() {
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Course course = session.get(Course.class, 1l);
		System.out.println(course);

		session.delete(course);

		session.getTransaction().commit();
	}
}
