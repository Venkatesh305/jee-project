<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
 crossorigin="anonymous">
</head>
<body >
<center>
<h1>Details Of All Products</h1></center>
<table style="background-color:lightgreen;" class="table table-striped ">
    <thead>
        <tr>
            <th>productId</th>
            <th>merchant</th>
            <th>productCategory</th>
            <th>productName</th>
            <th>productPrice</th>
            <th>productInventory</th>
        </tr>
    </thead>
<tbody>
<c:forEach items="${list}" var="eachItem">
<tr>
        <td>${eachItem.productId}</td>
        <td>${eachItem.merchant}</td>
        <td>${eachItem.productCategory}</td>
        <td>${eachItem.productName}</td>
        <td>${eachItem.productPrice}</td>
        <td>${eachItem.productInventory}</td>
</tr>
</c:forEach>
    
</tbody>
</table>
</body>
</html>