<%--
  Created by IntelliJ IDEA.
  User: 4oc3p
  Date: 26.05.2017
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<button onclick="return location.href = '${pageContext.request.contextPath}/users'">users</button>
<button onclick="return location.href = '${pageContext.request.contextPath}/users/admins'">admins</button>

</body>
</html>
