<%@include file="/html/init.jsp" %>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/todolist/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addTask" var="addTaskURL" />

<%
	Task task = null;
	
	long taskId = ParamUtil.getLong(renderRequest, "taskId");
	
	if (taskId > 0) {
	    task = TaskLocalServiceUtil.getTask(taskId);
	}
	
	long taskListId = ParamUtil.getLong(renderRequest, "taskListId");
%>

<aui:form action="<%= addTaskURL %>" name="<portlet:namespace />fm">
	<aui:model-context bean="<%= task %>" model="<%= Task.class %>" />
	
	<aui:fieldset>
		<aui:input name="description" />
		<aui:input name="dueDate" />
        <aui:input name="taskId" type="hidden" />
		<aui:input name='taskListId' type='hidden' 
        	value='<%= task == null ? taskListId : task.getTaskListId() %>'/>
	</aui:fieldset>
	
	<aui:button-row cssClass="todolist-buttons">
		<aui:button type="submit" />
		<aui:button onClick="<%= viewURL.toString() %>" type="cancel" />
	</aui:button-row>
</aui:form>