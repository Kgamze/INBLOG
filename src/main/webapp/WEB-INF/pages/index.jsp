<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<tiles:insertDefinition name="default">
    <tiles:putAttribute name="body">
        <div class="row">
            <div class="col-md-8 col-md-offset-2 ">
                <span class="label label-info">Toplam 157 Blog</span>
                <span class="label label-success">Son Guncelleme : 22.34</span>

                <hr>

                <div class="twt-wrapper">
                    <div class="panel  panel-default">
                        <div class="panel-heading">

                        </div>
                        <div class="panel-body">

                            <ul class="media-list">
                                <c:forEach items="${itemList}" var="item">

                                    <li class="media" style="border-bottom: 15px saddlebrown">
                                        <a href="#" class="pull-left">
                                            <img src="${item.imageUrl}" alt="" class=" img-rounded"
                                                 style="width: 80px;">
                                        </a>

                                        <div class="media-body ">
                                                <span class="text-muted pull-right">
                                                    <small class="text-muted">${item.publishDate}
                                                        <br>

                                                        <div style="margin-left:70%; ">
                                                            <h4><a id="likeBtn${item.id}" class="likeBtn">
                                                                <span class="glyphicon glyphicon-thumbs-up "
                                                                      style="color:green;" aria-hidden="true"></span>
                                                            </a>
                                                                <span class="glyphicon glyphicon-thumbs-down"
                                                                      aria-hidden="true"></span>
                                                                <br>
                                                                <span class="glyphicon-class ">+7</span>
                                                                <span class="glyphicon-class">-1</span>
                                                            </h4>
                                                        </div>

                                                    </small>
                                                </span>
                                            <strong class="text-success">${item.title}</strong>
                                            <span class="label label-default">${item.blog.name}</span>

                                            <p>
                                                    ${item.description}
                                            </p>
                                        </div>
                                    </li>
                                    <hr>
                                </c:forEach>
                            </ul>
                            <div class="clearfix"></div>
                            <hr>
                            </div>
                        </div>
                </div>
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>