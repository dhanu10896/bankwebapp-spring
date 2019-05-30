<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="../common/cssfiles.jsp"%>
    <title>Account Details</title>
</head>
<body>
<h2>Account details</h2>
<p>Account#           : ${account.accountNo}</p>
<p>Account Hoder Name : ${account.accountHolderName}</p>
<p>Balance            : ${account.balance}</p>
<%@ include file="../common/jsfiles.jsp"%>
</body>
</html>
