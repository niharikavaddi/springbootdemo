<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using Thymeleaf</title>
</head>
<form action="save" method="post">
	<table>
		<tr>
			<td><label for="user-name">User Name</label></td>
			<td><input type="text" name="name"></input></td>
		</tr>
		<tr>
			<td><label for="email">Email</label></td>
			<td><input type="text" name="email"></input></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"></input></td>
		</tr>
	</table>
</form>
</body>
</html>