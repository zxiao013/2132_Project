<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search_guest</title>
</head>
<body>
	<h1>Search results </h1>
	
	
	
	
	<form action="search_guests" method ="post">
	<table border="1">
    <tr>
    <tr class="header">
    <th style="width:10%;">Property ID</th>
    <th style="width:40%;">Address</th>
    <th style="width:20%;">Price</th>
    <th style="width:30%;">Type</th>
  </tr>
       
        
    <tr>
        <td>5</td>
        <td>87 Kjsuu Rd</td>
        <td>100</td>
        <td>house</td>
    </tr>
    <tr>
        <td>c6</td>
        <td>343 Haed Ave</td>
        <td>80</td>
        <td>apart</td>
    </tr>
</table>
	
	<button type = "submit" name="action" value="book">book</button>
	<button type = "submit" name="action" value="rate">rate</button>
	
	</form>
</body>
</html>