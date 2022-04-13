<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("user");
String password = request.getParameter("pwd");
for(int i=0; i<5; i++)
{
	%>
	 <%=name%> <%=password%>
	<%
}
%>
</body>
</html>

