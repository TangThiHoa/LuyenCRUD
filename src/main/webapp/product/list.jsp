<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/5/2022
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>
</head>
<body>
<form action="/products">
    <input type="text" name="name">
    <button>Search</button>

</form>
<h1>List of product</h1>
<c:forEach items="${ds}" var="p">
    <h2>${p.id} , ${p.name} , ${p.price},
    </h2>
</c:forEach>
</body>
</html>