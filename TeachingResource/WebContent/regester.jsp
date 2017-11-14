<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Awesome Login Form Responsive Widget,皮卡丘,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />

<body>
	<form action="${pageContext.request.contextPath}/TeRe/regester" method="post" onsubmit="return isValid(this);" >
		用户名：     <input name="name" type="text"> <br>
		密码：        <input name="password" type="password"> <br>
		确认密码：<input name="rqpassword" type="password"> <br>
		<input type="submit" value="注册">
	</form>
</body>
</html>