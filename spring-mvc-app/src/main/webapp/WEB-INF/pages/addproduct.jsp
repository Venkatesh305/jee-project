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
<title>Add Products</title>
<style>
*{
margin:0 auto;
}
</style>
</head>
<body>
<h3 class="text-center mt-4">ADD PRODUCTS</h3>
<form:form style="background-color:skyblue;" modelAttribute="command" method="post" action="/products/addproduct" class="p-2 w-50 border">
		<div>
		    <label>Product ID</label>
			<form:input path="productId" id="productId"  class="form-control"/>
		</div>		
		<div>
		    <label>Merchant</label>
			<form:input path="merchant" id="merchant" class="form-control"/>
		</div>
		<div>
		    <label>Product Category</label>
		    <form:input path="productCategory" id="productCategory" class="form-control"/>
		</div>
		<div>
		    <label>Product Name</label>
			<form:input path="productName" id="productName" class="form-control"/>
		</div>
		<div>
		    <label>Product Price</label>
			<form:input path="productPrice" id="productPrice" class="form-control"/>
		</div>
		<div>
		    <label>Product Inventory</label>
			<form:input path="productInventory" id="productInventory" class="form-control"/>
		</div>
		<div class="m-2 text-center">
			<input type="submit" value="Add" class="btn btn-outline-success w-100">
		</div>
</form:form>
<div class="text-danger text-center">${message}</div>
</body>
</html>