<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h3>Hello from home page</h3>

<br>
<sec:authorize access="isAuthenticated()">

    <input type="button" value="Logout, ${username}"
           onclick="window.location.href='/logout'"/>

</sec:authorize>
<br>
<sec:authorize access="isAnonymous()">

    <input type="button" value="Log in"
           onclick="window.location.href='/login'"/>

</sec:authorize>
</body>
</html>
