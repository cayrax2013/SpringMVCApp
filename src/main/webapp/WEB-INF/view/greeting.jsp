<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
       <h2>Dear Employee, you're Welcome!</h2>
       <br/>
        <h2>Your name is ${employee.name}</h2>
        <br>
        <h2>Your surname is ${employee.surname}</h2>
        <br>
        <h2>Your salary is ${employee.salary}</h2>
        <br>
        <h2>Your department is ${employee.department}</h2>
        <br>
        <h2>You prefer ${employee.carBrand}</h2>
        <br>
       <h2>You know the following languages:</h2>
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>
        <br>
        <h2>${employee.phoneNumber}</h2>
        <br>
        <h2>${employee.email}</h2>
    </body>
</html>