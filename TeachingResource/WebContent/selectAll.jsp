<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-utf-8">
<title>查询所有用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/TeRe/selectAll" method="post">
	<input type="submit" value="查询"/>
</form>
</body>
</html>