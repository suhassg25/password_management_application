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
<form:form action="createapp" modelAttribute="application">

<form:label path="appname">APPName :</form:label>
		<form:input path="appname" />
		<br></br>

		<form:label path="username">UserName :</form:label>
		<form:input path="username" />
		<br></br>

		<form:label path="password1">Password :</form:label>
		<form:input path="password1" />
		<br></br>
		
		<br></br>

		<input type="submit"> <br> <hr>
		
		<a href="exit" >EXIT </a>
		

</form:form>

</body>
</html>