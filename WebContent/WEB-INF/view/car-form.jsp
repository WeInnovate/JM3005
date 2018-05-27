<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Form</title>
</head>
<body>

	<form:form action="process-car-data" modelAttribute="car">

<label>Company Name:</label>
		<form:input path="companyName" />
		<br />
		<label>Car Name:</label>
		<form:input path="carName" />
		<br />
		<label>Car Type:</label>
		<form:radiobutton path="typeOfCar" value="Automatic" />
		<label>Automatic</label>
		&nbsp;
		<form:radiobutton path="typeOfCar" value="Manual" />
		<label>Manual</label>
		<br />
		<input type="submit" value="Submit">


	</form:form>




</body>
</html>