<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test ssm+ajax</title>
<script src="/js/jquery-3.2.1.min.js"></script>
<script src="/js/ajax.js"></script>
</head>
<body>
<div>
	用户名：<input type="text" name="username" id="loginUserName"/><br>
	密码：<input type="text" name="password" id="loginPassword"/><br>
	<input type="button" value="登陆" onclick="login()"/>
</div>
<div>
	用户名：<input type="text" name="regusername" id="registerUserName"/><br>
	密码：<input type="text" name="regpassword" id="registerPassword"><br>
	年龄：<input type="text" name="regge" id="registerAge"><br>
	<input type="button" value="注册" onclick="register()"><br>
</div>
<div>
	<input type="text" name="search" id="userId">&nbsp;
	<input type="button" value="查询" onclick="#"><br>
</div>
</body>
</html>