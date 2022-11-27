<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>$$$####@@@@........i am admin.....$$$####@@@@</h3>
	
	<h3>$$$####@@@@........app list assocciated with one user.....$$$####@@@@</h3>
	
	
	<table border="3px">
		<tr>
			<th>Id</th>
			<th>Appname</th>
			<th>username</th>
			<th>password1</th>
			<th>UserId</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserPassword</th>


		</tr>
		<c:forEach items="${appList}" var="application">
			<tr>
				<td>${application.id}</td>
				<td>${application.appname}</td>
				<td>${application.username}</td>
				<td>${application.password1}</td>
				<td>${application.getUser().id}</td>
				<td>${application.getUser().name}</td>
				<td>${application.getUser().email}</td>
				<td>${application.getUser().password}</td>
			</tr>
		</c:forEach>

	</table>
<br>
<br>
<h3>@@@@####$$$$.....user details........$$$$####@@@@</h3>
<br>
<br>
	<table border="3px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>UserName</th>
			<th>Email</th>
			<th>Password</th>
			
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>