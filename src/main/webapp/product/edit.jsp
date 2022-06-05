<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/6/2022
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/products?action=edit&id=${sua.id}" method="post">
    <input type="text" name="name" value="${sua.name}">
    <input type="text" name="price" value="${sua.price}">
    <input type="text" name="quantity" value="${sua.quantity}">
    <button>Edit</button>
</form>
</body>
</html>
