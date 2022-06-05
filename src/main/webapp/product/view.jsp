<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/6/2022
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>ID: </td>
        <td>${requestScope["st"].getId}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["st"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["st"].getPrice}</td>
    </tr>
    <tr>
        <td>Quantity: </td>
        <td>${requestScope["st"].quantity}</td>
    </tr>
</table>
</body>
</html>
