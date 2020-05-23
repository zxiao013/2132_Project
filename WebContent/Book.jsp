<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Your Room</title>
</head>
<body>
	<h2>Please follow the prompt and book your room!</h2>
	
	<form action="book" method= "post">
		GuestID: <input type= "text" name= "Guest Id" id= "Guest Id"><br>
		Property owned by host(ID): <input type= "text" name= "Property Id" id= "Propety Id"><br>
		Time in: <input type= "date" name= "start_date" /><br>
		Time out: <input type= "date" name= "end_date" />
		Payment: <select>
		<option value= "Cash">Cash</option>
		<option value= "Check">Check</option>
		<option value= "Credit Card">Credit Card</option>
		<option value= "Direct Debit">Direct Debit</option>
		</select><br>
		Signing date: <input type= "date" name= "signing_date" /><br>
		<button type= "submit" name= "action" value= "book">book</button>
	</form>


</body>
</html>