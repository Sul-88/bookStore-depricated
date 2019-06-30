<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form method="get" action="<c:url value = "/search"/>">
	<fieldset>
		<legend>Search Criteria</legend>
		<table>
			<tr>
				<td><label for="title">Title</label></td>
				<td><input id="title" name="title" /></td>
			</tr>
		</table>
	</fieldset>
	<button id="search">Search</button>
</form>

<c:if test="${not empty bookList}">
    <table>
        <tr>
            <th><spring:message code="book.title"/></th>
            <th><spring:message code="book.description"/></th>
            <th><spring:message code="book.price" /></th>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td><a href="<c:url value="/book/detail/${book.id}"/>">${book.title}</a></td>
                <td>${book.description}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>



