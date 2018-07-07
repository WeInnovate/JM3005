<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">
	Hello Spring MVC!

	<h1>Student</h1>
	<a class="btn btn-outline-warning" href="show-student-form">Show Student Form</a>



	<h1>Car</h1>
	<a class="btn btn-outline-success" href="car/show-car-form">Show Car Form</a>

	<h1>Customer</h1>
	<a class="btn btn-outline-primary"
		href="${pageContext.request.contextPath}/customer/show-customer-form">Show
		Customer Form</a>
	<a class="btn btn-outline-secondary"
		href="${pageContext.request.contextPath}/customer/customers">Show
		All customers</a>
</div>
</body>
</html>