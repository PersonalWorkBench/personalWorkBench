<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者帳號搜尋</title>
</head>
<body>
	<form action ="/PersonalWorkBench/adminServlet" method="post" >
		搜尋:<input type="text" name="account">
		<input type="submit" value="確認">
		<input type="hidden" name="status" value="query">
		<table border="1">
		<tr>
			<td>編號</td>
			<td>使用者帳號</td>
			<td>使用者密碼</td>
			<td>姓名</td>
			<td>性別</td>
			<td>身份證</td>
			<td>電話號碼</td>
			<td>生日</td>
			<td>地址</td>
			<td>照片</td>
		</tr>
		<c:forEach items="${requestScope.queryaccount }" var="queryaccount" varStatus="num">
			<tr>
				<td>${num.count }</td>
				<td>${queryaccount.userID }</td>
				<td>${queryaccount.userPass }</td>
				<td>${queryaccount.name }</td>
				<td>${queryaccount.sex }</td>
				<td>${queryaccount.personalID }</td>
				<td>${queryaccount.number }</td>
				<td>${queryaccount.date }</td>
				<td>${queryaccount.address }</td>
				<td>${queryaccount.personalPic }</td>
		
		
		</tr>
		</c:forEach>
		
		
		
		
		</table>
</form>
</body>
</html>