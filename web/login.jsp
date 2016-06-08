<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style type="text/css"><%@include file='css/pure-min.css' %></style>
    <script src=js/validate.js></script>

</head>
<body>

<br><br><br>
<div align="center">
<form class="login">

    <p>
        <label for="username">Логин:</label>
        <input type="text" name="username" id="username" >
    </p>

    <p>
        <label for="password">Пароль:</label>
        <input type="password" name="password" id="password">
    </p>

    <a href="/" id="login">
        <button type="submit" id="submit" class="pure-button pure-button-primary">Login</button></a>

</form>
</div>

</body>
</html>
