<%-- 
    Document   : menu
    Created on : Oct 15, 2018, 8:37:13 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HolaFood</title>
    </head>
    <body>
        <jsp:setProperty name="sb" property="*"/>
        <div>
            <nav class='navbar header fixed-top navber-expland-lg navbar-light'>
                <div class='container' >
                    <div class='col-4'>
                        <div class='input-group mt-3'>
                            <p style="width: 100%;color:rgb(48, 48, 48);marginBottom: 5;font-size: 15px;font-weight: 700;" >Hotline: 0123456789</p>
                            <p style="width: 100%;color:rgb(48, 48, 48);marginBottom: 5;font-size: 15px;font-weight: 700;">Địa chỉ: Thắng béo</p>
                        </div> 
                    </div>
                    <div class='col-4'>
                        <div class='navbar-brand' href='#' >
                            <c:url var="next" value="/container/user/Home.jsp">
                                <c:param name="page" value="1"></c:param>
                                <c:param name="pageSize" value="${sb.pageSize}"></c:param>
                            </c:url>
                            <a href="${next}">
                                <span><img src="${pageContext.request.contextPath}/public/images/logo.png" class='img-logo' alt='logo' /></span>
                            </a>
                        </div> 
                    </div>
                    <c:if test="${ empty sessionScope.user}">
                        <div class='col-4'>
                            <div class="float-right">
                                <a href="${pageContext.request.contextPath}/container/user/Login.jsp" class="signinBtn">Sign in</a> 
                                or
                                <a href="${pageContext.request.contextPath}/container/user/SignUp.jsp" class="signupBtn">Sign up</a> 
                            </div>
                        </div>   
                    </c:if>
                    <c:if test="${not empty sessionScope.user}">

                        <div class='col-4 profile'>
                            <div class="btn btn-primary profileSum" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                                <span class="user-avatar pull-left" style="margin-right:8px; margin-top:-5px;">
                                    <img src="${pageContext.request.contextPath}/public/images/${sessionScope.user.avatarUrl}" class="img-responsive img-circle"   width="30px" height="30px">
                                </span>
                                <span class="user-name">
                                    ${sessionScope.user.name}
                                </span>
                            </div>
                            </p>

                            <div class="collapse" id="collapseExample">

                                <ul>
                                    <c:url var="allProduct" value="/UserAllProductServlet">
                                        <c:param name="userID" value="${sessionScope.user.userID}"></c:param>
                                    </c:url>
                                    <li><a href="${allProduct}" class="btn btn-default btn-xs"><i class="fa fa-user-o" aria-hidden="true"></i> Profile</a></li>
                                    <li><a href="#" class="btn btn-default btn-xs"><i class="fa fa-address-card-o" aria-hidden="true"></i> Contacts</a></li>    
                                    <li><a href="#" class="btn btn-default btn-xs"><i class="fa fa-cogs" aria-hidden="true"></i> Settings</a></li>    
                                    <li><a href="#" class="btn btn-default btn-xs"><i class="fa fa-question-circle-o" aria-hidden="true"></i> Help!</a></li>  
                                    <hr>
                                    <li><a href="#" class="btn btn-default btn-sm"><i class="fa fa-unlock-alt" aria-hidden="true"></i> Change Passowrd</a></li>    
                                    <li><a href="/ProjectJavaWeb/LogoutServlet" class="btn btn-default btn-sm pull-right"><i class="fa fa-power-off" aria-hidden="true"></i> Sign Out</a></li>
                                </ul>
                            </div>
                        </div>
                    </c:if>
                </div>
            </nav>
        </div>
    </body>
</html>
