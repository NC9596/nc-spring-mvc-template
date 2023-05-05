<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${{values.entity_name}} View Page</title>
</head>
<body>

<h2>Welcome to ${{values.entity_name}} View Page</h2>

<table border=>

<tr>
	<th>Id</th>
	<td>${objOf${{values.entity_name}}.id}</td>
</tr>
<tr>
	<th>name</th>
	<td>${objOf${{values.entity_name}}.${{values.parameter1}}}</td>
</tr>
<tr>
	<th>phNum</th>
	<td>${objOf${{values.entity_name}}.${{values.parameter2}}}</td>
</tr>
<tr>
	<th>email</th>
	<td>${objOf${{values.entity_name}}.${{values.parameter3}}}</td>
</tr>

<tr>
	<th>Delete</th>
	<td>
		<a href="/${{values.entity_name}}SpringBootCRUDProj/delete?id=${emp.id}">Delete</a>
	</td>
</tr>
<tr>
	<th>Update</th>
	<td>
		<a href="/${{values.entity_name}}SpringBootCRUDProj/getUpdate?id=${emp.id}">Update</a>
	</td>
</tr>

</table>

<a href="/${{values.entity_name}}SpringBootCRUDProj/all">View All</a> &nbsp;
<a href="/${{values.entity_name}}SpringBootCRUDProj/reg">Register</a> &nbsp;
<a href="/${{values.entity_name}}SpringBootCRUDProj/">Home</a>

${msg}

</body>
</html>