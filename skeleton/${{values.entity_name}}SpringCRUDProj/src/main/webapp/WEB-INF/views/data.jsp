<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${{values.entity_name}} Data Page</title>
</head>
<body>

	<h2>Welcome To ${{values.entity_name}} Data Page</h2>

	<c:if test="${empty list}">
		<h4>No Data Found</h4>
	</c:if>


	<c:if test="${!empty list}">

		<table border=>
			<tr>
				<th>Id</th>
				<th>${{values.parameter1}}</th>
				<th>${{values.parameter2}}</th>
				<th>${{values.parameter3}}</th>
			</tr>

			<c:forEach items="${list}" var="ob">
				<tr>
					<td>${ob.id}</td>
					<td>${ob.${{values.parameter1}}}</td>
					<td>${ob.${{values.parameter2}}}</td>
					<td>${ob.${{values.parameter3}}}</td>
					<td><a href="/${{values.entity_name}}SpringBootCRUDProj/view?id=${ob.id}">View</a></td>
				</tr>
			</c:forEach>

		</table>

	</c:if>

	<a href="/${{values.entity_name}}SpringBootCRUDProj/reg">Register</a> ${msg} &nbsp;
	<a href="/${{values.entity_name}}SpringBootCRUDProj/">Home</a> ${msg}

</body>
</html>