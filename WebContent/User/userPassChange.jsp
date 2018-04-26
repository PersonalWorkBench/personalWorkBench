<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>passExchange</title>
</head>
<body>
<form action="/PersonalWorkBench/userServlet" method="post">
	請輸入舊密碼:<input type="password" name="oldPass">	<br>
	請輸入新密碼:<input type="password" name="newPass">
	<input type="submit" name="entry">
	<input type="hidden" name="status" value="profileExchange">
	</form>
</body>
</html>	