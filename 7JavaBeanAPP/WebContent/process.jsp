<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="emp" class="com.elegant.Employee"/>

<jsp:setProperty property="name" name="emp" />
<jsp:setProperty property="phone" name="emp" />
<jsp:setProperty property="email" name="emp" />
<!DOCTYPE html>
<html>
<body>
	Record:
	<br>
	<jsp:getProperty property="name" name="emp" /><br>
	<jsp:getProperty property="phone" name="emp" /><br>
	<jsp:getProperty property="email" name="emp" /><br>
</body>
</html>