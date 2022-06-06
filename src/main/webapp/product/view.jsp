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
        <td>${st.id}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${st.name}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${st.price}</td>
    </tr>
    <tr>
        <td>Quantity: </td>
        <td>${st.quantity}</td>
    </tr>
</table>
</body>
</html>
