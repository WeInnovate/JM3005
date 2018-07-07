package com.jm3005.learn.spring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jm3005.learn.spring.mvc.model.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	public Long saveCustomer(Customer customer) {
		return (Long) sessionFactory.openSession().save(customer);
	}

	public void saveOrUpdateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	public List<Customer> getCustomers() {
		return (List<Customer>) sessionFactory.openSession().createQuery("from Customer").getResultList();
	}

	public void deleteCustomer(Long customerId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		session.delete(customer);
		session.getTransaction().commit();
	}

	public Customer getCustomer(Long customerId) {
		return sessionFactory.openSession().get(Customer.class, customerId);
	}
}
