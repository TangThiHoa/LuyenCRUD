<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/6/2022
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  action="/orders?action=edit&id=${sua.id}" method="post">

    <input type="text" name="time" value="${sua.time}">
    <input type="text" name="total" value="${sua.total}">
    <input type="text" name="customerId" value="${sua.customerId.id}">
    <button>Edit</button>

</form>
</body>
</html>
