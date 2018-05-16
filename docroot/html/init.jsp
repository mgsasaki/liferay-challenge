<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>

<%@ page import="br.com.seatecnologia.test.todolist.model.TaskList" %>
<%@ page import="br.com.seatecnologia.test.todolist.model.Task" %>
<%@ page import="br.com.seatecnologia.test.todolist.service.TaskListLocalServiceUtil" %>
<%@ page import="br.com.seatecnologia.test.todolist.service.TaskLocalServiceUtil" %>

<%@ page import="br.com.seatecnologia.test.todolist.service.permission.ToDoListPermission" %>
<%@ page import="br.com.seatecnologia.test.todolist.service.permission.TaskListPermission" %>
<%@ page import="br.com.seatecnologia.test.todolist.service.permission.TaskPermission" %>

<%@ page import="br.com.seatecnologia.test.todolist.util.WebKeys" %>

<portlet:defineObjects />
<theme:defineObjects />