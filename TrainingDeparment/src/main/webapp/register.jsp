<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.trainingproject.model.Course"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Training Program</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

<!-- Font Awesome icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="All.css">

<!-- Bootstrap JS dependencies -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta content="" name="description">
<meta content="" name="keywords">
<link href="style.css" rel="stylesheet" type="text/css">
<style>
.container {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	width: 400px;
	background-color: #f9f9f9;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

label {
	display: block;
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 10px;
}

input[type="text"], input[type="email"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 20px;
	border-radius: 5px;
	border: none;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
	font-size: 16px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	font-size: 18px;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #3e8e41;
}

input[type="reset"] {
	background-color: #4CAF50;
	color: #fff;
	font-size: 18px;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="reset"]:hover {
	background-color: #3e8e41;
}

body {
	background-color: #696969;
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
	<div class="container">
		<form action="insert" method="post">
			<label for="name">Student Name</label> <input type="text" id="name"
				name="username" placeholder="Student Name.." required> <label
				for="email">Email</label> <input type="email" id="emailid"
				name="emailid" placeholder="Email" required> <label
				for="course">Course Name</label> <select name="coursename"
				id="coursename" required>
				<%
				//getattribute
				if (request.getAttribute("listCourse") != null) {
					List<Course> listCourse = (List<Course>) request.getAttribute("listCourse");
					for (Course i : listCourse) {
				%>

				<option value="<%=i.getCourseName()%>"><%=i.getCourseName()%></option>
				<%
				}
				}
				%>

			</select> <input type="submit" value="Register">


		</form>
	</div>

</body>
</html>
