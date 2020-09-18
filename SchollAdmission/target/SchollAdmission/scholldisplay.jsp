<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Username</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach var="student" items="${studentsList}">
			<tr>
				<td><c:out value="${student.firstName}" />
				<td><c:out value="${student.email}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>