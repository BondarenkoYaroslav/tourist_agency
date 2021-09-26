<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h3>All Employees</h3>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Birthday</th>
        <th>Salary</th>
        <th>Position</th>
        <th>Address</th>
        <th>Phone</th>
    </tr>

    <c:forEach var="emp" items="${empList}">

        <c:url var="editButton" value="/employee/edit">
            <c:param name="empId" value="${emp.empId}"/>
        </c:url>

        <c:url var="deleteButton" value="/employee/delete">
            <c:param name="empId" value="${emp.empId}"/>
        </c:url>

        <tr>
            <td>${emp.empName}</td>
            <td>${emp.empSurname}</td>
            <td>${emp.empBirthday}</td>
            <td>${emp.empSalary}</td>
            <td>${emp.empPosition}</td>
            <td>${emp.empAddress}</td>
            <td>${emp.empPhone}</td>
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
       onclick="window.location.href ='employee/add'"/>

</body>
</html>
