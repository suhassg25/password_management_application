<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="update" modelAttribute="application">

<table>
<tr> <td><form:label path="id">ID :</form:label> </td>
<td><form:input path="id" readonly="true"/> </td>
</tr>
<tr> <td><form:label path="appname">APP NAME :</form:label> </td>
<td><form:input path="appname"/> </td>
</tr>
<tr> <td> <form:label path="username">User Name :</form:label>
 </td>
<td><form:input path="username"/> </td>
</tr>

<tr> <td> <form:label path="password1">Password :</form:label>
 </td>
<td><form:input path="password1"/>  </td>
</tr>



<input type="submit" value="SUBMIT">
</form:form>
</body>
</html>