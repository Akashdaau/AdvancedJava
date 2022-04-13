<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello</title>
</head>
<body>
<%
int i=0;
while (i< 5){
%>
<h1><%=i+1%> hello java</h1>
<%
i++;
}
%>
</body>
</html>
