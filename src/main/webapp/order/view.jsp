<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/6/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Order</h1>
<p>
    <a href="/orders">Back to order list</a>
</p>
<table>
    <tr>
        <td>ID: </td>
        <td>${st.id}</td>
    </tr>
    <tr>
        <td>Total: </td>
        <td>${st.total}</td>
    </tr>
    <tr>
        <td>CustomerName: </td>
        <td>${st.customerId.name}</td>
    </tr>
    <tr>
        <td>CustomerId: </td>
        <td>${st.customerId.id}</td>
    </tr>
</table>

</body>
</html>
