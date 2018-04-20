<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>帳號註冊</h1>
	<form action="/PersonalWorkBench/userServlet" method="post">
	<table>
		<tr>
			<td><label for="">使用者帳號:</label></td>
			<td><input type="text" name="account" required="required"></td>
		</tr>
		<tr>
			<td><label for="">使用者密碼:</label></td>
			<td><input type="password" name="pass" required="required"></td>
		</tr>
		<tr>
			<td><label for="">確認密碼:</label></td>
			<td><input type="password" name="passCheck" required="required"></td>
		</tr>
		<tr>
			<td><label for="">姓名:</label></td>
			<td><input type="text" name="name" id="name" required="required"></td>
		</tr>
		<tr>
			<td><label for="">生日:</label></td>
			<td><input name="birthday" size="10" maxlength="10" required="required">  </td>
		</tr>
		<tr>
			<td><label for="">身份證字號:</label></td>
			<td><input type="text" name="personalID" id="personalID" required="required"></td>
		</tr>
		<tr>
			<td><label for="">電話號碼:</label></td>
			<td><input type="text" name="number" id="number" required="required"></td>
		</tr>
		<tr>
			<td><label for="">地址:</label></td>
			<td><input type="text" name="address" id="address" required="required"></td>
		</tr>
		<tr>
			<td><label for="">性別:</label></td>
			<td>
				<select name="size" id="size">
				<option value="male">男</option>
				<option value="female">女</option></select>
			</td>
		</tr>
		<tr>
			<td><label for="">使用者照片:</label></td>
			<td><input type="file" name="personalPic"  multiple="multiple"></td>
		</tr>
		<tr>
			<td><input type="submit" value="確定"/></td>
			<td><input type="submit" value="離開"/></td>
			
		</tr>
	</table>
		<input type="hidden" name="status" value="signin">

	</form>
<script >
	function isDate(f) {  
	    var str = f.birthday.value; 
	    var re = /^\d{4}[/]\d{1,2}[/]\d{1,2}$/;  
     if (!re.test(str)) {  
	        alert("日期格式錯誤");  
	        return false;  
	    }     
	    var arr = str.match(/\d+/g);  
	    var str1 = parseInt(arr[0]) + "/" + parseInt(arr[1]) + "/" + parseInt(arr[2]);  
	    var d = new Date(str1);  
	    if (isNaN(d)){  
	        alert("日期格式錯誤"); 
	        return false;  
	    }  
	    var str2 = d.getFullYear() + "/" + (d.getMonth()+1) + "/" + d.getDate();  
	    if (str2 != str1) {  
	        alert("日期錯誤");  
	        return false;  
	    } 
	    return true; 
	}  
	</script> 	
</body>
</html>
