<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Orders</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
 crossorigin="anonymous">
</head>
<body>
<center>
<h1>All Orders</h1></center>
<table style="background-color:yellow;" class="table table-striped ">
    <thead>
        <tr>
            <th>id</th>
            <th>orderId</th>           
            <th>orderedPersonName</th>
            <th>productId</th>
            <th>quantity</th>
        </tr>
    </thead>
<tbody>
<c:forEach items="${list}" var="each">
<tr>
         <td>${each.id}</td>
        <td>${each.orderId}</td>
        <td>${each.orderedPersonName}</td>
        <td>${each.productId}</td>
        <td>${each.quantity}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>