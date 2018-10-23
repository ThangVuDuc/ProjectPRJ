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
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="/component/Menu.jsp"/>
        <jsp:include page="/component/Banner.jsp"/>
        <jsp:useBean id="sb" class="bean.ShopBean" scope="session"></jsp:useBean>
        <jsp:setProperty name="sb" property="*"/>
        <jsp:setProperty name="sb" property="pageSize" value="3"/>

        <div class="container " style="margin-top: 60px">
            <div class="row" id="shops">
                <c:forEach var="x" items="${sb.shops}">
                    <c:if test="${x.openOrClose==true}">
                        <div class="col-lg-4 portfolio-item mb-3 ">
                            <c:url var="shopdetail" value="/container/user/Shop.jsp">
                                <c:param name="shopId" value="${x.shopId}"></c:param>
                                <c:param name="userId" value="${x.userId}"></c:param>
                            </c:url>
                            <a href="${shopdetail}">
                                <div class="card h-100 cardShop" >
                                    <div class="card-body">
                                        <h4 class="card-title">
                                            <div>${x.title}</div>
                                        </h4>
                                        <p class="card-text">${x.description}</p>
                                    </div>
                                </div>
                            </a> 
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <div class="row d-flex justify-content-center">
                <div id="loadMore" page="1" pageSize="3">XEM THÊM</div>
            </div>
            <%--<div class="row d-flex justify-content-center">
                <ul class="pagination justify-content-center">
                    <c:forEach var="i" step="1" end="${sb.pages}" begin="1">
                        <c:url var="next" value="/container/user/Home.jsp">
                            <c:param name="page" value="${i}"></c:param>
                        </c:url>
                        <li class="page-item">
                            <a class="page-link" href="${next}">${i}</a>
                        </li>
                    </c:forEach>
                </ul> 
            </div>--%>
        </div>
        <jsp:include page="/component/Footer.jsp"/>


        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            window.onload = function () {
                window.scroll({
                    top: window.innerHeight - 90,
                    behavior: 'smooth'
                })
            }
        </script>
        <script>
            $('#loadMore').click(() => {
//                alert(parseInt($("#loadMore").attr("data"))+1)
                $.ajax({
                    url: '${pageContext.request.contextPath}' + '/ShopServlet',
                    type: 'POST',
                    data: {
                        page: parseInt($("#loadMore").attr("page")) + 1,
                        pageSize: parseInt($("#loadMore").attr("pageSize"))
                    },
                    success: function (data) {
                        dataFinal = JSON.parse(data)
                        for (var i = 0; i < dataFinal.shops.length; i++) {
                            if (dataFinal.shops[i].openOrClose == true) {
                                $("#shops").append(`
                                        <div class="col-lg-4 portfolio-item mb-3 ">
                                            <a href="/ProjectJavaWeb/container/user/Shop.jsp?shopId=` + dataFinal.shops[i].shopid + "&userId=" + dataFinal.shops[i].userid + `">
                                                <div class="card h-100 cardShop" >
                                                    <div class="card-body">
                                                        <h4 class="card-title">
                                                            <div>` + dataFinal.shops[i].title + `</div>
                                                        </h4>
                                                        <p class="card-text">` + dataFinal.shops[i].description + `</p>
                                                    </div>
                                                </div>
                                            </a> 
                                        </div>
                                `)
                            }
                        }
                        $("#loadMore").attr("page", parseInt($("#loadMore").attr("page")) + 1);
                        if (dataFinal.shops.length < parseInt($("#loadMore").attr("pageSize"))) {
                            $("#loadMore").hide();
                        }
                    },
                    error: function (err) {
                        console.log(err);
                    }
                })
            })
        </script>
    </body>
</html>
