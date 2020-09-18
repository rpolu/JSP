<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scholl Admin Info</title>
<style type="text/css">
    body{
        text-align: center;
    }
    table {
        margin-left: 15%;
        min-width: 70%;
        border: 1px solid #CCC;
        border-collapse: collapse;
    }
    table tr{line-height: 30px;}
    table tr th { background: #000033; color: #FFF;}
    table tr td { border:1px solid #CCC; margin: 5px;}
    input[type=text], input[type=email], input[type=tel]{
        min-width: 60%;
    }
    input[type=submit], a{
        background: green;
        padding: 5px;
        margin: 5px;
        color: #FFF;
    }
    a{
        text-decoration: none;
    }
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>Roll Num</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phno</th>
			<th>User Name</th>
			<th>Gender</th>
			<th>Known Languages</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${studentsList}" var="s">
		   <tr>
			<td><c:out value="${s.rollNum}" /></td>
			<td><c:out value="${s.firstName}"/></td>
			<td><c:out value="${s.lastName}"/></td>
			<td><c:out value="${s.email}"/></td>
			<td><c:out value="${s.phno}"/></td>
			<td><c:out value="${s.userName}"/></td>
			<td><c:out value="${s.gender}"/></td>
			<td><c:out value="${s.knownLanguages}"/></td>
			<td><a href="./deleteServlet?userName=<c:out value='${s.userName}'/>">Delete</a> 
			    <a href="./updateServlet?pageAction=inpupUpdate&userName=<c:out value='${s.userName}'/>">Update</a>
			    <a href="./studentreg.jsp">Add Student</a> 
		    </tr>
		</c:forEach>
		
	</table>
</body>
</html>