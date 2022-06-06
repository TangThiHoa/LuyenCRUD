<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/5/2022
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>
<a href="/orders?action=create">Create</a>
<div class="container">
    <div class="row mt-2">
        <div class="col-9">
            <h2 style="text-align: center">List order</h2>
            <table class="table table-striped mt-3">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Total</th>
                    <th scope="col">CustomerId</th>
                    <th scope="col">CustomerName</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${ds}" var="st">
                    <tr>
                        <td>${st.id}</td>
                        <td>${st.total}</td>
                        <td>${st.customerId.id}</td>
                        <td>${st.customerId.name}</td>
                        <td>
                            <a class="btn btn-Primary" href="/orders?action=view&id=${st.id}">View</a>
                                <%--                            <button type="button" class="btn btn-danger">Danger</button>--%>
                            <a class="btn btn-danger" href="/orders?action=edit&id=${st.id}">Edit</a>
                            <a class="btn btn-secondary" href="/orders?action=delete&id=${st.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
