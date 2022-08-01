<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUSPC
  Date: 8/1/2022
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
  Data:
<c:forEach var="user" items="${listUsers}">
    <p><c:out value="${user.id}"/> </p>
    <p><c:out value="${user.username}"/> </p>
    <p><c:out value="${user.pass}"/> </p>
</c:forEach>
</body>
</html>
