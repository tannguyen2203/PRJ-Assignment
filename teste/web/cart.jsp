<%-- 
    Document   : cart
    Created on : Oct 30, 2021, 10:35:28 AM
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
        <a href="Home.jsp">Continue shopping</a>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>  
                    <th>Product ID</th>
                    <th>product Name</th>         
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:set var="total" value="${0}"/>
                <c:forEach items="${sessionScope.CART.cart}" var="p" varStatus="counter">
                <form action="MainController">
                
                    <tr>
                        <td>${counter.count}</td>
                        <td>
                            <input type="text" name="productID" value="${p.value.productID}" readonly=""/>
                        </td> 
                        <td>
                            <input type="text" name="productName" value="${p.value.productName}" readonly=""/>
                        </td>                       
                        <td>
                            <input type="number" name="price" value="${p.value.price}" readonly=""/>
                           <c:set var="total" value="${total + p.value.price * p.value.quantity}" />
                        </td>
                        <td>
                            <input type="number" name="quantity" value="${p.value.quantity}" />
                        </td>
                        <td>
                            <input type="submit" name="action" value="UpdateItem"/>
                        </td>           
                    <td>
                        <input type="submit" name="action" value="Remove" />
                    </td>
                    </tr>
                    </form>
                </c:forEach>           
            </tbody>
        </table>
                <h1>Your total price is:${total}$</h1>
    </body>
</html>
