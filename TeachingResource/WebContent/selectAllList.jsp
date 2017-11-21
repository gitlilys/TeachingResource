<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询所有用户信息</title>
</head>

<body>
<center><h3>查询所有用户信息</h3></center>
<table border="1" align="center" width="700px">
	<tr>
    	<th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>用户角色</th>
        <th>创建时间</th>
        <th>有效否</th>
        <th>操作</th>
 	</tr>
    <tr>
    	<td>${requestScope.user_id }</td>
        <td>${requestScope.user_name }</td>
        <td>${requestScope.user_password }</td>
        <td>${requestScope.user_role }</td>
        <td>${requestScope.user_cretetime }</td>
        <td>${requestScope.user_enables }</td>
        <td><a href="">删除</a></td>
    </tr>
    <tr>
    	<td colspan="7" align="center"><a href="">【添加用户】</a>
    </tr>
</table>
</body>
</html>