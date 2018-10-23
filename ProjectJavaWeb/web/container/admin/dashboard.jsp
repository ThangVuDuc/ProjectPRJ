<%-- 
    Document   : newjspasdas
    Created on : Oct 16, 2018, 8:33:34 PM
    Author     : Vu
--%>
<link rel="stylesheet" href="/ProjectPRJ/public/mystyle.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" con tent="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <body style="width: 97%; margin: auto; ">
        
        <hr>
    </div>
    <h1 style="color: #1c931a;">&ensp; &ensp;Dashboard</h1>
    <hr>
    <div class="row" style="margin-left: 20px;">
        <div style="width: 23%;">
            <div class="list-group" id="list-tab" role="tablist">
                <a class="list-group-item list-group-item-action list-group-item-success" id="list-user-list" data-toggle="list" href="#list-user" role="tab" aria-controls="user" style="text-align: center">Users</a>
                <a class="list-group-item list-group-item-action list-group-item-success" id="list-shop-list" data-toggle="list" href="#list-shop" role="tab" aria-controls="shop" style="text-align: center">Shops</a>
                <a class="list-group-item list-group-item-action list-group-item-success" id="list-product-list" data-toggle="list" href="#list-product" role="tab" aria-controls="product" style="text-align: center">Products</a>
                <a class="list-group-item list-group-item-action list-group-item-success" id="list-invoice-list" data-toggle="list" href="#list-invoice" role="tab" aria-controls="invoice" style="text-align: center">Invoice</a>
            </div>
        </div>
        <div class="col-8">
            <a href="/ProjectPRJ/Dashboard">
                    <div style="background: url(/ProjectPRJ/web/public/img/logo.png); width: 900px; height: 200px; background-size: cover; background-position: center center; margin: auto">

                </div>
            </a>
            <hr>
            <div class="tab-content" id="nav-tabContent">
                <div class="tab-pane fade ${param.btnSubmit != null || param.btnBack != null ? "show active" : ""}" id="list-user" role="tabpanel" aria-labelledby="list-user-list">
                    <form class="form-inline my-2 my-lg-0 mr-auto" action="Dashboard" method="post">
                        <input class="form-control mr-sm-2" type="search" name="searchUser" placeholder="Search (please select type of search)" aria-label="Search" style="width: 252px; font-size: 14" value="${param.searchUser}">
                        <select class="form-control mr-sm-2" name="selectUser"}>
                            <option value="userID" ${param.selectUser == "userID" ? "selected": ""}>By UserID</option>
                            <option value="Username" ${param.selectUser == "Username" ? "selected": ""}>By UserName</option>
                            <option value="Name" ${param.selectUser == "Name" ? "selected": ""}>By Name</option>
                            <option value="Email" ${param.selectUser == "Email" ? "selected": ""}>By Email</option>
                        </select>
                        <button class="btn btn-success my-2 mr-sm-2 my-sm-0" type="submit" name="btnSubmit">Search</button>
                        <button class="btn btn-success my-2 my-sm-0" type="submit" name="btnBack">Back</button>
                    </form>
                    <p style="color: red">&ensp; ${errorUser}</p>
                    <hr/>
                    <table class="table table-hover" ${param.btnSubmit == null ? "" :"hidden"}>
                        <thead >
                            <tr class="table-success">
                                <th scope="col">User ID</th>
                                <th scope="col">User Name</th>
                                <th scope="col">Password</th>
                                <th scope="col">Name</th>
                                <th scope="col">Email</th>
                                <th scope="col">Avatar Url</th>
                                <th scope="col">Role</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="x" items="${Users}">
                                <tr>
                                    <td>${x.userID}</td>
                                    <td>${x.username}</td>
                                    <td>${x.password}</td>
                                    <td>${x.name}</td>
                                    <td>${x.email}</td>
                                    <td>${x.avatarUrl}</td>
                                    <td>${x.role}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <c:if test="${empty SearchUserUserID and empty SearchUserOther or not empty back}">
                        <p style="color: red" ${param.btnSubmit != null ? "" :"hidden"}>Cannot found, please search again !!!</p>
                        <table class="table table-hover" ${param.btnSubmit != null ? "" :"hidden"}>
                            <thead >
                                <tr class="table-success">
                                    <th scope="col">User ID</th>
                                    <th scope="col">User Name</th>
                                    <th scope="col">Password</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Avatar Url</th>
                                    <th scope="col">Role</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${Users}">
                                    <tr>
                                        <td>${x.userID}</td>
                                        <td>${x.username}</td>
                                        <td>${x.password}</td>
                                        <td>${x.name}</td>
                                        <td>${x.email}</td>
                                        <td>${x.avatarUrl}</td>
                                        <td>${x.role}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchUserUserID}">
                        <table class="table table-hover">
                            <thead>
                                <tr class="table-success">
                                    <th scope="col">User ID</th>
                                    <th scope="col">User Name</th>
                                    <th scope="col">Password</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Avatar Url</th>
                                    <th scope="col">Role</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchUserUserID}">
                                    <tr>
                                        <td>${x.userID}</td>
                                        <td>${x.username}</td>
                                        <td>${x.password}</td>
                                        <td>${x.name}</td>
                                        <td>${x.email}</td>
                                        <td>${x.avatarUrl}</td>
                                        <td>${x.role}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchUserOther}">
                        <table class="table table-hover">
                            <thead>
                                <tr class="table-success">
                                    <th scope="col">User ID</th>
                                    <th scope="col">User Name</th>
                                    <th scope="col">Password</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Avatar Url</th>
                                    <th scope="col">Role</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchUserOther}">
                                    <tr>
                                        <td>${x.userID}</td>
                                        <td>${x.username}</td>
                                        <td>${x.password}</td>
                                        <td>${x.name}</td>
                                        <td>${x.email}</td>
                                        <td>${x.avatarUrl}</td>
                                        <td>${x.role}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>

                </div>
                <div class="tab-pane fade ${param.btnShopSubmit != null || param.btnShopBack != null ? "show active":""}" id="list-shop" role="tabpanel" aria-labelledby="list-shop-list">
                    <form class="form-inline my-2 my-lg-0 mr-auto" action="Dashboard" method="post">
                        <input class="form-control mr-sm-2" type="search" name="searchShop" placeholder="Search (please select type of search)" aria-label="Search" style="width: 252px; font-size: 14" value="${param.searchShop}">
                        <select class="form-control mr-sm-2" name="selectShop">
                            <option value="shopID" ${param.selectShop == "shopID" ? "selected": ""}>By ShopID</option>
                            <option value="Description" ${param.selectShop == "Description" ? "selected": ""}>By Description</option>
                            <option value="OpenOrClose" ${param.selectShop == "OpenOrClose" ? "selected": ""}>By Open or Close</option>
                        </select>
                        <button class="btn btn-success my-2 mr-sm-2 my-sm-0" type="submit" name="btnShopSubmit">Search</button>
                        <button class="btn btn-success my-2 my-sm-0" type="submit" name="btnShopBack">Back</button>
                    </form>
                    <p style="color: red">&ensp; ${errorShop}</p>
                    <hr/>
                    <table class="table table-striped" ${param.btnShopSubmit == null ? "":"hidden"}>
                        <thead>
                            <tr>
                                <th scope="col">Shop ID</th>
                                <th scope="col">User ID</th>
                                <th scope="col">Title</th>
                                <th scope="col">Description</th>
                                <th scope="col">Open or Close</th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="x" items="${Shops}">
                                <c:url var="product" value="/Dashboard/ProductInShop">
                                    <c:param name="shopID" value="${x.shopID}"/>
                                </c:url>
                                <tr>
                                    <td>${x.shopID}</td>
                                    <td>${x.userID}</td>
                                    <td>${x.title}</td>
                                    <td>${x.description}</td>
                                    <td><input type="checkbox" ${x.openOrClose == false ? "" : "checked"} onclick="return false;" onkeydown="return false;"/></td>
                                    <td><a href="${product}" target="blank"><button type="button" class="btn btn-outline-success">Product in shop</button></a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <c:if test="${empty SearchShopID and empty SearchShopOpenOrClose and empty SearchShopOther or not empty back1}">
                        <p style="color: red" ${param.btnShopSubmit != null ? "" :"hidden"}>Cannot found, please search again !!!</p>
                        <table class="table table-striped" ${param.btnShopSubmit != null ? "" :"hidden"}>
                            <thead>
                                <tr>
                                    <th scope="col">Shop ID</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Open or Close</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${Shops}">
                                    <c:url var="product" value="/Dashboard/ProductInShop">
                                        <c:param name="shopID" value="${x.shopID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.shopID}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.title}</td>
                                        <td>${x.description}</td>
                                        <td><input type="checkbox" ${x.openOrClose == false ? "" : "checked"} onclick="return false;" onkeydown="return false;"/></td>
                                        <td><a href="${product}" target="blank"><button type="button" class="btn btn-outline-success">Product in shop</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchShopID}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Shop ID</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Open or Close</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchShopID}">
                                    <c:url var="product" value="/Dashboard/ProductInShop">
                                        <c:param name="shopID" value="${x.shopID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.shopID}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.title}</td>
                                        <td>${x.description}</td>
                                        <td><input type="checkbox" ${x.openOrClose == false ? "" : "checked"} onclick="return false;" onkeydown="return false;"/></td>
                                        <td><a href="${product}" target="blank"><button type="button" class="btn btn-outline-success">Product in shop</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchShopOpenOrClose}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Shop ID</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Open or Close</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchShopOpenOrClose}">
                                    <c:url var="product" value="/Dashboard/ProductInShop">
                                        <c:param name="shopID" value="${x.shopID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.shopID}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.title}</td>
                                        <td>${x.description}</td>
                                        <td><input type="checkbox" ${x.openOrClose == false ? "" : "checked"} onclick="return false;" onkeydown="return false;"/></td>
                                        <td><a href="${product}" target="blank"><button type="button" class="btn btn-outline-success">Product in shop</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchShopOther}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Shop ID</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Open or Close</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchShopOther}">
                                    <c:url var="product" value="/Dashboard/ProductInShop">
                                        <c:param name="shopID" value="${x.shopID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.shopID}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.title}</td>
                                        <td>${x.description}</td>
                                        <td><input type="checkbox" ${x.openOrClose == false ? "" : "checked"} onclick="return false;" onkeydown="return false;"/></td>
                                        <td><a href="${product}" target="blank"><button type="button" class="btn btn-outline-success">Product in shop</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                </div>
                <div class="tab-pane fade ${param.btnProductSubmit != null || param.btnProductBack != null ? "show active":""}" id="list-product" role="tabpanel" aria-labelledby="list-product-list">
                    <form class="form-inline my-2 my-lg-0 mr-auto" action="Dashboard" method="post">
                        <input class="form-control mr-sm-2" type="search" name="searchProduct" placeholder="Search (please select type of search)" aria-label="Search" style="width: 252px; font-size: 14" value="${param.searchProduct}">
                        <select class="form-control mr-sm-2" name="selectProduct">
                            <option value="productID" ${param.selectProduct == "productID" ? "selected" :""}>By ProductID</option>
                            <option value="Name" ${param.selectProduct == "Name" ? "selected" :""}>By Name</option>
                            <option value="Image" ${param.selectProduct == "Image" ? "selected" :""}>By Image</option>
                            <option value="Price" ${param.selectProduct == "Price" ? "selected" :""}>By Price</option>
                        </select>
                        <button class="btn btn-success my-2 mr-sm-2 my-sm-0" type="submit" name="btnProductSubmit">Search</button>
                        <button class="btn btn-success my-2 my-sm-0" type="submit" name="btnProductBack">Back</button>
                    </form>
                    <p style="color: red">&ensp; ${errorProduct}</p>
                    <hr/>
                    <table class="table table-striped" ${param.btnProductSubmit == null ? "":"hidden"}>
                        <thead>
                            <tr>
                                <th scope="col">Prodcut ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Image</th>
                                <th scope="col">Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="x" items="${Products}">
                                <tr>
                                    <td>${x.productID}</td>
                                    <td>${x.name}</td>
                                    <td>${x.image}</td>
                                    <td>${x.price}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <c:if test="${empty SearchProductID and empty SearchProductPrice and empty SearchProductOther or not empty back2}">
                        <p style="color: red" ${param.btnProductSubmit != null ? "" :"hidden"}>Cannot found, please search again !!!</p>
                        <table class="table table-striped" ${param.btnProductSubmit != null ? "":"hidden"}>
                            <thead>
                                <tr>
                                    <th scope="col">Prodcut ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${Products}">
                                    <tr>
                                        <td>${x.productID}</td>
                                        <td>${x.name}</td>
                                        <td>${x.image}</td>
                                        <td>${x.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchProductID}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Prodcut ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchProductID}">
                                    <tr>
                                        <td>${x.productID}</td>
                                        <td>${x.name}</td>
                                        <td>${x.image}</td>
                                        <td>${x.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchProductPrice}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Prodcut ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchProductPrice}">
                                    <tr>
                                        <td>${x.productID}</td>
                                        <td>${x.name}</td>
                                        <td>${x.image}</td>
                                        <td>${x.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>    
                    <c:if test="${not empty SearchProductOther}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Prodcut ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchProductOther}">
                                    <tr>
                                        <td>${x.productID}</td>
                                        <td>${x.name}</td>
                                        <td>${x.image}</td>
                                        <td>${x.price}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if> 
                </div>
                <div class="tab-pane fade ${param.btnInvoiceSubmit != null || param.btnInvoiceBack != null ? "show active":""}" id="list-invoice" role="tabpanel" aria-labelledby="list-invoice-list">
                    <form class="form-inline my-2 my-lg-0 mr-auto" action="Dashboard" method="post">
                        <input class="form-control mr-sm-2" type="search" name="searchInvoice" placeholder="Search (please select type of search)" aria-label="Search" style="width: 252px; font-size: 14" value="${param.searchInvoice}">
                        <select class="form-control mr-sm-2" name="selectInvoice">
                            <option value="invoiceID" ${param.selectInvoice == "invoiceID"?"selected":""}>By InvoiceID</option>
                            <option value="OrderTime" ${param.selectInvoice == "OrderTime"?"selected":""}>By Order Time</option>
                            <option value="UserID" ${param.selectInvoice == "UserID"?"selected":""}>By UserID</option>
                            <option value="Address" ${param.selectInvoice == "Address"?"selected":""}>By Address</option>
                            <option value="PhoneNumber" ${param.selectInvoice == "PhoneNumber"?"selected":""}>By Phone Number</option>
                            <option value="Detail" ${param.selectInvoice == "Detail"?"selected":""}>By Details</option>
                        </select>
                        <button class="btn btn-success my-2 mr-sm-2 my-sm-0" type="submit" name="btnInvoiceSubmit">Search</button>
                        <button class="btn btn-success my-2 my-sm-0" type="submit" name="btnInvoiceBack">Back</button>
                    </form>
                    <p style="color: red">&ensp; ${errorInvoice}</p>
                    <hr/>
                    <table class="table table-striped" ${param.btnInvoiceSubmit == null ? "":"hidden"}>
                        <thead>
                            <tr>
                                <th scope="col">Invoice ID</th>
                                <th scope="col">Order Time</th>
                                <th scope="col">User ID</th>
                                <th scope="col">Address</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Details</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="x" items="${Invoices}">
                                <tr>
                                    <td>${x.invoiceID}</td>
                                    <td>${x.orderTime}</td>
                                    <td>${x.userID}</td>
                                    <td>${x.address}</td>
                                    <td>${x.phoneNumber}</td>
                                    <td>
                                        <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModalCenter">
                                            More details
                                        </button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <c:if test="${empty SearchInvoiceID and empty SearchInvoiceUserID and empty SearchInvoiceOrderTime and empty SearchInvoiceOther or not empty back3}">
                        <p style="color: red" ${param.btnInvoiceSubmit != null ? "" :"hidden"}>Cannot found, please search again !!!</p>
                        <table class="table table-striped" ${param.btnInvoiceSubmit != null ? "":"hidden"}>
                            <thead>
                                <tr>
                                    <th scope="col">Invoice ID</th>
                                    <th scope="col">Order Time</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone Number</th>
                                    <th scope="col">Details</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${Invoices}">
                                    <c:url var="invoiceline" value="/Dashboard/InvoiceLine">
                                        <c:param name="invoiceID" value="${x.invoiceID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.invoiceID}</td>
                                        <td>${x.orderTime}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.address}</td>
                                        <td>${x.phoneNumber}</td>
                                        <td><a href="${invoiceline}" target="blank" ><button type="button" class="btn btn-outline-success">More details</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchInvoiceID}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Invoice ID</th>
                                    <th scope="col">Order Time</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone Number</th>
                                    <th scope="col">Details</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchInvoiceID}">
                                    <c:url var="invoiceline" value="/Dashboard/InvoiceLine">
                                        <c:param name="invoiceID" value="${x.invoiceID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.invoiceID}</td>
                                        <td>${x.orderTime}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.address}</td>
                                        <td>${x.phoneNumber}</td>
                                        <td><a href="${invoiceline}" target="blank" ><button type="button" class="btn btn-outline-success">More details</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchInvoiceUserID}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Invoice ID</th>
                                    <th scope="col">Order Time</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone Number</th>
                                    <th scope="col">Details</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchInvoiceUserID}">
                                    <c:url var="invoiceline" value="/Dashboard/InvoiceLine">
                                        <c:param name="invoiceID" value="${x.invoiceID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.invoiceID}</td>
                                        <td>${x.orderTime}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.address}</td>
                                        <td>${x.phoneNumber}</td>
                                        <td><a href="${invoiceline}" target="blank" ><button type="button" class="btn btn-outline-success">More details</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchInvoiceOrderTime}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Invoice ID</th>
                                    <th scope="col">Order Time</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone Number</th>
                                    <th scope="col">Details</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchInvoiceOrderTime}">
                                    <c:url var="invoiceline" value="/Dashboard/InvoiceLine">
                                        <c:param name="invoiceID" value="${x.invoiceID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.invoiceID}</td>
                                        <td>${x.orderTime}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.address}</td>
                                        <td>${x.phoneNumber}</td>
                                        <td><a href="${invoiceline}" target="blank" ><button type="button" class="btn btn-outline-success">More details</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${not empty SearchInvoiceOther}">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Invoice ID</th>
                                    <th scope="col">Order Time</th>
                                    <th scope="col">User ID</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Phone Number</th>
                                    <th scope="col">Details</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="x" items="${SearchInvoiceOther}">
                                    <c:url var="invoiceline" value="/Dashboard/InvoiceLine">
                                        <c:param name="invoiceID" value="${x.invoiceID}"/>
                                    </c:url>
                                    <tr>
                                        <td>${x.invoiceID}</td>
                                        <td>${x.orderTime}</td>
                                        <td>${x.userID}</td>
                                        <td>${x.address}</td>
                                        <td>${x.phoneNumber}</td>
                                        <td><a href="${invoiceline}" target="blank" ><button type="button" class="btn btn-outline-success">More details</button></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLongTitle">Invoice Lines</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th scope="col">Invoice ID</th>
                                                <th scope="col">Product ID</th>
                                                <th scope="col">Quatity</th>
                                                <th scope="col">Unit Price</th>
                                                <th scope="col">Note</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="x" items="${InvoiceLines}">
                                                <tr>
                                                    <td>${x.invoiceID}</td>
                                                    <td>${x.productID}</td>
                                                    <td>${x.quatity}</td>
                                                    <td>${x.unitprice}</td>
                                                    <td>${x.note}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-outline-success" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="container text-center">
        <h2 style="color: #1c931a;">HOLA FOOD</h2>
        <h3>We love food!</h3>
        <h3>We have created a food hola website.</h3>
        <br/>
        <p>Được xây dựng từ giữa năm 2018 tại Hòa Lạc, Hà Nội, Food Hola là cộng đồng tin cậy cho sinh viên có thể tìm kiếm,
            đánh giá, bình luận các địa điểm ăn uống: nhà hàng, quán ăn, cafe, bar, karaoke, tiệm bánh, khu du lịch... tại
            Việt Nam - từ website. Tất cả thành viên từ Bắc đến Nam, Food Hola kết nối mọi sinh viên đến với các địa điểm
            ăn uống lớn nhỏ cả đất nước. Đến thời điểm hiện tại, Food Hola với hàng chục địa điểm và hàng trăm ngàn bình
            luận, hình ảnh tại Việt Nam, ở hầu hết miền Bắc. Food Hola là cách dễ nhất để bạn có thể tìm kiếm và lựa chọn
            địa điểm và những món ăn tốt nhất cho mình và bạn bè.</p>  
    </div>
    <hr>
    <footer class="page-footer">
        <div class="footer-copyright text-center py-3">© 2018 Copyright:
            <a href="https://mdbootstrap.com/bootstrap-tutorial/"> MDBootstrap.com</a>
        </div>
    </footer>
</body>
</html>
