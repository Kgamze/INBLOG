<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">

        <div class="row">
            <div class="col-md-4 col-md-offset-4   ">
                <form:form class="form-horizontal" method="post" modelAttribute="user">

                    <div class="form-group">
                        <label for="inputFullName" class="col-sm-2 control-label">Fullname</label>

                        <div class="col-sm-10">
                            <form:input path="fullName" class="form-control" id="inputFullName"
                                        placeholder="Full Name"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputEmail" class="col-sm-2 control-label">Email</label>

                        <div class="col-sm-10">
                            <form:input path="mail" class="form-control" id="inputEmail" placeholder="email@asdasda"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputPassword" class="col-sm-2 control-label">Password</label>

                        <div class="col-sm-10">
                            <form:password path="password" class="form-control" id="inputPassword"
                                           placeholder="Password"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Remember me
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Sign in</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>


    </tiles:putAttribute></tiles:insertDefinition>