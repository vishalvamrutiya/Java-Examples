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
		<c:if test="${employee.id != 0}">
	<tr>
		<td>
			<form:label path="id">
				ID
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
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
			<c:if test="${employee.id ==0 }">
<input type="submit" value="Add Employee" />
</c:if><c:if test="${employee.id !=0 }">
<input type="submit" value="Edit Employee" />
</c:if>
					
			</td>
		</tr>
	</table>
</form:form>
<br/>
Employee List <br/>
<c:if test="${!empty list}">
<table border="2">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Department</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${list}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.department}</td>
			<td><a href="<c:url value='/admin/employee/edit/${employee.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/admin/employee/remove/${employee.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
</table>
</c:if>
</body>
</html>