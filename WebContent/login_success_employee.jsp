<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>
		<form action="login_sccess_employee" method ="post">
	<h3 align="center">Properties under management</h3>
	<table border="1">
    <tr>
    <tr class="header">
    <th style="width:20%;">Property ID</th>
    <th style="width:50%;">Address</th>
    <th style="width:30%;">Already rented</th>
  </tr>     
    <tr>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
</table>
	
	<h3 align="center">Add new property</h3>
	
	Property Id : <input type = "text" name = "Property id"id = "Property id"> <br>
	
	<button type = "submit" name="action" value="signin">add</button>
	
	</form>
</body>
</html>