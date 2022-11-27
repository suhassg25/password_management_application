<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2px" >
<thead> <tr>
<th>Id</th>
<th>App Name</th>
<th>User Name</th>
<th>Password</th>
<th>Delete</th>
<th>Edit</th>
</tr>

</thead>
<c:forEach items="${slist}" var="application">
<tr>
<td>${application.id}</td>
<td>${application.appname}</td>
<td>${application.username}</td>
<td>${application.password1}</td>
<td> <a href="delete?id=${application.id}"> DELETE </a> </td>
<td> <a href="edit?id=${application.id}"> EDIT </a> </td>

</tr>


</c:forEach>


</table>
<hr>
<hr>
<td> <a href="login"> Exit </a> </td>
</body>
</html>