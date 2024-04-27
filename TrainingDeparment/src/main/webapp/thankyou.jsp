<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.trainingproject.model.CourseRegister"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Training Program</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Bootstrap CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<style>
body {
	background-color: #696969;
	color: #333333;
	font-family: Arial, sans-serif;
}

.content-section {
	margin-top: 50px;
	margin-bottom: 50px;
	text-align: center;
}

.content-text {
	background-color: white;
	border-radius: 10px;
	padding: 20px;
	box-shadow: 0px 0px 20px #888888;
	display: inline-block;
	text-align: left;
	max-width: 80%;
	margin: 0 auto;
}

.btn {
	color: black;
	background-color: white;
	text-decoration: none;
	border: 5px solid white;
	border-radius: 10%;
	font-size: 20px;
	padding: 10px 20px;
	margin-top: 20px;
}

.btn:hover {
	color: white;
	background-color: black;
	text-decoration: none;
	border: 5px solid white;
	border-radius: 10%;
	font-size: 20px;
	padding: 10px 20px;
	margin-top: 20px;
}

.table {
	margin-top: 30px;
	width: 100%;
	max-width: 80%;
	margin: 0 auto;
	border-collapse: collapse;
	border-spacing: 0;
	border: 1px solid #dee2e6;
	color: #212529;
	font-size: 16px;
	text-align: left;
}

.table th, .table td {
	padding: 0.75rem;
	vertical-align: top;
	border-top: 1px solid #dee2e6;
}

.table thead th {
	vertical-align: bottom;
	border-bottom: 2px solid #dee2e6;
}

.table tbody+tbody {
	border-top: 2px solid #dee2e6;
}

.table .table {
	background-color: #fff;
}

.centered-button {
	display: block;
	margin: 0 auto;
	background-color: #007bff;
	color: white;
	text-decoration: none;
	border: none;
	border-radius: 10px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s ease-in-out;
	padding: 10px 20px;
}

.centered-button:hover {
	background-color: #0062cc;
}
</style>

</head>

<body>
	<nav
		style="box-shadow: 0 4px 8px 0 rgba(105, 105, 105, 0.2), 0 6px 20px 0 rgba(116, 116, 116, 0.19);"
		class="navbar fixed-top navbar-expand-lg navbar-light bg-light">

		<a class="navbar-brand" href="index.jsp">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Training Department</b>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">


		</div>
	</nav>
<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	

	<div class="content-section">
		<div class="content-text">
			<h1 style="font-size: 30px; text-align: center">
				<b>Register Successfully</b>
			</h1>


			<table class="table">
				<%
				if (request.getAttribute("Course") != null) {
					CourseRegister courseDetails = (CourseRegister) request.getAttribute("Course");
				%>

				<tr>

					<td>Name</td>
					<td>Email</td>
					<td>Course</td>
					<td>Price</td>

				</tr>
				<tr>
					<td><%=courseDetails.getUserName()%></td>
					<td><%=courseDetails.getEmailId()%></td>
					<td><%=courseDetails.getCourseName()%></td>
					<td>$<%=courseDetails.getPrice()%></td>
				</tr>

				<%
				}
				%>
			</table>
			<br> <br>
			<div style="display: flex; justify-content: center;">
				<a href="<%=request.getContextPath()%>/index">
					<button class="centered-button">Back to home page</button>
				</a>
			</div>




		</div>
	</div>
</body>
</html>
