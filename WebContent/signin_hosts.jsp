<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hosts sign in</title>
</head>
<body>
	<h1>Hosts please sign in here</h1>
	
	
	
	<form action="signin_hosts" method ="post">
	Name : <input type = "text" name = "name"id = "name"> <br>
	Password:<input type ="password" name = "password" id ="password"><br>
	Confirm:<input type="password" name="confirm" id="confirm"><br>
	Id:<input type = "number" name = "id"id = "id"> <br>
	Address:<input type = "text" name = "address"id = "address"> <br>
	Email:<input type = "text" name = "email"id = "email"> <br>
	Phone:<input type = "text" name = "phone"id = "phone"> <br>
	
	
	<button type = "reset">reset</button>
	
	<button type = "submit" name="action" value="signin">signin</button>
	
	</form>
</body>
</html>