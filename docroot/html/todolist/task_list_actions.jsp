<%@include file="/html/init.jsp"%>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Task task = (Task)row.getObject(); 
%>

<liferay-ui:icon-menu>

    <c:if
        test="<%= TaskPermission.contains(permissionChecker, task.getTaskId(), ActionKeys.UPDATE) %>">
        <portlet:renderURL var="editURL">
            <portlet:param name="taskId"
                value="<%= String.valueOf(task.getTaskId()) %>" />
            <portlet:param name="mvcPath" value="/html/todolist/edit_task.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Edit"
            url="<%= editURL.toString() %>" />
    </c:if>
    
    <c:if
	    test="<%=TaskPermission.contains(permissionChecker, task.getTaskId(), ActionKeys.PERMISSIONS) %>">
	
	    <liferay-security:permissionsURL
	        modelResource="<%= Task.class.getName() %>"
	        modelResourceDescription="<%= task.getDescription() %>"
	        resourcePrimKey="<%= String.valueOf(task.getTaskId()) %>"
	        var="permissionsURL" />

    	<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />

	</c:if>
	
	<c:if
        test="<%=TaskPermission.contains(permissionChecker, task.getTaskId(), ActionKeys.DELETE) %>">

        <portlet:actionURL name="deleteTask" var="deleteURL">
            <portlet:param name="taskId"
                value="<%= String.valueOf(task.getTaskId()) %>" />
            <portlet:param name="taskListId"
                value="<%= String.valueOf(task.getTaskListId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
    </c:if>

</liferay-ui:icon-menu>