<%-- 
    Document   : ShopManager
    Created on : Oct 23, 2018, 10:40:43 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">            
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="/component/Menu.jsp"/>
        <div>
            <div class="container-fluid details pb-3 pt-3">
                <div class="container detailsStatus mt-3">
                    <div class="row">
                        <div class="col-md-12">
                            <span><em>Cửa hàng của bạn:</em></span>
                        </div>
                        <div class="col-md-9">
                            <h1 class='text-info display-3'>${shop.title}</h1>
                            <h5>${shop.description}</h5>
                            <p >Trạng thái: 
                                <c:if test="${shop.openOrClose==true}">
                                    <span class="badge badge-info">Mở cửa</span>
                                </c:if>
                                <c:if test="${shop.openOrClose==false}">
                                    <span class="badge badge-danger">Đóng cửa</span>
                                </c:if>
                            </p>
                        </div>
                        <div class="col-md-3 text-right" >
                            <button class="btn danger changeInfoShop" data-toggle="modal" data-target="#collapseUpdateInfoShop">Thay đổi thông tin cửa hàng</button>
                            <button class="btn info listOrderShop">Danh sách mua hàng</button>
                        </div>
                        <div class="col-md-12 d-flex justify-content-center">
                            <button class="btn success buttonShopUser">Xem với tư cách người mua hàng</button>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-12 mb-3">
                            <span><em>Bạn có 0 sản phẩm trong cửa hàng</em></span>
                        </div>
                        <div class="col-12" class='text-center mt-3'>
                            <div class="img-thumbnail ml-2 mr-2 row">
                                <div  class='mt-2 mb-2 col-sm-3'>
                                    <img class='fixed img-thumbnail' src="https://i.ytimg.com/vi/d5pLgPTWKpM/maxresdefault.jpg" />
                                </div>
                                <div  class='mt-2 col-sm-9'>
                                    <h3><strong>Cơm</strong></h3>
                                    <h6>Đơn giá: <span class='text-danger' >10000d</span><span class='text-primary' >.vnđ</span> / 1 sản phẩm</h6>
                                    <button class="btn btn-warning" data-toggle="modal" data-target="#collapseUpdateProduct">Thay đổi thông tin sản phẩm</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row mt-5 d-flex justify-content-center">
                        <button class="btn btn-danger btn-outline-danger" data-toggle="modal" data-target="#collapseAddProduct">Thêm sản phẩm mới</button>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="/component/ModalChangeInfoShop.jsp"/>
        <jsp:include page="/component/ModalAddProduct.jsp"/>
        <jsp:include page="/component/ModalUpdateProduct.jsp"/>
<!--        <div class="modal fade bd-example-modal-lg" id="collapseUpdateInfoShop" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header  d-flex justify-content-center ">
                        <h3 class="modal-title " id="exampleModalLabel">Thay đổi thông tin cửa hàng</h3>
                    </div>
                    <div class="modal-body">
                        <form>
                            <form class="form" action="" method="Post">
                                <div class="form-group">
                                    <label for="newShopName" class="text-black">Tên cửa hàng</label><br>
                                    <input type="text" name="newShopName" id="newShopName"  class="form-control" autocomplete="off" required="required" placeholder="Cơm sườn">
                                </div>
                                <div class="form-group">
                                    <label for="newShopDescription" class="text-black">Miêu tả</label><br>
                                    <input type="text" name="newShopDescription" id="newShopDescription"  class="form-control" autocomplete="off" required="required" placeholder="Giới thiệu về cửa hàng">
                                </div>
                                <div class="form-group">
                                    <label for="customRadioInline1" class="text-black">Trạng thái</label><br>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input type="radio" id="customRadioInline1" name="shopStatus" class="custom-control-input">
                                        <label class="custom-control-label" for="customRadioInline1">Mở cửa</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input type="radio" id="customRadioInline2" name="shopStatus" class="custom-control-input">
                                        <label class="custom-control-label" for="customRadioInline2">Đóng cửa</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input style="width: 50%" type="submit" name="newShop" class="btn btn-info btn-md" value="Tạo cửa hàng">
                                    <button style="width: 49%" type="button" class="btn btn-danger" data-dismiss="modal">Hủy</button>
                                </div>
                            </form>
                    </div>
                    <div class="modal-footer">
                    </div>
                </div>
            </div>
        </div>-->
        <div className="footer">
            <div class="ending">
                <p>Hola Food Made By <a href="https://www.holafood.com">www.holafood.com</a></p>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            document.getElementsByClassName("header")[0].classList.add("headerBg")
        </script>
        <script>
            window.addEventListener("scroll", function () {
                if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                    document.getElementsByClassName("header")[0].classList.add("headerBg")
                } else {
                    document.getElementsByClassName("header")[0].classList.add("headerBg");
                }
            })
        </script>
    </body>
</html>
