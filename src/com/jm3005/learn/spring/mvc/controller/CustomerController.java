package com.jm3005.learn.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jm3005.learn.spring.mvc.dao.CustomerDao;
import com.jm3005.learn.spring.mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping(value = "/show-customer-form", method = RequestMethod.GET)
	public String showCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping(value = "/show-customer-form/{customerId}", method = RequestMethod.GET)
	public String showCustomerForm(Model model, @PathVariable("customerId") Long customerId) {
		Customer customer = customerDao.getCustomer(customerId);
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@Transactional
	@RequestMapping(value = "/process-customer-data")
	public String processCustomerData(@ModelAttribute("customer") Customer customer, Model model) {
		System.out.println(customer);
		customerDao.saveOrUpdateCustomer(customer);
		List<Customer> customers = customerDao.getCustomers();
		model.addAttribute("customers", customers);
		return "customer";
	}

	@GetMapping("/customers")
	public String getCustomers(Model model) {
		List<Customer> customers = customerDao.getCustomers();
		model.addAttribute("customers", customers);
		return "customer";
	}

	@GetMapping("/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Long customerId, Model model) {
		System.out.println(customerId);
		customerDao.deleteCustomer(customerId);
		return getCustomers(model);
	}

}
