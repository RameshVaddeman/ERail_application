<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Please find you Ticket Details</h2>
	<table>
		<tr>
			<td>Ticket ID :</td>
			<td>${ticket.ticketId}</td>
		</tr>
		<tr>
			<td>Ticket Status :</td>
			<td>${ticket.ticketStatus}</td>
		</tr>
		<tr>
			<td>Ticket Cost :</td>
			<td>${ticket.tktCost}</td>
		</tr>
		<tr>
			<td>From :</td>
			<td>${ticket.from}</td>
		</tr>
		<tr>
			<td>To :</td>
			<td>${ticket.to}</td>
		</tr>
		<tr>
	        <td>Email Id :</td>
		    <td>${ticket.email}</td>
        </tr>
	</table>

	<a href="/">Go Home</a>
</body>
</html>