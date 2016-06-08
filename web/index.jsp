<%@ page import="dao.dao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Database</title>

    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
    <meta name="description" content="Business website">
    <meta name="keywords" content="business, website">

    <style type="text/css">
        <%@include file='css/pure-min.css' %>
    </style>
    <script src=js/validate.js></script>

</head>
<body>
<%
    request.setAttribute("users", new dao().getUsers());
    request.setAttribute("cars", new dao().getCars());
    request.setAttribute("masters", new dao().getMasters());
%>
<h3><a href="/login.jsp">ReLogin</a></h3>
<div>
<table id="Users" class="pure-table pure-table-bordered">

    <thead>
    <tr>
        <th></th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Age</th>
        <th>Passport Series</th>
        <th>Passport Number</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="User">
        <tr>
            <td><c:out value="${User.ID}"/></td>
            <td><c:out value="${User.firstName}"/></td>
            <td><c:out value="${User.lastName}"/></td>
            <td><c:out value="${User.email}"/></td>
            <td><c:out value="${User.age}"/></td>
            <td><c:out value="${User.PSeries}"/></td>
            <td><c:out value="${User.PNumber}"/></td>

        </tr>
    </c:forEach>
    </tbody>


</table>
</div>
</br>
<div>
<table id="Cars" class="pure-table pure-table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Model</th>
        <th>Color</th>
        <th>User ID</th>
        <th>Master ID</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cars}" var="Car">
        <tr>
            <td><c:out value="${Car.ID}"/></td>
            <td><c:out value="${Car.model}"/></td>
            <td><c:out value="${Car.color}"/></td>
            <td><c:out value="${Car.userID}"/></td>
            <td><c:out value="${Car.masterID}"/></td>

        </tr>
    </c:forEach>
    </tbody>

</table>
</div>

<div>
    <table id="Masters" class="pure-table pure-table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Stage</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${masters}" var="Master">
            <tr>
                <td><c:out value="${Master.ID}"/></td>>
                <td><c:out value="${Master.name}"/></td>
                <td><c:out value="${Master.stage}"/></td>

            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
</body>
</html>