<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link rel="stylesheet" href="resources/bootstrap.min.css" />
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h2>User SignUp Form</h2>
				<form action="sas" method="post">
					<table>
						<tr>
							<td>Roll Num:</td>
							<td><input type="text" name="rollNum" required /></td>
						</tr>
						<tr>
							<td>First Name:</td>
							<td><input type="text" name="firstName" required /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><input type="text" name="lastName" required /></td>
						</tr>
						<tr>
							<td>Email :</td>
							<td><input type="text" name="email" required /></td>
						</tr>
						<tr>
							<td>Phno:</td>
							<td><input type="text" name="phno" required /></td>
						</tr>
						<tr>
							<td>User Name:</td>
							<td><input type="text" name="userName" required /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" required /></td>
						</tr>
						<tr>
							<td>Gender:</td>
							<td><input type="radio" name="gender" value="Male"   /> Male
								<input type="radio" name="gender" value="Female" /> Female
								<input type="radio" name="gender" value="Other"  /> Other</td>
							</td>
						</tr>
						<tr>
							<td>Known Languages:</td>
							<td>
								<input type="checkbox" name="knownLanguages" value="English" /> English
								<input type="checkbox" name="knownLanguages" value="Hindhi"   /> Hindhi
								<input type="checkbox" name="knownLanguages" value="Telugu"   /> Telugu
								<input type="checkbox" name="knownLanguages" value="Odiya"    /> Odiya
								<input type="checkbox" name="knownLanguages" value="kannada"  /> Kannada
							</td>
						</tr>
						<tr>
							<td colspan="1" align="center"><input type="submit"
								class="btn btn-default" value="Save User" /></td>

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