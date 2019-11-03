<%--
  Created by IntelliJ IDEA.
  User: yangyl
  Date: 2019/11/2
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
   
</head>
<body>
    <h3>fileUpload</h3>
    <form action="/fileUpload1" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input type="submit" value="传统上传">
    </form>
    <form action="/fileUpload2" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input type="submit" value="springmvc上传">
    </form>
    <form action="/fileUpload3" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input type="submit" value="跨服务器springmvc上传">
    </form>
</body>
</html>
