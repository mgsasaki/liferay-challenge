<%@include file="/html/init.jsp" %>

<%
	long taskListId = Long.valueOf((Long) renderRequest.getAttribute("taskListId"));
%>

<aui:nav cssClass="nav-tabs">

	<%
		List<TaskList> taskLists = TaskListLocalServiceUtil.getTaskLists(scopeGroupId);
		for (int i = 0; i < taskLists.size(); i++) {
			TaskList curTaskList = (TaskList) taskLists.get(i);
			
			String cssClass = StringPool.BLANK;
			
			if (curTaskList.getTaskListId() == taskListId) {
				cssClass = "active";
			}
			
			if (TaskListPermission.contains(permissionChecker, curTaskList.getTaskListId(), "VIEW")) {
	%>
	
	<portlet:renderURL var="viewPageURL">
		<portlet:param name="mvcPath" value="/html/todolist/view.jsp"/>
		<portlet:param name="taskListId" 
			value="<%= String.valueOf(curTaskList.getTaskListId()) %>"/>
	</portlet:renderURL>
	
	<aui:nav-item cssClass="<%= cssClass %>" href="<%= viewPageURL %>" 
		label="<%= HtmlUtil.escape(curTaskList.getName()) %>" />

	<%
			}
		}
	%>

</aui:nav>

<portlet:renderURL var="addTaskListURL">
	<portlet:param name="mvcPath" value="/html/todolist/edit_task_list.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="addTaskURL">
	<portlet:param name="mvcPath" value="/html/todolist/edit_task.jsp"></portlet:param>
	<portlet:param name="taskListId" value="<%= String.valueOf(taskListId) %>"/>
</portlet:renderURL>

<aui:button-row cssClass="todolist-buttons">
	<c:if test='<%= TaskListPermission.contains(permissionChecker, taskListId, "ADD_TASK") %>'>
		<aui:button onClick="<%= addTaskURL.toString() %>" value="New Task" />
	</c:if>

	<c:if test='<%= ToDoListPermission.contains(permissionChecker, scopeGroupId, "ADD_TASK_LIST") %>'>
		<aui:button onClick="<%= addTaskListURL.toString() %>" value="New Task List" />
	</c:if>
</aui:button-row>

<liferay-ui:search-container 
		total="<%= TaskLocalServiceUtil.getTasksCount(scopeGroupId, taskListId) %>">
	
	<liferay-ui:search-container-results 
		results="<%= TaskLocalServiceUtil.getTasks(scopeGroupId, 
				taskListId, searchContainer.getStart(),
				searchContainer.getEnd()) %>" />
				
	<liferay-ui:search-container-row
		className="Task" modelVar="task">
		
		<portlet:actionURL name="toggleDone" var="doneURL">
			<portlet:param name="taskId" value="<%= String.valueOf(task.getTaskId()) %>"/>
			<portlet:param name="taskListId" value="<%= String.valueOf(task.getTaskListId()) %>"/>
		</portlet:actionURL>
		<liferay-ui:search-container-column-text name="Done">
			<a href="<%= doneURL.toString() %>"><%= task.getDone() ? "Undone" : "Done" %></a>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text property="description" name="Task" />
		<liferay-ui:search-container-column-date property="dueDate" name="Due Date" />
		<liferay-ui:search-container-column-jsp path="/html/todolist/task_list_actions.jsp" align="right" />
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
</liferay-ui:search-container>