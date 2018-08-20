<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cart</title>
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
	<c:forEach var="books" items="${basket}">
	<tr>
		<td><a href="ViewBookServlet?bookId=${books.id}">${books.title}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>