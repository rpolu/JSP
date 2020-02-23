<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> This is ArithmeticException Handling page </h1>
        <%
             out.println("Exception is " + exception.getMessage());
        %>
    </body>
</html>

