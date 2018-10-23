<%-- 
    Document   : Profile
    Created on : Oct 18, 2018, 3:16:08 PM
    Author     : Admin.10.12
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    </head>
    <script>
        function changeValue1(event) {
            document.getElementById("email").readOnly = false;
        }
        function changeValue2(event) {
            document.getElementById("name").readOnly = false;
        }
        function changeValue3(event) {
            document.getElementById("avatarUrl").readOnly = false;
        }
    </script>

    <body>          
        <jsp:include page="/component/Menu.jsp"/>
        <jsp:include page="/component/Banner.jsp"/>

        <div class="container mt-3">
            <div class="row">
                <!--                User Information-->
                <div class="col-4 hovereffect3">
                    <!--Image-->
                    <div class="hovereffect">
                        <img src="${pageContext.request.contextPath}/public/images/${sessionScope.user.avatarUrl}" alt="${sessionScope.user.name}" class="img-thumbnail rounded-circle" style=" height: 330px" />
                        <div class="overlay">
                            <h2>${sessionScope.user.name}</h2>

                        </div>
                    </div>                                
                </div>


                <div class="col-md-8">
                    <form action="UpdateUserInfoServlet" method="POST">
                        <!--Particular user's information-->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="inputGroup-sizing-default">Email</span>
                            </div>
                            <input type="text" class="form-control " name='email' id='email' readOnly value="${sessionScope.user.email}"   aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                        </div>
                        <i class="fas fa-edit" onClick="changeValue1()"></i>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="inputGroup-sizing-default">Name</span>
                            </div>
                            <input type="text"  class="form-control" name='name' id="name" readOnly value="${sessionScope.user.name}"   aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                        </div>
                        <i class="fas fa-edit" onClick="changeValue2()"></i>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="inputGroup-sizing-default">AvatarURL</span>
                            </div>
                            <input type="text" class="form-control"  name='avatarUrl'id="avatarUrl" readOnly value="${sessionScope.user.avatarUrl}"  aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                        </div>
                        <i class="fas fa-edit" onClick="changeValue3()"></i>
<!--                        <div class="form-group">
                            <label for="file-upload" class="custom-file-upload">
                                <i class="fas fa-cloud-upload-alt"></i> Avatar
                            </label>
                            <input id="file-upload" name="avatar" type="file" size="50" required="required"/>
                        </div>-->
                        <div className="text-right">
                            <input type="submit" class="btn btn-outline-success" value="Update"/>
                        </div>
                    </form>
                </div>
                <div>

                    <c:if test="${not empty shops}">
                        <h3>All Shops</h3>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th scope="col">ShopID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">OpenOrClose</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var='shop' items='${shops}'> 
                                    <tr>
                                        <c:url var="shopInfo" value="/UserAllProductServlet">                            
                                            <c:param name="shopID" value="${shop.shopId}"></c:param>
                                        </c:url>
                                        <td><a href="${shopInfo}">${shop.shopId}</a></td>
                                        <td>${shop.title}</td>
                                        <td>${shop.description}</td>
                                        <td>${shop.openOrClose}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </c:if>
                    <!--                    Display all shops-->
                    <c:if test="${ empty shops}">
                        <p><h4>You have no Shop</h4></p>
                    </c:if>

                    <c:if test="${not empty invoices}">
                        <h3>All Invoices</h3>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th scope="col">InvoiceID</th>
                                    <th scope="col">OrderTime</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var='invoice' items='${invoices}'> 
                                    <tr>
                                        <c:url var="list" value="/UserAllProductServlet">                            
                                            <c:param name="invoiceID" value="${invoice.invoiceID}"></c:param>
                                        </c:url>
                                        <td><a href="${list}">${invoice.invoiceID}</a></td>
                                        <td>${invoice.orderTime}</td>
                                        <td>${invoice.address}</td>
                                        <td>${invoice.phone}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </c:if>
                    <!--                    Display all Invoices-->
                    <c:if test="${ empty invoices}">
                        <p><h4>You have no Invoices</h4></p>
                    </c:if>
                    <c:if test="${not empty products2}">
                        <h3>Invoice: No ${param.invoiceID}</h3>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th scope="col">ProductID</th>
                                    <th scope="col">ShopID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Note</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var='product2' items='${products2}'> 
                                    <tr>
                                        <td>${product2.productID}</td>
                                        <td>${product2.shopID}</td>
                                        <td>${product2.name}</td>
                                        <td>${product2.image}</td>
                                        <td>${product2.price}</td>
                                        <td>${product2.quantity}</td>
                                        <td>${product2.note}</td>

                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </c:if>
                    <c:if test="${not empty products3}">
                        <h3>Shop: No ${param.shopID}</h3>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th scope="col">ProductID</th>
                                    <th scope="col">ShopID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var='products3' items='${products3}'> 
                                    <tr>
                                        <td>${products3.productID}</td>
                                        <td>${products3.shopID}</td>
                                        <td>${products3.name}</td>
                                        <td>${products3.image}</td>
                                        <td>${products3.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </c:if>
                </div>
            </div>
        </div> 


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
