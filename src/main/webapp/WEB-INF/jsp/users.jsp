<%@ page contentType="text/html; charset = UTF-8" %>
<html>
<head>
    <title>users</title>
</head>

<body>
${users}
<form action="${pageContext.request.contextPath}/users/search" method="POST">
    <label>
        <input type="text" name="user"/>
    </label>
    <p>
        <input type="submit" value="Search"/>
    </p>
</form>
${foundUser}
</body>
</html>