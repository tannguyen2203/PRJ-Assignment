<%-- 
    Document   : createUser
    Created on : Oct 5, 2021, 2:06:26 PM
    Author     : Admin
--%>

<%@page import="sample.user.UserError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIGN UP PAGE</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    </head>
    <body>
        <div class="well">
        <form action="MainController" method="POST">
            <h1>SIGN UP FORM</h1>
            User ID(*)<input type="text" name="userID" required=""/>
            ${requestScope.ERROR_USER.userID}</br>
            Name(*)<input type="text" name="Name" required=""/>
            ${requestScope.ERROR_USER.errorName}</br>            
            Address(*)<input type="text" name="address" required=""/>
            ${requestScope.ERROR_USER.address}</br>            
            Phone(*)<input type="text" name="phone" required=""/>
            ${requestScope.ERROR_USER.phone}</br>           
            Password(*)<input type="password" name="password" required=""/>
            ${requestScope.ERROR_USER.password}</br>
            Confirm(*)<input type="password" name="confirm" required=""/>
            ${requestScope.ERROR_USER.confirm}</br>
            <input type="submit" name="action" value="Create"/>
            <input type="reset" name="Reset"/>
        </form>
            <a href="login.jsp">Return to login page</a>
        </div>
    </body>
</html>
