<%@page contentType="text/html" pageEncoding="UTF-8"
	errorPage="ArithmeticExceptionHandler.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Learning Exceptions</title>
</head>
<body>
	<h1>Learning Exceptions - Exception Handling via JSP Page</h1>
	<%
		int a = 1;
		int b = 2;
		int c = 0;
		int d = b / c;
	%>
	<%=d%>
	<h3>Good bye</h3>
</body>
</html>