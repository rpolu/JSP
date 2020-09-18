<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="resources/bootstrap.min.css" />
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="index.jsp">Home</a></li>
				</ul>

			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3>${message}</h3>
				<h2>User Login Form</h2>
				<form action="loginHeadMaster" method="post">
					<table>
						<tr>
							<td>User Name:</td>
							<td><input type="userName" name="userName" required /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" required /></td>
						</tr>
						<tr>
							<td colspan="1" align="center"><input type="submit"
								class="btn btn-default" value="Login" /></td>
							<td colspan="1" align="left"><a href="./studentreg.jsp">User
									Singup</a></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>

	<script src="resources/jquery.min.js"></script>
	<script src="resources/bootstrap.min.js"></script>
</body>
</html>