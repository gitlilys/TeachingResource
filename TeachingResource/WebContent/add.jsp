<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用户</title>
</head>

<body>
<center><h3>添加用户</h3></center>
<form action="${pageContext.request.contextPath}/TeRe/add" method="post">
<table border="1" align="center" width="300px">
	<tr/>
    	<th>用户名</th>
       	<td><input type="text" name="name"/></td>
    </tr>
    <tr/>
    	<th>密码</th>
       	<td>
        	<input type="password" name="password"/>
        </td>
    </tr>
    <tr/>
    	<th>用户角色</th>
       	<td><input type="text" name="role"/></td>
    </tr>
   	<tr>
    	<td colspan="2" align="center">
        	<input type="submit" value="添加"/>
        </td>
    </tr>
</table>
</form>
</body>
</html>