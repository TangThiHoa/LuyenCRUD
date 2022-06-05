<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/5/2022
  Time: 2:59 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
</head>
<body>
<a href="/customers?action=create">Create</a>
<form action="/customers">
    <input type="text" name="name">
    <button>Search</button>

</form>
<h1>List of customer</h1>
<c:forEach items="${ds}" var="cus">
    <h2>${cus.id} , ${cus.name} , ${cus.age},<a href="/customers?action=edit&id=${cus.id}">Edit</a>
        <a href="/customers?action=delete&id=${cus.id}">Delete</a>


    </h2>
</c:forEach>
</body>
</html>