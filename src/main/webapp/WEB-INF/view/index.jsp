<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, please enter your data</h2>
<br>
<form:form action = "showName" modelAttribute = "employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Which car do you prefer?
    <br>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign language (s)
    En <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="Deutch"/>
    FR <form:checkbox path="languages" value="French"/>
    <br>
    Enter your phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Enter your Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>