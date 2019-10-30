<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<base href="<%=basePath%>">  
    <script type="text/javascript"></script>  
    <title>网址列表</title>   
</head>
<body>
<h6><a href="<%=basePath%>/toAddUser">添加网址</a></h6>  
    <table border="1">  
        <tbody>  
            <tr>  
                <th>ID</th>  
                <th>网址</th>
                <th>操作</th>   
            </tr>  
            <c:if test="${!empty userList }">  
                <c:forEach items="${userList}" var="user">  
                    <tr>  
                        <td>${user.web_id }</td>  
                        <td>${user.web_url }</td>  
                        <td>  
                            <a href="<%=basePath%>/getUser?web_id=${user.web_id}">编辑</a>  
                            <a href="<%=basePath%>/delUser?web_id=${user.web_id }">删除</a>  
                        </td>  
                    </tr>               
                </c:forEach>  
            </c:if>  
        </tbody>  
    </table>  
</body>
</html>