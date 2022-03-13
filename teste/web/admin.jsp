<%-- 
    Document   : admin
    Created on : Sep 28, 2021, 1:25:14 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="sample.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>

    </head>
    <body>
              <table border="1">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Product ID</th>
                            <th>product Name</th>
                            <th>Images</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Category</th>
                            <th>Update</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>    
                    <a href="AddProduct.jsp">Add new product</a>  
                        <h1>Update note</h1>
                        <ul>
                            <li>CategoryID = 1: Vegetable <br>
                                CategoryID = 2: Fruit</li>
                        </ul>
                    <c:forEach items="${sessionScope.Listp}" var="p" varStatus="counter" >
                    
                        <form action="MainController" method="POST">
                            <tr>
                                <td>${counter.count}</td>
                                <td>
                                    <input type="text" name="productID" value="${p.productID}" readonly=""/>                               
                                </td>
                                
                                <td>
                                    <input type="text" name="productName" value="${p.productName}" required=""/>
                                    ${requestScope.ERROR_UPDATE.productName}
                                </td>
                                <td>
                                    <input type="text" name="image" value="${p.image}" required=""/>
                                   
                                </td>
                                <td>
                                    <input type="number" name="price" min="1" value="${p.price}" required=""/>
                                </td>
                                <td>
                                    <input type="number" name="quantity" min="1" value="${p.quantity}" required=""/>
                                </td>
                                <td>
                                    <input type="text" name="categoryID" value="${p.categoryID}" required=""/>
                                </td>
                                <td>
                                    <input type="submit" name="action" value="Update"/>
                                </td>
                                <td>            
                                    <a href="DeleteController?pid=${p.productID}">Delete</a>
                                </td>
                            </tr>
                        </form>
                    </c:forEach>
                </tbody>
            </table>
                        
        
        
        
    <c:if test="${sessionScope.LOGIN_USER ne null}">
        <li><a class="nav" href="MainController?action=Logout">Logout</a><li>
    </c:if>
</body>
</html>
