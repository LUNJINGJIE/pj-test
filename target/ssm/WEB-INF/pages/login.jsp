<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/18
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>login</title>
</head>
<body>
<form action="login" method="post">
    user: <input type="text" name="name"/><br>
    pass: <input type="password" name="password"/><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
