<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="text-center">Login User</h2>
			</div>
			<h3 style="color:red"><%=request.getAttribute("msg") %></h3>
			<div class="panel-body">
                <form method="POST" action="dang-nhap">
				<div class="form-group">
					<label for="email">Email:</label>
					 <input required="true" type="email" class="form-control" id="email" name="email" />
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> 
					<input required="true" type="password" class="form-control" id="pwd" name="password" />
				</div>
			
		
				<button class="btn btn-success">Register</button>
			</div>
                </form>
		</div>
	</div>
</body>
</html>