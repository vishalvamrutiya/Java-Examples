<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Add a Employee</h1>
<form:form action="/admin/employee/add" commandName="employee" > 	
	<table>
		<tr>
			<td><form:label path="name">Name:</form:label></td>
                        <td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="department">Department:</form:label></td>
			<td><form:input path="department" /></td>
		</tr>		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Add Employee" />	
			</td>
		</tr>
	</table>
</form:form>
<br/>
Employee List <br/>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Department</th>
		<th></th>
		<th></th>
	</tr>
	
</table>
</body>
</html>