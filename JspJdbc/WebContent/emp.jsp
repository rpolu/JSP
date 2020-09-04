<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%!String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "system";
	String password = "tiger";
	String sqlquery = "insert into employee values(?,?,?)";%>
<%
	String eid = request.getParameter("eid");
String name = request.getParameter("name");
String sal = request.getParameter("sal");

try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url, userName, password);
	PreparedStatement pst = con.prepareStatement(sqlquery);
	pst.setString(1, eid);
	pst.setString(2, name);
	pst.setString(3, sal);
	pst.executeUpdate();
	pst.close();
	con.close();
} catch (Exception e) {

}
%>
<%@ include file="success.jsp"%>

