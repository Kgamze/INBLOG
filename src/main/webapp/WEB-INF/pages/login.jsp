<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">

        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4   ">

                    <form class="form-signin" name="f" method="post" action="/login">
                        <h2 class="form-signin-heading">
                            <spring:message code="login.signin"/>
                        </h2>
                        <label for="username" class="sr-only"><spring:message code="login.email"/> </label>
                        <input type="text" name="username" id="username" class="form-control"
                               placeholder="Email address" required autofocus>
                        <label for="password" class="sr-only"><spring:message code="login.password"/></label>
                        <input type="text" name="password" id="password" class="form-control" placeholder="Password"
                               required>

                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="remember-me"> <spring:message code="login.remember"/>
                            </label>
                        </div>
                        <button class="btn btn-lg btn-primary btn-block" type="submit"><spring:message
                                code="login.go"/></button>
                    </form>
                </div>
                <!-- /col-md-8 div -->
            </div>
            <!--  /row-->
        </div>
        <!-- /container -->
    </tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
