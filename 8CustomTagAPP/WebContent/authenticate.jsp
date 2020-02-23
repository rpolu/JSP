<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="data" uri="/WEB-INF/tlds/authenticate.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<data:authenticate username='<%=request.getParameter("username")%>'
		password='<%=request.getParameter("password")%>' />

</body>
</html>