<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${{values.entity_name}} Error Page</title>
</head>
<body>
<h2>There was some error, Please go to the Home Page</h2>
<a href="/${{values.entity_name}}SpringBootCRUDProj/">Home</a> &nbsp;
</body>
</html>
