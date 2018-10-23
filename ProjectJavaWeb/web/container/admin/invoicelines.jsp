<%-- 
    Document   : invoicelines
    Created on : Oct 17, 2018, 9:00:40 PM
    Author     : Vu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center; padding-top: 50px">
        <h2>Details Invoice Line</h2>
        <hr>
        <table class="table table-striped" style="width: 60%; margin: auto">
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
    </body>
</html>
