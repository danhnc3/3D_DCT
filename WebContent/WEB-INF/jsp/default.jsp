<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="${pageContext.request.contextPath}/resources/css/common.css" rel="stylesheet" >
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/test.js"></script>
    
	<title>Example</title>
	<style type="text/css">
		body {
			background-image: url('https://crunchify.com/bg.png');
		}
	</style>
</head>
<body>
	${message}
	<br>
	<br>
	<input id="test" class="test" type="button" value="TEST"></input>
</body>
</html>