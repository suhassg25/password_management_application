<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<div align="center">
		<table border="5px">
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

	</div>
</body>
</html>