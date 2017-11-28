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
      
    <title>编辑网址</title>  
      
    <script type="text/javascript">  
    function updateUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>/updateUser";  
        form.method="post";  
        form.submit();  
    }
    
    function del(web_id){  
        $.get("<%=basePath%>/delUser?web_id=" + web_id,function(data){  
            if("success" == data.result){  
                alert("删除成功");  
                window.location.reload();  
            }else{  
                alert("删除失败");  
            }  
        });  
    }  
</script>  
</head>
<body>
 <h1>添加网址</h1>  
    <form action="" name="userForm">  
        
        ID：<input type="text" name="web_id" value="${user.web_id }"/>  
        网址：<input type="text" name="web_url" value="${user.web_url }"/>  
        <input type="button" value="编辑" onclick="updateUser()"/>
         
    </form>  
</body>
</html>