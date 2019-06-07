<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><spring:message code="label.title"/></title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<div class="container">
    <%@ include file="header.jsp" %>

    <div class="row" style="margin-top: 50px;margin-bottom: 50px">
        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <h2 class="page-header">Please Fill Up The Form Details</h2>
        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <form:form action="${actionMethod}" modelAttribute="account"
                       cssClass="form-horizontal" role="form">
                <div class="form-group row">
                    <Label for="accountNo" class="col-6 col-form-label">Account
                        No:</Label>
                    <div class="col-6">
                        <form:input path="accountNo" cssClass="form-control"/>
                        <form:errors path="accountNo" cssClass="alert-danger"/>
                        <text class="alert-danger">${message} </text>
                    </div>
                </div>

                <div class="form-group row">
                    <Label for="accountHolderName" class="col-6 col-form-label">Account
                        Holder Name:</Label>
                    <div class="col-6">
                        <form:input path="accountHolderName" cssClass="form-control"/>
                        <form:errors path="accountHolderName" cssClass="alert-danger"/>
                    </div>
                </div>

                <div class="form-group row">
                    <Label for="balance" class="col-6 col-form-label">Amount
                        Balance:</Label>
                    <div class="col-6">
                        <form:input path="balance" cssClass="form-control"/>
                        <form:errors path="balance" cssClass="alert-danger"/>
                    </div>
                </div>

                <div class="form-group row">
                    <Label for="AccountType" class="col-6 col-form-label">Account
                        Type:</Label>
                    <div class="col-6">
                        <form:select path="accountType" cssClass="form-control">
                            <form:option value="">Select Account Type</form:option>
                            <form:option value="SAVINGS">Savings </form:option>
                            <form:option value="CURRENT">Current</form:option>
                        </form:select>
                        <form:errors path="accountType" cssClass="alert-danger"/>
                    </div>
                </div>

                <div class="form-group row">
                    <Label for="dob" class="col-6 col-form-label">Date of
                        Birth:</Label>
                    <div class="col-6">
                        <form:input path="dateOfBirth" cssClass="form-control"/>
                        <form:errors path="dateOfBirth" cssClass="alert-danger"/>
                    </div>
                </div>

                <div class="form-group row">
                    <Label for="psCode" class="col-6 col-form-label">PS
                        Security Code:</Label>
                    <div class="col-6">
                        <form:input path="psCode" cssClass="form-control"/>
                        <form:errors path="psCode" cssClass="alert-danger"/>
                    </div>
                </div>
                <c:if test="${isAddAction}">
                    <div class="form-group row">
                        <div class="offset-6 col-6">
                            <input type="submit" value="Add Account" name="btnSubmit"
                                   class="btn btn-primary"/>
                        </div>
                    </div>
                </c:if>
                <c:if test="${isEditAction}">
                    <div class="form-group row">
                        <div class="offset-6 col-6">
                            <input type="submit" value="Update Account" name="btnSubmit"
                                   class="btn btn-primary"/>
                        </div>
                    </div>
                </c:if>
                </table>
            </form:form>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
