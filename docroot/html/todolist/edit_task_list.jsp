<%@include file="/html/init.jsp" %>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/todolist/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addTaskList" var="addTaskListURL"></portlet:actionURL>

<aui:form action="<%= addTaskListURL %>" name="<portlet:namespace />fm">
	<aui:fieldset>
		<aui:input name="name"></aui:input>
	</aui:fieldset>
	
	<aui:button-row cssClass="todolist-buttons">
		<aui:button type="submit"></aui:button>
		<aui:button onClick="<%= viewURL.toString() %>" type="cancel"></aui:button>
	</aui:button-row>
</aui:form>