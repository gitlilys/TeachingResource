<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<base href="<%=basePath%>">  
      
    <title>添加网址</title>  
      
    <script type="text/javascript">  
    function addUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>/addUser";  
        form.method="post";  
        form.submit();  
    }  
</script>  
</head>
<body>
<h1><%=path%>添加网址<%=basePath%></h1>  
    <form action="" name="userForm">  
        ID：<input type="text" name="web_id">  
        网址：<input type="text" name="web_url">  
        <input type="button" value="添加" onclick="addUser()">  
    </form>  
</body>
</html>