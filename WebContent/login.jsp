<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login App</title>
</head>
<body>
<FORM NAME="LoginForm" ACTION="loginaction" METHOD="post">
hello Spring Jsp
<input type="text" name="userId" />
<input type="password" name="password" />
<INPUT TYPE="submit" NAME="Submit" VALUE="LOGIN">
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
</FORM>
</body>
</html>