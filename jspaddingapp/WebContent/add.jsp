<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<center>

		<%
			String n1 = request.getParameter("n1");
		    String n2 = request.getParameter("n2");
		    int c= Integer.parseInt(n1)+ Integer.parseInt(n2);
		%>
		
		<h3><%=  "The sum is : " +c %></h3>


	</center>
</body>
</html>