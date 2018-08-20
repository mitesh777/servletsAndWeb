<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library</title>
<div></div>
<h2><u>Home</u></h2>
</head>
<body>
	<% 
		String user =(String)request.getSession().getAttribute("user");
	%>
	 <div align="right">
  		<%= user %><br>
  		<a href = "LogoutServlet"> Logout </a>
	</div> 
	<a href = "ViewBooksServlet"> View books </a><br>
	<a href = "ViewBooksByCategoryServlet"> View books by category </a><br>
	<a href = "LogoutServlet"> Search book by ISBN </a><br>	
</body>
</html>