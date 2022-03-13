<%-- 
    Document   : login
    Created on : Sep 28, 2021, 1:04:08 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        
        <form class="box" action="MainController" method="POST"> 
            <h1>Login</h1>
            <span id="login-message"> ${requestScope.ERROR} </span>
            <input type="text" name="userID" placeholder="Username">
            <input type="password" name="password" placeholder="Password">
            <input type="submit" name="action" value="Login">   
            <a href="createUser.jsp">Register new account</a>
        </form>
    </body>
</html>
