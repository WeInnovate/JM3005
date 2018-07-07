<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">NAME</th>
					<th scope="col">AGE</th>
					<th scope="col">GRADUATE</th>
					<th scope="col">GENDER</th>
					<th scope="col">UPDATE</th>
					<th scope="col">DELETE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">
					<tr>
						<th scope="row">${customer.id }</th>
						<td>${customer.name }</td>
						<td>${customer.age }</td>
						<td>${customer.graduate }</td>
						<td>${customer.gender }</td>
						<td><a
							href="${pageContext.request.contextPath}/customer/show-customer-form/${customer.id}"
							class="btn btn-small btn-info">EDIT</a></td>
						<td><a
							href="${pageContext.request.contextPath}/customer/${customer.id}"
							class="btn btn-small btn-danger">DELETE</a></td>
					</tr>
				</c:forEach>

				<tr>

					<td colspan="7"><a class="btn btn-success btn-large"
						href="${pageContext.request.contextPath}/customer/show-customer-form">Add
							Customer</a></td>

				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>