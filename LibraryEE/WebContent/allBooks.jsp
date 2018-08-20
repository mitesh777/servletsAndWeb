<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All books</title>
</head>
<body>
	<h2>List of all books</h2>
	
	<table>
	<tr>
	<!-- <th> Book ID</th> <th> ISBN </th> -->
	<th> Title </th>
	<!-- <th> Publication </th> <th> Category </th> 
	<th> Price </th> <th> Stock Count </th> <th> authorId </th>  -->
	</tr>
	<c:forEach var="books" items="${allBooksList}">
	<tr>
		<td><a href="ViewBookServlet?bookId=${books.id}">${books.title}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>