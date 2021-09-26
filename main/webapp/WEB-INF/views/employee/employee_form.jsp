<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<br>
<h3>Employee info</h3>
<br>

<form:form action="/employee/save" modelAttribute="emp">

    <form:input type="hidden" path="empId"/>

    Name <form:input required="required" path="empName"/>
    <br>
    Surname <form:input required="required" path="empSurname"/>
    <br>
    Birthday <form:input required="required" type="date" path="empBirthday"/>
    <br>
    Salary <form:input path="empSalary"/>
    <br>
    Position <form:input path="empPosition"/>
    <br>
    Address <form:input path="empAddress"/>
    <br>
    Phone <form:input type="tel" required="required" path="empPhone"/>
    <br>
    <input type="submit" value="OK">


</form:form>

</body>
</html>
