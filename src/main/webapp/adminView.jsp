<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<<<<<<< refs/remotes/origin/punithraj
<body>

=======
<body align="center">
	 <div align="center">
	<table border="5px solid red">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>View</th>
			
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td><a href="viewForAdmin?id=${user.id}">view</a></td>

			</tr>
		</c:forEach>

	</table>
	</div>
>>>>>>> local
</body>
</html>