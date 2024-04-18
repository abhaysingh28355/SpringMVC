<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>first javaprogram</h1>
<h1>Hello SpringMVC</h1>
<h1>I will creating</h1>

<%

String name =(String) request.getAttribute("name");
Integer id =(Integer) request.getAttribute("id");


%>
<h1>Name is <%=name %></h1>
<h1>Id is<%=id %></h1>
</body>
</html>