<%--
  Created by IntelliJ IDEA.
  User: yangyl
  Date: 2019/11/2
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>param</h3>
    <form action="account/saveAccount" method="post" >
        姓名：<input type="text" name="username">
        年龄：<input type="text" name="age">
        生日（年月日）：<input type="text" name="birthday">
        <br/>
        部下1姓名（list）：<input type="text" name="users[0].uname">
        部下1年龄（list）：<input type="text" name="users[0].uage">
        <br/>
        部下2姓名（map）：<input type="text" name="userMap['second'].uname">
        部下2年龄（map）：<input type="text" name="userMap['second'].uage">
        <br/>
        姓名（注入内部引用）：<input type="text" name="user.uname">
        年龄（注入内部引用）：<input type="text" name="user.uage">
        <br/>
        
        <input type="submit">
    </form>

</body>
</html>
