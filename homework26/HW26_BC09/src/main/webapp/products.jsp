<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
<link rel="stylesheet" href="product.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<div class="rol">
		<div class="col col-5">
			<h1>Quản lý sản phẩm</h1>
			<form action="products" method="post">
				 <div class="mb-3">
					<label for="formGroupExampleInput" class="form-label">Tên sản phẩm</label>
					<input type="text" class="form-control" name="name_product" placeholder="">
				</div>
				<div class="mb-3">
				  <label for="formGroupExampleInput2" class="form-label">Số lượng:</label>
				  <input type="text" class="form-control" name="quantity" placeholder="">
				</div>
				<div class="mb-3">
				  <label for="formGroupExampleInput2" class="form-label">Giá bán:</label>
				  <input type="text" class="form-control" name="cost" placeholder="">
				</div>
			  <button type="submit" class="btn btn-primary">Lưu lại</button>
			</form>
		</div>
	</div>
	<div class="rol">
		<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">STT</th>
      <th scope="col">Tên Sản Phẩm</th>
      <th scope="col">Số Lượng</th>
      <th scope="col">Giá Bán</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Điện thoại Nokia</td>
      <td>20</td>
      <td>1500000</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Điện thoại Samsung</td>
      <td>50</td>
      <td>5500000</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Redmi Node 10</td>
      <td>100</td>
      <td>4000000</td>
    </tr>
    <c:forEach items="${productListTable}" var = "item" varStatus="loop">
	    <tr>
			<th scope="row">${loop.index + 4}</th>
			<td>${item.productName}</td>
			<td>${item.quantity}</td>
			<td>${item.price}</td>
		</tr>
      </c:forEach>
      <c:if test="${not empty error}">
		<div class="alert alert-danger">${error}</div>
	  </c:if>
  </tbody>
</table>
	</div>
	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</html>