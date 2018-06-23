package com.jm3005.learn.hibernate.associations.onetomany.bi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToManyBiDirectionalMapping {

	private static SessionFactory sessionFactory;

	private static Session session;

	public static void main(String[] args) {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Course.class)
				.addAnnotatedClass(Assignment.class).buildSessionFactory();

		try {
//			 saveCourse();
//			 saveAssignment();
			 getCourse();
//			deleteCourse();
//			deleteAssignment();
//			 getAllCourses();
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

		// create course
		Course course = new Course("Java Framework");

		course.addAssignment(assign01);
		course.addAssignment(assign02);

		// save the course
		long coursePk = (long) session.save(course);
		System.out.println(coursePk);

		// create assignments for course
		Assignment assign03 = new Assignment("Write code for login flow.");

		course.addAssignment(assign03);

//		assign03.setCourse(course);

		// save the course
		session.save(assign03);

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

		Course course = session.get(Course.class, 3l);
		System.out.println(course);

		session.delete(course);

		session.getTransaction().commit();
	}

	private static void deleteAssignment() {
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Assignment assignment = session.get(Assignment.class, 4l);
		System.out.println(assignment);

		session.delete(assignment);

		session.getTransaction().commit();
	}

	private static void saveAssignment() {

		session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		// create assignments for course
		Assignment assign01 = new Assignment("Write code for login flow.");

		// create course
		Course course = new Course("Java Framework");

		// set course for assignment
		assign01.setCourse(course);

		// save the course
		session.save(assign01);

		session.getTransaction().commit();
	}
}
