<%!
	int a = 12;
	int b = 25;
	// this 2 variables becomes data memebers in Container generated Servlet
%>

<%!
    int  c = 12;
	int  d = 25;
	int  k;
	
	// this 2 variables becomes data memebers in Container generated Servlet
%>

<%
int e = a + b + c + d + k;
System.out.println("Hellow World");
// this is as part of service in the Container generated Servlet
%>

<%=e %>







