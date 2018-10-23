<%-- 
    Document   : Banner
    Created on : Oct 15, 2018, 9:04:53 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            /* Make the image fully responsive */
            .carousel-inner img {
                width: 100%;
                height: 100%;
            }
        </style>
    </head>
    <body>
        <div id="demo" class="carousel slide" data-ride="carousel" data-interval="2000">

            <!-- Indicators -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="${pageContext.request.contextPath}/public/images/banner1.jpg" alt="Los Angeles" width="1100" height="500">
                </div>
                <div class="carousel-item">
                    <img src="${pageContext.request.contextPath}/public/images/banner2.jpg" alt="Chicago" width="1100" height="500">
                </div>
                <div class="carousel-item">
                    <img src="${pageContext.request.contextPath}/public/images/banner3.jpg" alt="New York" width="1100" height="500">
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>

    </body>
</html>
