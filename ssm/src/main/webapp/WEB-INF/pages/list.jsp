<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    查询成功<br/>
    <c:forEach items="${list}" var="account">
        ${account.name}:${account.money}<br/>
    </c:forEach>
</body>
</html>
