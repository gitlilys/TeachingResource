<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <c:forEach items="${requestScope.users}" var="user">
	    <tr>
	    	<td>${user.user_id }</td>
	        <td>${user.user_name }</td>
	        <td>${user.user_password }</td>
	        <td>${user.user_role }</td>
	        <td>${user.user_cretetime }</td>
	        <td>${user.user_enable }</td>
	        <td><a href="${pageContext.request.contextPath }/TeRe/deteleUser?user_name=${user.user_name }">删除</a></td>
	    </tr>
     </c:forEach>
    <tr>
    	<td colspan="7" align="center"><a href="${pageContext.request.contextPath}/add.jsp">【添加用户】</a>
    </tr>

</table>
</body>
</html>