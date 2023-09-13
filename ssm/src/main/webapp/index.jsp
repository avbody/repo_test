<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm工程</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>
    <h3>测试保存</h3>
    <form action="account/saveAccount">
        姓名：<input type="text" name="name"/><br/>
        存款：<input type="text" name="money"/><br/>
        <input type="submit" value="保存"/>
    </form>

</body>
</html>
