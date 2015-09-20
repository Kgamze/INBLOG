<%--
  Created by IntelliJ IDEA.
  User: dgnmst
  Date: 21.09.2015
  Time: 00:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>


<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <tiles:putAttribute name="active_page" value="about"></tiles:putAttribute>

    </tiles:putAttribute>
</tiles:insertDefinition>