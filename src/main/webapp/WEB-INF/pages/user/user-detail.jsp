<%--
  Created by IntelliJ IDEA.
  User: dgnmst
  Date: 9/22/15
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 ">
                <h3><c:out value="${user.fullName} kisisine ait bloglar (Toplam ${user.blogs.size()}) :"></c:out></h3>

                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#BLOG ID</th>
                        <th>Blog Name</th>
                        <th>Blog Link Name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${user.blogs}">
                        <tr>
                            <td>${item.id}</td>
                            <td>${item.name}</td>
                            <td>${item.url}</td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>

    </tiles:putAttribute>
</tiles:insertDefinition>
