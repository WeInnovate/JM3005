<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Details</title>
</head>
<body> 
	Company Name: ${car.companyName }
	<br />
	Car Name: ${car.carName }
	<br />
	Car Type: ${car.typeOfCar }
	<br />
	Car is manufactured in : ${car.manufacturedIn }
	<br />
	Airbags: ${car.airbags[0] } &nbsp; ${car.airbags[1] }
	<br />
	ABS: ${car.abs }
	
	<br />
	Comment: ${car.comment }
</body> 
</html>