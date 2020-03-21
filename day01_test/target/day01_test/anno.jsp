<%--
  Created by IntelliJ IDEA.
  User: shenggu
  Date: 2020/2/8
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<%--  常用的注解  --%>
    <a href="anno/testRequestParam?name=哈哈">RequestParam </a>

    <%-- RequestBody --%>
    <form action="anno/testRequestBody" method="post">
        姓名: <input type="text" name="uname"><br>
        年龄: <input type="text" name="age"/><br>

        <input type="submit" value="提交">
    </form>

    <%--PathVariable--%>
    <a href="anno/testPathVariable/10">PathVariable </a>
    <br>


    <a href="anno/testRequestHeader">RequestHeader </a>
    <br>

    <a href="anno/testCookieValue">CookieValue </a>
    <br>

    <form action="anno/testModelAttribute" method="post">
        姓名: <input type="text" name="uname"><br>
        年龄: <input type="text" name="age"/><br>

        <input type="submit" value="提交">
    </form>
    <br>

    <a href="anno/testSessionAttributes">SessionAttributes </a>
    <a href="anno/getSessionAttributes">SessionAttributes </a>
    <a href="anno/delSessionAttributes">SessionAttributes </a>
</head>
<body>

</body>
</html>
