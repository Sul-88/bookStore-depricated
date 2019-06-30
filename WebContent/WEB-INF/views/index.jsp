<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- 
<h1>Index jsp. Header message should be added</h1>
<p>Message is: ${message}</p>
 --%>
<form action="<c:url value="/login"/>" method="get">
	<button id="login">Login</button>
</form>

<form action="<c:url value="/register"/>" method="get">
	<button id="register">Register</button>
</form>



