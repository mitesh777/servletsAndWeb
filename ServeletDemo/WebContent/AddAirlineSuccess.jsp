<%@page import="com.pratian.travelapp.entity.Airline"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>added airline successfully</h2>
	<u><b>AIRLINES INFORMATION</b></u>
	<hr>
<%
//Airline airline = (Airline)request.getAttribute("airlines");
%>
<%--jsp:useBean id="airlines" scope="request" class="com.pratian.travelapp.entity.Airline"/>
<jsp:getProperty property = "airlineId" name = "airlines"/>
<jsp:getProperty property = "airlineName" name = "airlines"/>
<jsp:getProperty property = "serviceType" name = "airlines"/>
--%>
	<TABLE border="1">
		<tr> <th>Airlines id: </th>
			<td>
				${airlines.airlineId}
			</td>
		</tr>
		<tr> <th>Airlines name: </th>
			<td>
				${ airlines.airlineName}
			</td>
		</tr>
		<tr> <th>Airlines type: </th>
			<td>
				${ airlines.serviceType}
			</td>
		</tr>
	</TABLE>
	<h3>thank you</h3>
</body>
</html>