<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="../common/cssfiles.jsp"%>
    <meta charset="UTF-8">
    <title>Hello Home </title>
</head>
<body>
<h2 class="hello-title">Hello</h2>
<p>open  <a href="new">new account </a></p>
<%@ include file="../common/jsfiles.jsp"%>
</body>
</html>