<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Please Signin</title>
</head>
<body>
	<p>This is for Admin</p><br>
	<p>Please do not leave blank</p><br>
	
	<form action="signin_admin" method ="post">
	Name : <input type = "text" name = "name"id = "name"> <br>
	Password:<input type ="password" name = "password" id ="password"><br>
	Id:<input type = "number" name = "id"id = "id"> <br>
	<button type = "reset">reset</button>
	<button type = "submit" name="action" value="signin">signin</button>
	
	</form>

</body>
</html>