<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<%
/* String name = (String) request.getAttribute("name");
String name1 = (String) request.getAttribute("name1"); */
%>

<h1>Hello my name is 
${name}
<%-- <%=name %> --%></h1>

<h1>This ia a rollno
${rollno}
</h1>
<h1>My name is a<%-- <%=name1 %> --%>
${name1}
</h1>
<hr>

<c:forEach var="item" items="${marks }">
<h1>${item}</h1>
</c:forEach>
</body>
</html>