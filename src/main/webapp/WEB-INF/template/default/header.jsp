<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal.firstname" var="firstName" scope="session"/>
    <sec:authentication property="principal.lastname" var="lastName" scope="session"/>
    <sec:authentication property="principal.id" var="id" scope="session"/>
</sec:authorize>

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
            <a class="navbar-brand" href="#"><spring:message code="project.name"/> </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class=""><a href="/">Home</a>
                </li>
                <sec:authorize access="isAnonymous()">
                    <li class=""><a href="/user/signup">Sign Up</a></li>
                    <li class=""><a href="/login">Sign In</a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="/blog/search">Blogs</a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="/user/view">Users</a></li>
                </sec:authorize>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class=""><a href="?locale=tr">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/Turkey-icon.png">
                </a>
                </li>
                <li><a href="?locale=en">
                    <img src="http://icons.iconarchive.com/icons/custom-icon-design/flat-europe-flag/32/United-Kingdom-icon.png">
                </a>
                </li>
                <li>
                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </li>
                <sec:authorize access="isAuthenticated()">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Hosgeldin, ${firstName} ${lastName} <span class="caret"></span></a>
                        <ul class="dropdown-menu">

                            <li><a href="#"><spring:message text="Yardim"></spring:message></a></li>
                            <li><a href="#"><spring:message text="Ayarlar"></spring:message></a></li>
                            <li><a href="/logout"><spring:message code="login.logout"></spring:message></a></li>
                        </ul>
                    </li>
                </sec:authorize>

            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>