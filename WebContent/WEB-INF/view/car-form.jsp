<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.errorColor{
	color:red;
}
</style>
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
		<form:errors path="carName" cssClass="errorColor" />
		<br />
		
		<label>Car Type:</label>
		<form:radiobutton path="typeOfCar" value="Automatic" />
		<label>Automatic</label>
		&nbsp;
		<form:radiobutton path="typeOfCar" value="Manual" />
		<label>Manual</label>
		<br />
		
		<label>Manufactured In: </label>
		<form:select path="manufacturedIn">
		<form:option value="India">India</form:option>
		<form:option value="USA">USA</form:option>
		</form:select>
		<br />
		
		<label>Airbags: </label>
		<form:checkbox path="airbags" value="Front" label="Front Seat" />
		<form:checkbox path="airbags" value="Back" label="Back Seats" />
		<form:checkbox path="airbags" value="BootSpace" label="Boot Space" />
		<br />
		
		<label>ABS: </label>
		<form:checkbox path="abs" />
		<br />
		
		<label>Comment: </label>
		<form:textarea path="comment" />
		<br />

<input type="submit" value="Submit">
	</form:form>




</body>
</html>