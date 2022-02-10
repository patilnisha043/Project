<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class="com.product.Product" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="product" />
<a href="fetch.jsp">Click here to get the product details</a><br>
<a href="form.jsp">Click here to go the form page </a>

</body>
</html>