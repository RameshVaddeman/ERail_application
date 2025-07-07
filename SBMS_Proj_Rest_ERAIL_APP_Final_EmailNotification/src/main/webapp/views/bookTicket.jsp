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

	<form action="insertData" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" value="" name="name" /></td>
			</tr>
			<tr>
				<td>From:</td>
				<td><input type="text" value="" name="from" /></td>
			</tr>
			<tr>
				<td>To:</td>
				<td><input type="text" value="" name="to" /></td>
			</tr>
			<tr>
				<td>Email Address:</td>
				<td><input type="text" value="" name="email" /></td>
			</tr>
			<tr>
			   <td>
				<input type="Submit" value="Submit Data" /> 
				<a href="/"><button type="Button">Go Home</button></a>
				<a href="searchTicket"> 
					<button type="Button">searchTicket</button>
				</a>
			   </td>
			</tr>
		</table>
	</form>
</body>
</html>