<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Product details</h3>
<jsp:useBean id="product" class="com.product.Product" scope="session"></jsp:useBean>
<jsp:getProperty name="product" property="ID" /> <br>
<jsp:getProperty name="product" property="name" /> <br>
<jsp:getProperty name="product" property="price" /> <br>
 <jsp:getProperty name="product" property="qty" /> <br>
</body>
</html>