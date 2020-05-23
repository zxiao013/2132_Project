<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee sign in</title>
</head>
<body>
    <h1>Employee please sign in here</h1>
	
	
	
	<form action="signin_employee" method ="post">
	Name : <input type = "text" name = "name"id = "name"> <br>
	Password:<input type ="password" name = "password" id ="password"><br>
	BasicInfo:<input type = "text" name = "basicinfo" id = "basicinfo"><br>
	BranchId:<input type = "number" name = "branch id"id = "branch id"> <br>
	Id:<input type = "number" name = "id"id = "id"> <br>
	Position:<input type = "text" name = "position"id = "position"> <br>
	Salary:<input type = "number" name = "salary"id = "salary"> <br>
	
	
	
	<button type = "reset">reset</button>
	
	<button type = "submit" name="action" value="signin">signin</button>
	
	</form>
</body>
</html>