<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">


        <div class="row">

            <div class="col-md-8 col-md-offset-2">
                <br>
                <br>
                <br>
                <spring:message code="home.info"></spring:message>
                <span class="label label-default">Toplam 157 Blog</span>
                <span class="label label-success">Son Guncelleme : 22.34</span>
                <br><br>
                <ul class="list-group">
                    <c:forEach var="i" begin="0" end="10">
                        <div class="media">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" data-src="holder.js/64x64" alt="64x64"
                                         src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSxW0kkwyfUjXIxl6eB94306wN8lt5I1xY2ZEOubF6A6aUspT3OzqmeJw"
                                         data-holder-rendered="true" style="width: 64px; height: 64px;">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">Media heading</h4>
                                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante
                                sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra
                                turpis.
                            </div>
                            <div class="media-right">
                                <a href="#">
                                    <img class="media-object" data-src="holder.js/64x64" alt="64x64"
                                         src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/PjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB3aWR0aD0iNjQiIGhlaWdodD0iNjQiIHZpZXdCb3g9IjAgMCA2NCA2NCIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+PCEtLQpTb3VyY2UgVVJMOiBob2xkZXIuanMvNjR4NjQKQ3JlYXRlZCB3aXRoIEhvbGRlci5qcyAyLjYuMC4KTGVhcm4gbW9yZSBhdCBodHRwOi8vaG9sZGVyanMuY29tCihjKSAyMDEyLTIwMTUgSXZhbiBNYWxvcGluc2t5IC0gaHR0cDovL2ltc2t5LmNvCi0tPjxkZWZzPjxzdHlsZSB0eXBlPSJ0ZXh0L2NzcyI+PCFbQ0RBVEFbI2hvbGRlcl8xNGZkYjkyZTY4YyB0ZXh0IHsgZmlsbDojQUFBQUFBO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1mYW1pbHk6QXJpYWwsIEhlbHZldGljYSwgT3BlbiBTYW5zLCBzYW5zLXNlcmlmLCBtb25vc3BhY2U7Zm9udC1zaXplOjEwcHQgfSBdXT48L3N0eWxlPjwvZGVmcz48ZyBpZD0iaG9sZGVyXzE0ZmRiOTJlNjhjIj48cmVjdCB3aWR0aD0iNjQiIGhlaWdodD0iNjQiIGZpbGw9IiNFRUVFRUUiLz48Zz48dGV4dCB4PSIxMy40NzY1NjI1IiB5PSIzNi41Ij42NHg2NDwvdGV4dD48L2c+PC9nPjwvc3ZnPg=="
                                         data-holder-rendered="true" style="width: 64px; height: 64px;">
                                </a>
                            </div>
                        </div>
                    </c:forEach>
                </ul>
            </div>
        </div>
        </div>


    </tiles:putAttribute>
</tiles:insertDefinition>