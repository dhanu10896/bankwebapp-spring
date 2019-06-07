<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DN Bank </title>
</head>
<body>
<div class="container">
    <%@ include file="header.jsp" %>

    <div class="row">
        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <div class="jumbotron">
                <h1 class="display-4">Welcome to DN Bank</h1>
                <p class="lead">
                    Together we Prosper..
                </p>

                <a href="user/new" class="btn btn-lg btn-success">Register Here</a>
                <p><br />Already User? <a href="/user/login">Login to your account</a>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-xl-3 col-lg-3 col-md-3 col-sm-6 col-12">
            <div class="card" >
                <div class="card-header">Online</div>
                <img style=" width: 250px;
    height: 250px;" src="<spring:url
                value='https://raw.githubusercontent.com/dhanu10896/rootsite/master/src/main/resources/images/stay-online.png' />"
                     class="card-img-top" alt="Online" />
                <div class="card-body">
                    <p class="card-text">200+ Transactions via NetBanking</p>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="card" >
                <div class="card-header">Phone</div>
                <img style=" width: 250px;
    height: 250px;" src="<spring:url value='https://raw.githubusercontent.com/dhanu10896/rootsite/master/src/main/resources/images/stay-phone.png' />"
                     class="card-img-top" alt="phone" />
                <div class="card-body">
                    <p class="card-text">75+ Transactions on your smartphone</p>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="card" >
                <div class="card-header">Social Media</div>
                <img style=" width: 250px;
    height: 250px;" src="<spring:url value='https://raw.githubusercontent.com/dhanu10896/rootsite/master/src/main/resources/images/stay-social.png' />"
                     class="card-img-top" alt="Social" />
                <div class="card-body">
                    <p class="card-text">Social Media- Chatting, Sharing + Banking</p>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="card" >
                <div class="card-header">Watch</div>
                <img style=" width: 250px;
    height: 250px;" src="<spring:url value='https://raw.githubusercontent.com/dhanu10896/rootsite/master/src/main/resources/images/stay-watch.png' />"
                     class="card-img-top" alt="watch" />
                <div class="card-body">
                    <p class="card-text">Banking at the flick of a wrist now</p>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>