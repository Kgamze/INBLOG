<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>

<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">

        <div class="row">
            <div class="col-md-6 col-md-offset-3 ">
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#ID</th>
                        <th>Username</th>
                        <th>Full Name</th>
                        <th>e- mail</th>
                        <th>Total Blog</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${userList}" var="item">

                        <tr>
                            <td><c:out value="${item.id}"></c:out></td>
                            <td><c:out value="${item.userName}"></c:out></td>
                            <td><c:out value="${item.fullName}"></c:out></td>
                            <td><c:out value="${item.mail}"></c:out></td>
                            <td>-</td>
                            <td>
                                <a href="<c:url value="edit/${item.id}"></c:url>"><span
                                        class="glyphicon glyphicon-pencil"></span></a>
                                <a href="<c:url value="user/${item.id}"></c:url>"><span
                                        class="glyphicon glyphicon-search"></span></a>
                                <a href="<c:url value="delete/${item.id}"></c:url>"><span
                                        class="glyphicon glyphicon-trash"></span></a>
                            </td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>