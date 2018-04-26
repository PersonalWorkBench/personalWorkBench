<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>工作室建立</h1>

	<form action="/PersonalWorkBench/WorkBenchServlet" method="post">
	<table>
		<tr>
			<td><label for="">工作室名稱</label></td>
			<td><input type="text" name="benchName" id="benchName"></td>
		</tr>
		<tr>
			<td><label for="">工作是簡介:</label></td>
			<td><textarea cols="30" rows="6" name="benchIntroduction" id="benchIntroduction"></textarea></td>
		</tr>
				<tr>
			<td><label for="">統一編號:</label></td>
			<td><input type="text" name="taxNumber" id="taxNumber"></td>
		</tr>
				
		<tr>
			<td><label for="">照片:</label></td>
			<td><input type="file" name="benchPic" id="archive" ></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit"/></td>
			<td><a href="workBenchAdmin.jsp"><input type="button" value="cancel"/></a></td>
		</tr>
	</table>
	
	
	
	
	
		<input type="hidden" name="status" value="signin"/>
	</form>
</body>
</html>