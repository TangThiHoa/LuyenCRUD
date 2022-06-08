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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

</head>
<body>

<form action="/products">
    <input type="text" name="name" placeholder="Tìm theo tên">
    <input type="number" name="p1" placeholder="Nhập theo giá từ">
    <input type="number" name="p2" placeholder="đến">
    <button>Search</button>
</form>

<%--<h1>List of product</h1>--%>
<%--<c:forEach items="${ds}" var="p">--%>
<%--    <h2>${p.id} , ${p.name} , ${p.price},<a href="/products?action=edit&id=${p.id}">Edit</a>--%>
<%--        <a href="/products?action=delete&id=${p.id}">Delete</a>--%>

<%--    </h2>--%>
<%--</c:forEach>--%>
<body>
<a href="/products?action=create">Create</a>
<div class="container">
    <div class="row mt-2">
        <div class="col-9">
            <h2 style="text-align: center"><a href="/products">Product</a> </h2>
            <table class="table table-striped mt-3">
                <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Price</th>
                    <th scope="col">Quantity</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${ds}" var="st">
                    <tr>
                        <td>${st.name}</td>
                        <td>${st.price}</td>
                        <td>${st.quantity}</td>
                        <td>
                        <c:if test="${st.price >200}">Sale 10%</c:if>
                        <c:if test="${st.price <200}">Sale 20%</c:if>
                            <a class="btn btn-Primary" href="/products?action=view&id=${st.id}">View</a>
<%--                            <button type="button" class="btn btn-danger">Danger</button>--%>
                            <a class="btn btn-danger" href="/products?action=edit&id=${st.id}">Edit</a>
                            <a class="btn btn-secondary" href="/products?action=delete&id=${st.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</body>
</html>