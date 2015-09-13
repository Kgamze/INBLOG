<%--
  Created by IntelliJ IDEA.
  User: Mesut DOGAN <mesut.dogan@indbilisimcom.tr>
  Date: 9/17/15
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>

<!-- Fixed navbar -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default navbar-fixed-top" style="background-color: #f5f5f5;">
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
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">
                            <spring:message code="menu.top.weekly"></spring:message></a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="?locale=tr">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/Turkey-icon.png">
                </a></li>
                <li><a href="?locale=en">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/United-Kingdom-icon.png">
                </a></li>
                <li class="active">
                    <form class="navbar-form navbar-right">
                        <div class="form-group">
                            <input type="text" placeholder="Email" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="Password" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">Sign in</button>
                    </form>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>