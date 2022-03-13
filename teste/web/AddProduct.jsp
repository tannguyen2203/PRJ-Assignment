<%-- 
    Document   : AddProduct
    Created on : Oct 30, 2021, 1:32:09 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="MainController" method="POST">
            <h1>ADD NEW PRODUCT</h1>
            Product ID(*)<input type="text" name="productID" required=""/>
            ${requestScope.ERROR_PRODUCT.productID}</br>
            Product Name(*)<input type="text" name="productName" required=""/>
            ${requestScope.ERROR_PRODUCT.productName}</br>            
            Images(*)<input type="text" name="image" required=""/>
            ${requestScope.ERROR_PRODUCT.image}</br>            
            Price(*)<input type="number" name="price" min="1" required=""/></br>           
            Quantity(*)<input type="number" name="quantity" min="1" required=""/><br>
            Category ID
            <select name="CategoryID">
                <c:forEach items="${sessionScope.Listc}" var="o">
                    <option value="${o.categoryID}">${o.cName}</option>                   
            </c:forEach>
            </select> <br>
            <input type="submit" name="action" value="AddProduct"/>
            <input type="reset" name="Reset"/>
        </form>
    </body>
</html>
