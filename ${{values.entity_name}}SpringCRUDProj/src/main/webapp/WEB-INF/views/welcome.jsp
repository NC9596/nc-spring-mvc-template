<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${{values.entity_name}} Welcome Page</title>
</head>
<body>

<h2>Welcome to ${{values.entity_name}} Website</h2>

<a href="/${{values.entity_name}}SpringBootCRUDProj/all">View All</a> &nbsp;
<a href="/${{values.entity_name}}SpringBootCRUDProj/reg">Register</a>

</body>
</html>