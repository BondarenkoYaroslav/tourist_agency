<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<br>
<h3>User info</h3>
<br>

<form:form action="/user/save" modelAttribute="user">

    Name <form:input path="username"/>
    <br><br>
    Password <form:input path="password"/>
    <br><br>
    <form:select path="enabled">
        <form:option value="1">Enabled</form:option>
        <form:option value="0">Disabled</form:option>
    </form:select>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
