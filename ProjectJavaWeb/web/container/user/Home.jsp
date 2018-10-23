<%-- 
    Document   : Home
    Created on : Oct 15, 2018, 8:34:34 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HolaFood</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">            
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/style.css">
    </head>
    <body>
        <jsp:include page="/component/Menu.jsp"/>
        <jsp:include page="/component/Banner.jsp"/>
        <jsp:useBean id="sb" class="bean.ShopBean" scope="session"></jsp:useBean>
        <jsp:setProperty name="sb" property="*"/>
        <div class="container mt-3">
            <div class="row">
                <c:forEach var="x" items="${sb.shops}">
                    <div class="col-lg-4 portfolio-item mb-3 ">
                        <c:url var="shopdetail" value="/container/user/Shop.jsp">
                            <c:param name="shop" value="${x.shopId}"></c:param>
                        </c:url>
                        <a href="${shopdetail}">
                            <div class="card h-100 cardShop" >
                                ${x.shopId}
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <div>${x.title}</div>
                                    </h4>
                                    <p class="card-text">${x.description}</p>
                                </div>
                            </div>
                        </a> 
                    </div>
                </c:forEach>
            </div>
            <div class="row d-flex justify-content-center">
                <ul class="pagination justify-content-center">
                    <c:forEach var="i" step="1" end="${sb.pages}" begin="1">
                        <c:url var="next" value="/container/user/Home.jsp">
                            <c:param name="page" value="${i}"></c:param>
                            <c:param name="pageSize" value="${sb.pageSize}"></c:param>
                        </c:url>
                        <li class="page-item">
                            <a class="page-link" href="${next}">${i}</a>
                        </li>
                    </c:forEach>
                </ul> 
            </div>
        </div>
        
        <jsp:include page="/component/Footer.jsp"/>
        

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            window.onload = function () {
                window.scroll({
                    top: window.innerHeight - 100,
                    behavior: 'smooth'
                })
            }
        </script>
    </body>
</html>
