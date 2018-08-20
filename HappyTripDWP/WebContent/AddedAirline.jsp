<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pratian.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Airline added</title>
</head>
<body>
<h2> Airline added successfully</h2>
<h3>
<%Airline airline=(Airline)request.getAttribute("airline") ; %>
Airline Id : <%=airline.getAirlineId() %><br>
Airline Name : <%=airline.getAirlineName() %><br>
Airline Logo : <%=airline.getAirlineLogo() %>
<a href="Index.jsp"> Back to index </a>
</h3>
</body>
</html>