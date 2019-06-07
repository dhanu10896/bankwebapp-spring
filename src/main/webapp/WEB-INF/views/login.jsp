<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DN Bank: Login Form</title>
</head>
<body>
<div class="container">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

    <div class="row" style="margin-top: 10px;margin-bottom: 10px">
        <div class="col-12 offset-5">
            <div class="header clearfix">
                <h2 class="text-muted center">DN Bank</h2>
            </div>
        </div>
    </div>
    <div class="col-6 offset-3 align-self-center">
        <div class="card">
            <div class="card-header bg-info text-white center" >
                Login Here ( username: root | password : pass  )
            </div>

            <div class="card-body">
                <form role="form" method="post" action="<c:url value='/login' />">
                    <div class="form-group">
                        <label for="Username">User name :</label>
                        <input type="text"  class="form-control"
                               placeholder="Enter Username" name="username" />
                    </div>

                    <div class="form-group">
                        <label for="Password">Password :</label>
                        <input type="password" class="form-control"
                               placeholder="Password" name="password" />
                    </div>

                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}" />

                    <input type="submit" value="Login" name="submit"
                           class="btn btn-primary" />
                </form>

                <div class="row">
                    <div class="col-12">
                        <c:if test="${not empty error}">
                            <p class="alert-danger">${error} </p>
                        </c:if>
                        <c:if test="${not empty msg}">
                            <p class="alert-warning">${msg}</p>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp"%>
</div>
</body>
</html>