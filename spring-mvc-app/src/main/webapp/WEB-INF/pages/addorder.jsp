<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
 crossorigin="anonymous">
<title>Add Orders</title>
<style>
*{
 margin:0 auto;
}
</style>
</head>
<body >
<h3 class="text-center mt-4">Add Orders</h3>
<form:form style="background-color:lightgreen;" modelAttribute="command" method="post" action="/orders/addorder" class="p-2 w-50 border">
			
			<div>
		    <label> Id</label>
			<form:input path="id" id="id" class="form-control"/>
		</div>
		<div>
		    <label>Order Id</label>
			<form:input path="orderId" id="orderId" class="form-control"/>
		</div>
		<div>
		    <label>Ordereded PersonName</label>
		    <form:input path="orderedPersonName" id="orderedPersonName" class="form-control"/>
		</div>
		<div>
			<label>Product Id</label>
			<form:input path="productId" id="productId" class="form-control"/>
		</div>
		<div>
		    <label>Quantity</label>
			<form:input path="quantity" id="quantity" class="form-control"/>
		</div>
		
		<div class="m-2 text-center">
			<input type="submit" value="Add" class="btn btn-outline-success w-100">
		</div>
</form:form>
<div class="text-danger text-center">${message}</div>
</body>
</html>