<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/6/2022
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/orders?action=create" method="post">
    <input type="text" name="id">
    <input type="text" name="total">
    <input type="text" name="customerId">
    <button>Click</button>

</form>
</body>
</html>
