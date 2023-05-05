<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${{values.entity_name}} Register/Edit Page</title>
</head>
<body>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<h3>Welcome to ${{values.entity_name}} Edit Page</h3>
		<c:set var="eid"  value="${id}" ></c:set>
	</c:when>
	<c:otherwise>
		<h3>Welcome to ${{values.entity_name}} Registration Page</h3>
	</c:otherwise>
</c:choose>

<pre>
<form:form action="save" method="post" modelAttribute="objOf${{values.entity_name}}">

<c:if test="${'edit' eq mode }">
Id     : <form:input path="id"  readOnly="true"/>	
</c:if>

${{values.parameter1}}     : <form:input path="${{values.parameter1}}"/>

${{values.parameter2}}   	 : <form:input path="${{values.parameter2}}"/>

${{values.parameter3}}   : <form:input path="${{values.parameter3}}"/>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<input type="submit" value="Update ${{values.entity_name}}">
	</c:when>
	<c:otherwise>
		<input type="submit" value="Register ${{values.entity_name}}">
	</c:otherwise>
</c:choose>

</form:form>

</pre>

${msg}

<a href="/${{values.entity_name}}SpringBootCRUDProj/all">Show All</a> &nbsp;
<a href="/${{values.entity_name}}SpringBootCRUDProj/">Home</a>



</body>
</html>