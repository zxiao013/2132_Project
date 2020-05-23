<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rate the property</title>
</head>
<body>
	<h1>Rate the property</h1>
	
	
	
	<form action="Rate" method ="post">
	Property Id: <input type = "text" name = "Property Id"id = "Property Id"> <br>
	Property_address:<input type = "text" name = "Property_address"id = "Property_address"> <br>
	Rating:<select id = "Rating" name ="Rating">
	<option value =5.0>Good</option>
 	 <option value =3.5>Normal</option>
  	<option value=1.5>Bad</option>
   	</select>
	Clean:<select id = "Clean" name ="Clean">
  <option value ="Good">Good</option>
  <option value ="Normal">Normal</option>
  <option value="Bad">Bad</option>
   </select>
   Convenience:<select id = "Convenience" name ="Convenience">
  <option value ="Good">Good</option>
  <option value ="Normal">Normal</option>
  <option value="Bad">Bad</option>
   </select>
   communication:<select id ="Price" name = "communication">
  <option value ="Good">Good</option>
  <option value ="Normal">Normal</option>
  <option value="Bad">Bad</option>
   </select>
	
	<button type = "submit" name="action" value="rate">rate</button>
	
	</form>
</body>
</html>