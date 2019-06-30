<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<c:set var="titleKey">
	<tiles:getAsString name="title" />
</c:set>
<title><tiles:insertAttribute name="title" ignore="true" /></title> 
<%-- <title>Bookstore | <spring:message code="${titleKey}" text="Your Home in Books" /></title> --%>
<link rel="stylesheet" type="text/css" href="<c:url value="css/style.css"/>">

</head>
<body>
	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div style="float: left; padding: 10px; width: 80%; border-left: 1px solid pink;">
		<tiles:insertAttribute name="body" />
	</div>
	<div style="clear: both">
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>
