<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Training Department</title>

<!-- Bootstrap CSS -->
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
</head>

<body>

	<!-- Header start -->
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

	<!-- nav bar -->
	<!-- Header end -->

	<br>
	<br>
	<br>
	<br>
	<br>

	<!-- About us start -->
	<div class="container">
		<div class="row ">

			<div class="col-12 mx-auto">
				<img
					src="https://etimg.etb2bimg.com/thumb/msid-84573091,width-1200,resizemode-4/.jpg"
					alt="" class="img-fluid">
			</div>
			<div class="col-10 mt-5 mx-auto  ">
				<h2 class="text-center">About Training Department</h2>

				<h5 class="text-center">At our organization, we take pride in
					offering an extensive variety of courses and programs to cater to
					your professional development needs. Whether you're looking to
					upgrade your skills or boost your career prospects, we've got you
					covered. Our team of seasoned trainers is committed to delivering
					top-notch training and support that can help you achieve your
					objectives. We understand that everyone's career aspirations are
					unique, which is why we've curated a diverse range of courses and
					programs that are tailored to cater to a wide array of interests
					and skill sets. Our comprehensive curriculum covers everything from
					technical and vocational training to leadership and management
					development. Furthermore, our trainers are experienced and
					knowledgeable in their respective fields, ensuring that you receive
					the best training possible. They will work with you every step of
					the way to provide personalized guidance and support, helping you
					to achieve your full potential. In summary, our institution offers
					a comprehensive range of courses and programs, led by experienced
					trainers who are passionate about helping you succeed. We are
					committed to providing high-quality training and support that can
					help you enhance your skills, broaden your knowledge, and advance
					your career.</h5>
				<p class="text-center">
					<a href="<%=request.getContextPath()%>/new"
						class="btn btn-primary buybutton" style="width: 30%;">Register</a>
				</p>
			</div>
		</div>
	</div>
	<!-- About us end -->

</body>
</html>
