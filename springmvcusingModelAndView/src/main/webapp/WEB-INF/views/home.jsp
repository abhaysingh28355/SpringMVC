<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<%
String name = (String) request.getAttribute("name");
String name1 = (String) request.getAttribute("name1");
%>

<h1>Hello my name is<%=name %></h1>
<h1>This ia a home page</h1>
<h1>My name is a<%=name1 %></h1>
</body>
</html>