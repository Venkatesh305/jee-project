<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders By Users</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
 crossorigin="anonymous">
</head>
<body>
<form   method="post" action="/orders/displayordersbyorderId" class="p-2 w-50 border">
     <div>
		 <label>Order Id</label>
		 <input type="text" name="orderId" id="orderId" class="form-control"/>
	</div>
	<div class="m-2 text-center">
		<input type="submit" value="Find" class="btn btn-outline-danger w-100">
	</div>
</form>
<table style="background-color:lightgreen;" class="table table-striped ">
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
<c:forEach items="${list}" var="eachitem">
<tr>    
		<td>${eachitem.id}</td>   
        <td>${eachitem.orderId}</td>
        <td>${eachitem.orderedPersonName}</td>
        <td>${eachitem.productId}</td>
        <td>${eachitem.quantity}</td>
</tr>
</c:forEach>

</body>
</html>