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
    <script src="js/jquery.min.js"></script>
    <script>
        // 页面加载，绑定单击事件
        $(function () {
           $("#btn").click(function () {
               //alert("hello");
               $.ajax({
                   url:"user/testAjax",
                   contentType:"application/json;charset=UTF-8",
                   data:'{"username":"hehe","age":29}',
                   dataType:"json",
                   type:"post",
                   success:function (data) {
                       alert(data.username);
                   }
               });
           }); 
        });
    </script>
</head>
<body>
    <h3>testResponse</h3>
    <button id="btn">点我哦</button>
</body>
</html>
