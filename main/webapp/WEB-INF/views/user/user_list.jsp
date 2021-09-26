<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h3>All Users</h3>

<table>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Enabled</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="user" items="${usersList}">

        <c:url var="editButton" value="/user/edit">
            <c:param name="username" value="${user.username}"/>
        </c:url>

        <c:url var="deleteButton" value="/user/delete">
            <c:param name="username" value="${user.username}"/>
        </c:url>

        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.enabled}</td>
            <td>
                <input type="button" value="Edit"
                       onclick="window.location.href='${editButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>
</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href ='user/add'"/>

</body>
</html>
