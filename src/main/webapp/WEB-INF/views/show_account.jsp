<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <%@ include file="../common/cssfiles.jsp"%>
    <title><spring:message code="label.title" /></title>
</head>
<body>
<h2> Bank Account Details </h2>

<!-- <p>Account # : ${param.accountNo} </p>
<p>Account Holder Name : ${param.accountHolderName} </p>
<p>Balance : ${param.balance} </p> -->

<p><spring:message code="label.accountNo" />: ${account.accountNo} </p>
<p><spring:message code="label.accountHolderName" />: ${account.accountHolderName} </p>
<p><spring:message code="label.balance" />: ${account.balance} </p>
<%@ include file="../common/jsfiles.jsp"%>
</body>
</html>
