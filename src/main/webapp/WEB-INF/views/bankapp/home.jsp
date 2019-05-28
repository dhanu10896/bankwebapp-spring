<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello Home </title>
    <link href="${contextPath}/scripts/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Hello</h2>
<script src="${contextPath}/scripts/js/main.js"></script>
</body>
</html>