<%@page import="sample.user.UserDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Long Green's Shop</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="css/HomeCss.css"/>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
        <script type="text/javascript" src="js/boxOver.js"></script>
    </head>

    <body>
        <div id="main_container">
            <div id="header">
                <div class="top_right">
                    <div class="languages">
                        <div class="lang_text">Languages:</div>
                        <a href="#" class="lang"><img src="images/en.gif" alt="" border="0" /></a> <a href="#" class="lang"><img src="images/de.gif" alt="" border="0" /></a> </div>
                    <div class="big_banner"> <img src="images/vegetables.jpg" alt="" border="0" /></a> </div>
                </div>
                <div id="logo"> <img src="images/WEBICON.jpg" alt="" border="0" width="182" height="85" /></a> </div>
            </div>

            <%
                UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
                if (loginUser == null) {
                    loginUser = new UserDTO();
                }
            %>

            <div id="main_content">
                <div id="menu_tab">
                    <ul class="menu">
                        <li><a href="LoadProducts" class="nav"> Home </a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Contact Us</a></li>
                        <li class="divider"></li>
                            <c:url var="logoutLink" value="MainController">
                                <c:param name="action" value="Logout"></c:param>
                            </c:url>

                        <c:if test="${sessionScope.LOGIN_USER ne null}">
                            <li><a class="nav" href="${logoutLink}">Logout</a><li>
                                    <li class="nav" id="welcome">Welcome user:<%= loginUser.getName()%></li>
                                    <li class="divider"></li>
                                    </c:if>

                                <li class="divider"></li> 

                                <c:if test="${sessionScope.LOGIN_USER eq null}">
                                    <li><a class="nav" href="./login.jsp">Login</a><li>
                                            <li class="divider"></li>
                                            </c:if>
                                            
                                            <form action="MainController" class="search">
                <input type="text" name="search" placeholder="search for items"/>
            <input type="submit" name="action" value="Search"/>
        </form>
                                            
                                        </ul>
                                        </div>
                                        </div>
                                        <!-- end of menu tab -->

                                        <div class="left_content">
                                            <div class="title_box">Categories</div>
                                            <ul class="left_menu">
                                                <c:forEach items="${sessionScope.Listc}" var="o">
                                                    <li class="odd"><a href="CategoryController?categoryID=${o.categoryID}">${o.cName}</a></li>
                                                    </c:forEach>  
                                            </ul> 
                                            <div class="title_box">Newsletter</div>
                                            <div class="border_box">

                                            </div>
                                            <div class="banner_adds"><img src="images/big_sale.jpg" alt="" border="0" /></a> </div>
                                        </div>
                                        <!-- end of left content -->
                                        <div class="container">
                                            <div class="row">

                                                <div class="span9">

                                                    <div class="row-fluid">
                                                        <div class="span5">
                                                            <div id="myCarousel" class="carousel slide cntr">
                                                                <div class="carousel-inner">
                                                                    <div class="item active">
                                                                        <a href="#"> <img src="${detail.image}" alt="" style="width: 100%"></a>
                                                                    </div>                 
                                                                </div>                
                                                            </div>
                                                        </div>
                                                        <div class="span7">
                                                            <h3>${detail.productName}</h3>
                                                            <h5>Price: ${detail.price}$</h5>
                                                            <hr class="soft"/>

                                                            <form class="form-horizontal qtyFrm">
                                                                <div class="control-group">                                         
                                                                </div>
                                                                <h4>${detail.quantity} items in stock</h4>
                                                                
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                                </div>
                                            </div>

                                            <!-- end of center content -->
                                            <!-- end of right content -->

                                            <!-- end of main content -->
                                            <footer class="footer">
                                                <div class="row-fluid" id="thing">
                                                    <div class="span2" >
                                                        <h5>Iinformation</h5>
                                                        <a href="">CONTACT</a><br>
                                                            <a href="#">SITEMAP</a><br>
                                                                <a href="#">LEGAL NOTICE</a><br>
                                                                    <a href="#">TERMS AND CONDITIONS</a><br>
                                                                        <a href="#">ABOUT US</a><br>
                                                                            </div>
                                                                            <div class="span6">
                                                                                <h5>The standard chunk of Lorem</h5>
                                                                                The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for
                                                                                those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et 
                                                                                Malorum" by Cicero are also reproduced in their exact original form, 
                                                                                accompanied by English versions from the 1914 translation by H. Rackham.
                                                                            </div>
                                                                            </div>
                                                                            </footer>                          

                                                                            <!-- end of main_container -->
                                                                            </body>
                                                                            </html>

