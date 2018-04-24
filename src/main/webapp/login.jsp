<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<title>登录</title>
<style type="text/css">
	body{
		width:100%;
		height:100%;
		margin: 0 0;
	}
	.login_container{
	
	    margin-left: auto; margin-right: auto;
	    margin-top:100px;
	    width:250px;
		padding:20px;
		border: 1px solid #eee;
	}
	.acount_input , .password_input {
		margin-top:10px;
		width: 250px;
		height: 30px;
	}
	.login_btn{
		margin-top:10px;
		width: 250px;
		height: 30px;
		background: #1296db;
		text-align: center;
		line-height: 30px;
	}
</style>
</head>
<body>
	<div class="login_container">
	<form action="${pageContext.request.contextPath}/register.do" method="POST">
		账号: <input id="name" type="text" name="name">
		<br />
		密码: <input id="password" type="password" name="password" />
		<input type="submit"  value="注册" />
	</form>
	<!--  
	    <div class="acount_input">
	    	账号：<input id="acount" type="text"/>
	    </div>
	    <div class="password_input">
	    	密码：<input id="password" type="text"/>
	    </div>
	    <div  class="login_btn" onclick="fnLogin();">登录</div>
	-->
	</div>
</body>

</html>