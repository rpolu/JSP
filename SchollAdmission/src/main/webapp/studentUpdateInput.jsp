<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Update</title>
<link rel="stylesheet" href="resources/bootstrap.min.css" />
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h2>User Update Form</h2>
				<form action="updateServlet">
					<table>
					    <tr>
							<td>User Name:</td>
							<td><input type="text" name="userName" readonly="readonly" value="<c:out value="${st.userName}"/>" /> </td>
						</tr>
						<tr>
							<td>Phno:</td>
							<td><input type="text" name="phno" value="<c:out value="${st.phno}"/>" required="required" /></td>
						</tr>
						
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" value="<c:out value="${st.password}"/>" required="required" /></td>
						</tr>
						
						<tr>
							<td colspan="1" align="center"><input type="submit"
								class="btn btn-default" value="Update User" /></td>

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