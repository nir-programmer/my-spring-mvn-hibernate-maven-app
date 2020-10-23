<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Hello World!</p>
	
	<br><br>
	
	Student name: ${param.studentName}
	
	<br><br>
	
	<!-- manually binding request from param to the model -->
	
	The message: ${message}
	
	
</body>
</html>