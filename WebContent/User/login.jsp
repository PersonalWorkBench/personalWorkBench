<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<!DOCTYPE html >

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入頁面</title>
</head>
<body>

	<h1>帳號登入</h1>	
		
<form class="form-horizontal" action ="/PersonalWorkBench/userServlet" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">帳號:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="account" name="account" maxlength="12">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">密碼:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="pass" maxlength="12" >
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> 記住帳號
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
  
  
    <div class="col-sm-offset-2 col-sm-10">
 	 
 	 
 	  <button type="submit" class="btn btn-primary btn-lg active">登入</button>
      <a href="../index.jsp"><button type="button" class="btn btn-primary btn-lg active">離開</button></a>
 	
    </div>
  </div>
  <input type="hidden" name="status" value="login">
</form>
	
		
		
		
		
</body>
</html>
