<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guest please sign in here</title>
</head>
<body>
	 <h1>Guest please sign in here</h1>
	
	
	
	<form action="signin_guests" method ="post">
	
	Password:<input type ="password" name = "password" id ="password"><br>

	FirstName:<input type = "text" name = "first name"id = "first name"> <br>
	LastName:<input type = "text" name = "last name"id = "last name"> <br>
	FullName:<input type = "text" name = "full name"id = "full name"> <br>
	Id:<input type = "number" name = "id"id = "id"> <br>
	Birth:<input type = "date" name = "birth"id = "birth"> <br>
	Address:<input type = "text" name = "address"id = "address"> <br>
	Email:<input type = "text" name = "email"id = "email"> <br>
	Phone:<input type = "text" name = "phone"id = "phone"> <br>
	
	
	<button type = "reset">reset</button>
	
	<button type = "submit" name="action" value="signin">signin</button>
	
	</form>
</body>
</html>