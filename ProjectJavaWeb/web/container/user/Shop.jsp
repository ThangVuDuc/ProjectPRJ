<%-- 
    Document   : Shop
    Created on : Oct 18, 2018, 1:10:16 AM
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
        <jsp:useBean id="ub" class="bean.UserBean" scope="request"></jsp:useBean>
        <jsp:setProperty name="ub" param="userId" property="userId"/>


        <jsp:useBean id="pb" class="bean.ProductBean" scope="request"></jsp:useBean>
        <jsp:setProperty name="pb" param="shopId" property="shopId"/>

        <jsp:useBean id="cb" class="bean.CommentBean" scope="request"></jsp:useBean>
        <jsp:setProperty name="cb" param="shopId" property="shopId"/>
        <div>
            <div class="container-fluid details pb-3 pt-3">
                <div class="container detailsStatus mt-3">
                    <div class="row">
                        <div class="col-md-7">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="avatarHost ">
                                        <img src="${pageContext.request.contextPath}/public/images/${ub.userById.avatarUrl}"/>
                                    </div>
                                </div>
                                <div class="mainStatus col-md-10">
                                    <h4>
                                        ${ub.userById.name}
                                    </h4>
                                    <h5>${sb.shopById.title}</h5>
                                    <p>${sb.shopById.description}</p>
                                    <div class="foodShop">
                                        <c:forEach var="x" items="${pb.products}">
                                            <div  class="oneFood food mb-3"}>
                                                <div class="foodImg">
                                                    <img src="${pageContext.request.contextPath}/public/images/${x.image}" />
                                                </div>
                                                <div class="foodName">${x.name}</div>
                                                <input type="number" name=""  value="0" min=0 max=100 class="slsp" />
                                                <div class="foodPrice">${x.price}</div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <a href="/cart" class="col-md-3" style= "padding: 0">
                                        <div class="btn btn-danger" style=" width: 100%" >Order ngay</div>
                                    </a>
                                    <div class="expressBar mt-3">
                                        <i class="far fa-heart"></i>
                                        <i class="far fa-comment"></i>
                                    </div>

                                    <div id="demo" class="carousel slide" data-ride="carousel" data-interval="2000" style="height: auto">
                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <c:if test="${not empty pb.products}">
                                                    <img src="${pageContext.request.contextPath}/public/images/${pb.products.get(0).image}" alt="Los Angeles" class="object-fit">      
                                                </c:if>
                                            </div>
                                            <c:forEach var="x" items="${pb.products}" begin="1">
                                                <div class="carousel-item ">
                                                    <img src="${pageContext.request.contextPath}/public/images/${x.image}" alt="Los Angeles" class="object-fit">
                                                </div>
                                            </c:forEach>
                                        </div>
                                        <a class="carousel-control-prev" href="#demo" data-slide="prev">
                                            <span class="carousel-control-prev-icon"></span>
                                        </a>
                                        <a class="carousel-control-next" href="#demo" data-slide="next">
                                            <span class="carousel-control-next-icon"></span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-5 Comment">
                            <div class="CommentShow">
                                <c:forEach var="x" items="${cb.comments}">
                                    <div  class="oneComment row">
                                        <div class="col-md-1">
                                            <div class="avatarUserComment">
                                                <img src="${pageContext.request.contextPath}/DisplayImages?imgname=${x.user.avatarUrl}"/>
                                            </div>
                                        </div>
                                        <div class="col-md-11">
                                            <a class="userNameComment">${x.user.name}</a>
                                            <span class="timeStamp"><Moment format="YYYY/MM/DD HH:mm" date={comment.createAt} /></span>
                                            <div class="userComment">${x.content}</div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="oneComment  presentUserCM row">
                                <div class="col-md-1 avatarUserCol">
                                    <div class="avatarUserComment avatarUser">
                                        <c:if test="${not empty sessionScope.user.avatarUrl}">
                                            <img src="${pageContext.request.contextPath}/DisplayImages?imgname=${sessionScope.user.avatarUrl}" />
                                        </c:if>
                                        <c:if test="${empty sessionScope.user.avatarUrl}">
                                            <img src="${pageContext.request.contextPath}/public/images/avatar-anonymous.png" />
                                        </c:if>
                                    </div>
                                </div>
                                <div class="col-md-11">
                                    <form class="formComment">
                                        <input type="text" cols=30 rows=6 class="userInputCM"  placeholder="Thêm bình luận" defaultValue={""} />
                                        <div class="comment-arrow"></div>
                                        <input style=" marginTop: 20px " type="submit" class="addComment" value="Bình luận" />
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container related mb-3">
                <div class="container">
                    <h5>BÀI VIẾT KHÁC</h5>
                    <div class="row">
                        <jsp:setProperty name="sb" property="pageSize" value="4"/>
                        <jsp:setProperty name="sb" property="page" value="1"/>
                        <c:forEach var="x" items="${sb.shops}">
                            <div class="col-lg-3 portfolio-item mb-3 ">
                                <c:url var="shopdetail" value="/container/user/Shop.jsp" >
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
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div >
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            document.querySelector(".userInputCM").onfocus = function () {
                document.querySelector(".addComment").classList.add("show")
            }
            document.querySelector(".userInputCM").onblur = function () {
                document.querySelector(".addComment").classList.remove("show")
            }
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
        <script>
            $(".formComment").submit(function (e) {
                e.preventDefault();
                $.ajax({
                    url: '${pageContext.request.contextPath}' + '/CommentServlet',
                    type: 'POST',
                    data: {
                        shopId: "${param.shopId}",
                        userId: "${sessionScope.user.userId}",
                        content: $(".userInputCM").val()
                    },
                    success: function (data) {
                        dataFinal = JSON.parse(data)
                        console.log(data.content)
                        $(".CommentShow").append(`
                            <div  class="oneComment row">
                                <div class="col-md-1">
                                    <div class="avatarUserComment">
                                        <img src=""/>
                                    </div>
                                </div>
                                <div class="col-md-11">
                                    <a class="userNameComment">{comment.owner.name}</a>
                                    <span class="timeStamp"><Moment format="YYYY/MM/DD HH:mm" date={comment.createAt} /></span>
                                    <div class="userComment">` + dataFinal.content + `</div>
                                </div>
                            </div>
                        `)
                        $('.userInputCM').val("")
                    },
                    error: function (err) {
                        console.log(err);
                    }
                });
            });

        </script>
    </body>
</html>
