<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/5/2022
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customers?action=edit&id=${sua.id}" method="post">
    <input type="text" name="name" value="${sua.name}">
    <input type="text" name="age" value="${sua.age}">
    <button>Edit</button>
</form>

</body>
</html>

</body>
</html>
