<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signin</title>
<script type = "text/javascript">

</script>
</head>
<body>
	<form action="signin_general" method ="post">
	<h1>Please Signin</h1><br>
	<p>Please choose your identity</p><br>
	Role:<input type="radio" name="role" value = "Employee">Employee<br><input type = "radio" name ="role" value = "Guests" >Guests<br><input type = "radio" name ="role" value = "Hosts">Hosts<br><input type = "radio" name ="role" value = "Admin" >Admin<br>
	
	<button type = "submit" name="action" value="confirm">confirm</button>
	</form>
</body>
</html>