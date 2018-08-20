<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>List of all airlines</h2>
	
	<table>
	<tr><th> Airlines ID</th> <th> Airlines Name </th> <th> SERVICE TYPE</th></tr>
	<c:forEach var="airlines" items="${airlinesList}">
	<tr>
		<td>${airlines.airlineId}</td>
		<td>${airlines.airlineName}</td>
		<td>${airlines.serviceType}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>