<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">

        <div class="row">
            <div class="col-md-8 col-md-offset-2 ">

                <!-- Button trigger modal -->
                <button type="button" class="btn btn-success btn-sm" data-toggle="modal" data-target="#myModal">
                    Add New Item
                </button>
                <br>
                <br>
                <br>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <c:forEach items="${blogs}" var="item">
                        <li role="presentation"><a href="#<c:out value="${item.id}" />" aria-controls="settings"
                                                   role="tab" data-toggle="tab"><c:out value="${item.name}"/></a></li>
                    </c:forEach>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">

                    <c:forEach items="${blogs}" var="blog">
                        <div role="tabpanel" class="tab-pane" id="${blog.id}">
                            <br><span
                                class="label label-info">Blog Link : ${blog.url} Total item : ${blog.items.size()}</span>
                            <table class="table table-stripped">
                                <thead>
                                <tr>
                                    <th class="text text-success"><h5>Item Title</h5></th>
                                    <th class="text text-success"><h5>Date Added</h5></th>
                                    <th class="text text-success"><h5>Actions</h5></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${blog.items}" var="item">
                                    <tr>
                                        <td>
                                            <small>${item.title}</small>
                                        </td>
                                        <td>
                                            <small>${item.publishDate}</small>
                                        </td>
                                        <td>
                                            <small>
                                                <a href="<c:url value="${item.link}"></c:url>" target="_blank"><span
                                                        class="glyphicon glyphicon-circle-arrow-right"></span></a>
                                                <a href="<c:url value="blog/edit/${item.id}"></c:url>"><span
                                                        class="glyphicon glyphicon-wrench"></span></a>
                                                <a href="<c:url value="blog/delete/${item.id}"></c:url>"><span
                                                        class="glyphicon glyphicon-trash"></span></a></small>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </c:forEach>


                    </div>
                </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                    </div>
                    <div class="modal-body">
                        <form:form method="post" action="/blog/add" modelAttribute="blog">
                        <div class="form-group">
                            <label for="inputBlogName">Blog Name</label>
                            <form:input type="text" class="form-control" id="inputBlogName" path="name"
                                        placeholder="Blog Name ..."/>
                        </div>
                        <div class="form-group">
                            <label for="inputBlogUrl">URI</label>
                            <form:input type="text" class="form-control" id="inputBlogUrl" path="url"
                                        placeholder="URI ..."/>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <form:button type="button" class="btn btn-default" data-dismiss="modal">Kapat</form:button>
                        <form:button type="submit" class="btn btn-primary">Kayit</form:button>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript">
            $(document).ready(function () {
                        $('.nav-tabs a:first').tab('show');
                    }
            );
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>