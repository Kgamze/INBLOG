<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>

<html lang="tr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <style>
        .navbar {

            background-color: #2c2c2c;
            background-image: none;

        }
    </style>
    <title>
    </title>
</head>
<body>

<nav class="navbar navbar-fixed-top" style="background-color: #f5f5f5;">

    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class=""><a href="#">Home</a>
                </li>
                <li class=""><a href="${pageContext.request.contextPath}/InBlog/user/signup">Register</a>
                </li>
                <li class=""><a href="#contact">Contact</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><spring:message code="menu.top.weekly"></spring:message></a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="?locale=tr">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/Turkey-icon.png">
                </a>
                </li>
                <li><a href="?locale=en">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/United-Kingdom-icon.png">
                </a>
                </li>
                <li class="">
                    <form class="navbar-form navbar-right">
                        <div class="form-group">
                            <input type="text" placeholder="<spring:message code="login.email"></spring:message>"
                                   class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="<spring:message code="login.password"></spring:message>"
                                   class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success"><spring:message code="login.signin"/></button>
                    </form>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>
<br>
<br>
<br>
<br>
<br>

<tiles:insertAttribute name="body"/>
<tiles:insertAttribute name="footer"/>
</body>
</html>

