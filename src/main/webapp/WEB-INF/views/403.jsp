<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>403 - Page</title>
</head>
<body>
<h1>HTTP Status 403 - Access is denied</h1>
	<h2><c:if test="${!empty pageContext.request.userPrincipal.name}">
	Username : ${pageContext.request.userPrincipal.name} <br/>
	</c:if>You do not have permission to access this page!</h2>

</body>
</html>
