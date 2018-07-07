<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.errorColor {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Form</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">

	<form:form action="${pageContext.request.contextPath}/customer/process-customer-data" modelAttribute="customer" class="form-group">
<form:hidden path="id" value="${customer.id}" />
		<label>Customer Name:</label>
		<form:input path="name" />
		<br />

		<label>Graduate: </label>
		<form:checkbox path="graduate" />
		<br />

		<label>Customer Age:</label>
		<form:input path="age" />
		<br />

		<label>Gender:</label>
		<form:radiobutton path="gender" value="Male" />
		<label>Male</label>
		&nbsp;
		<form:radiobutton path="gender" value="Female" />
		<label>Female</label>
		<br />

		<input type="submit" value="Submit">
	</form:form>
	</div>
</body>
</html>