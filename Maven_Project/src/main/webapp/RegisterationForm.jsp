<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterationForm</title>
</head>
<body bgcolor="cyan">
	<form action="RegisterationController" method="post">

		<h1 align="center">Registration Form</h1>
		
		<hr>
		<table align="center">

			<tr>
				<th>First Name</th>
				<td><input type="text" name="FName"></td>
			
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="LName"></td>
				
			</tr>
			<tr>
				<th>Email Address</th>
				<td><input type="email" name="Email"></td>
			</tr>
			<tr>
				<th>Contact</th>
				<td><input type="number"  name="Contact"></td>
			<tr>
				<th>Address</th>
				<td><input type="text" placeholder="line1" name="Address"></td>
			</tr>
			<tr>
				<th>Create Password</th>
				<td><input type="number"  name="Password"></td>

			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="Register">
			</tr>
		</table>

	</form>
	<hr>
	</body>