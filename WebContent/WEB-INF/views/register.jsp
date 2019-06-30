<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${exception ne null}">
    <div class="error">
        ${exception.message}
    </div>
</c:if>
<form action="<c:url value="/register"/>" method="post">
    <fieldset>
        <legend>register</legend>
        <table>
        <tr>
            <td>Firstname</td>
            <td><input type="text" id="firstname" name="firstname" placeholder="Firstname"/></td>
        </tr>
         <tr>
            <td>Secondname</td>
            <td><input type="text" id="lastname" name="lastname" placeholder="Usename"/></td>
        </tr>
         <tr>
            <td>Username</td>
            <td><input type="text" id="username" name="username" placeholder="Usename"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" id="password" name="password" placeholder="Password"/></td>
        </tr>
         <tr>
            <td>Email</td>
            <td><input type="email" id="email" name="email" placeholder="Email"/></td>
        </tr>
        <tr><td colspan="2" align="center"><button id="register">Register</button></td></tr>
        </table>
    </fieldset>
</form>
