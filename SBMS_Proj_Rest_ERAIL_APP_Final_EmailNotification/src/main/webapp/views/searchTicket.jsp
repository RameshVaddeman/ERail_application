<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Enter Passenger Info</h3>

	<form action="searchTicket_data" method="POST">
		<table>
			<tr>
				<td>Enter Ticket Id:</td>
				<td><input type="text" value="2" name="id"/></td>
			</tr>
			<tr>
			   <td>
				<input type="Submit" value="Submit Data" /> 
				<a href="/"><button type="Button">Go Home</button></a>
			   </td>
			</tr>
		</table>
	</form>
</body>
</html>