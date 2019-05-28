<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Account</title>
</head>
<body>
<form name="accountForm" action="showAccount">
    <table>
        <tr>
            <td>Account #: </td>
            <td><input type="text" name="accountNo"/></td>
        </tr>
        <tr>
            <td>Account Holder Name #: </td>
            <td><input type="text" name="accountHolderName"/></td>
        </tr>
        <tr>
            <td>Account Balance : </td>
            <td><input type="text" name="balance"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"></td>
            <td><input type="submit" value="Create Account" name="btnSubmit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
