<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入頁面</title>
</head>
<body>
	<h1>帳號登入</h1>
	<form action ="/PersonalWorkBench/userServlet" method="post">
	帳號:<input type="text" name="account"   maxlength="12" required="required"><br>
	密碼:<input type="password" name="pass"  maxlength="12" required="required"><br>
	<input type="submit" value="登入">
	<input type="submit" value="離開">
	<input type="hidden" name="status" value="login">
	</form>
	<a href="signin.jsp"><input type="submit" value="註冊"></a>
	
		<% if(request.getParameter("login")!=null){ 
		if(request.getParameter("login").equals("false")){%>
		<script>alert("密碼錯誤")</script>
		<%}} %>
</body>
</html>
