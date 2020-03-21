<%--
  Created by IntelliJ IDEA.
  User: shenggu
  Date: 2020/2/6
  Time: 7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h3>入门程序</h3>
<%--    <a href="hello">入门程序</a>--%>
<%--
    <a href="param/testParam?username=hehe">请求参数绑定</a>
      --%>

<%--    请求绑定应用类型
    <form action="param/testBean" method="post">
        姓名: <input type="text" name="username"><br>
        密码: <input type="text" name="password"/><br>
        金额: <input type="text" name="money"/><br>
        用户名称: <input type="text" name="user.uname"><br>
        用户年龄: <input type="text" name="user.age"><br>
        <input type="submit" value="提交">
    </form>
    --%>

<%--   请求参数绑定复杂类型
    <form action="param/testBean" method="post">
        姓名: <input type="text" name="username"><br>
        密码: <input type="text" name="password"/><br>
        金额: <input type="text" name="money"/><br>
        用户名称: <input type="text" name="list[0].uname"><br>
        用户年龄: <input type="text" name="list[0].age"><br>

        用户名称: <input type="text" name="map[0].uname"><br>
        用户年龄: <input type="text" name="map[0].age"><br>
        <input type="submit" value="提交">
    </form>
    --%>

    <%-- 自定义类型转换器
    <form action="param/saveUser" method="post">
        姓名: <input type="text" name="uname"><br>
        年龄: <input type="text" name="age"/><br>
        日期: <input type="text" name="date"/><br>

        <input type="submit" value="提交">
    </form>--%>

    <a href="param/testServlet" >Servlet 原生的API</a>
</head>
<body>

</body>
</html>
