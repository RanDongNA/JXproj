<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
new product:
<form method="put" action="/rest/product/createProduct">
	name: <input name="productName" type="text" />
	description: <input name="productDescription" type="text" />
	parent product id: <input name="parentProductId" type="text" />
<input type="submit" value="create new product" />
</form>
</body>
</html>