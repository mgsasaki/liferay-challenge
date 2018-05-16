package br.com.seatecnologia.test.todolist.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import br.com.seatecnologia.test.todolist.model.Task;
import br.com.seatecnologia.test.todolist.model.TaskList;
import br.com.seatecnologia.test.todolist.service.TaskListLocalServiceUtil;
import br.com.seatecnologia.test.todolist.service.TaskLocalServiceUtil;

/**
 * Portlet implementation class ToDoListPortlet
 */
public class ToDoListPortlet extends MVCPortlet {

	public void addTaskList(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(TaskList.class.getName(), request);
		String name = ParamUtil.getString(request, "name");
		
		try {
			TaskListLocalServiceUtil.addTaskList(serviceContext.getUserId(), name, serviceContext);
			SessionMessages.add(request, "taskListAdded");
		}
		catch (Exception e){
			SessionErrors.add(request, e.getClass().getName());
			
			response.setRenderParameter("mvcPath", "/html/todolist/edit_task_list.jsp");
		}
	}
	
	public void addTask(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException{
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Task.class.getName(), request);
		DateFormat dateFormat = DateFormat.getInstance();
		
		String taskDescription = ParamUtil.getString(request, "description");
		Date taskDueDate = ParamUtil.getDate(request, "dueDate", dateFormat);
		
		long taskListId = ParamUtil.getLong(request, "taskListId");
		long taskId = ParamUtil.getLong(request, "taskId");
		
		if (taskId > 0) {
			try {
				Boolean isDone = ParamUtil.getBoolean(request, "done");
				TaskLocalServiceUtil.updateTask(serviceContext.getUserId(), taskListId, taskId, 
						taskDescription, taskDueDate, isDone, serviceContext);
				
				SessionMessages.add(request, "entryAdded");
				
				response.setRenderParameter("taskListId", Long.toString(taskListId));
			}
			catch (Exception e) {
				SessionMessages.add(request, e.getClass().getName());
				
				PortalUtil.copyRequestParameters(request, response);
				
				response.setRenderParameter("mvcPath", "/html/todolist/edit_task.jsp");
			}
		}
		else {
			try {
				TaskLocalServiceUtil.addTask(serviceContext.getUserId(), taskListId, taskDescription, 
						taskDueDate, serviceContext);

				SessionMessages.add(request, "taskAdded");

				response.setRenderParameter("taskListId", Long.toString(taskListId));
			}
			catch (Exception e) {
				SessionErrors.add(request, e.getClass().getName());

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/html/todolist/edit_task.jsp");
			}
		}
	}
	
	public void deleteTask(ActionRequest request, ActionResponse response) {
		
		long taskId = ParamUtil.getLong(request, "taskId");
		long taskListId = ParamUtil.getLong(request, "taskListId");
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Task.class.getName(), request);
			
			response.setRenderParameter("taskListId", Long.toString(taskListId));
			
			TaskLocalServiceUtil.deleteTask(taskId, serviceContext);
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
		}
	}
	
	public void toggleDone(ActionRequest request, ActionResponse response) {
		
		long taskListId = ParamUtil.getLong(request, "taskListId");
		long taskId = ParamUtil.getLong(request, "taskId");
		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Task.class.getName(), request);
			Task task = TaskLocalServiceUtil.getTask(taskId);
			 			
			TaskLocalServiceUtil.updateTask(serviceContext.getUserId(), taskListId, taskId, 
					task.getDescription(), task.getDueDate(), (!task.getDone()), serviceContext);
			
			SessionMessages.add(request, "entryModified");
			
			response.setRenderParameter("taskListId", Long.toString(taskListId));
			response.setRenderParameter("mvcPath", "/html/todolist/view.jsp");
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
		}

	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(TaskList.class.getName(), 
					renderRequest);
			
			long groupId = serviceContext.getScopeGroupId();
			long taskListId = ParamUtil.getLong(renderRequest, "taskListId");
			
			List<TaskList> taskLists = TaskListLocalServiceUtil.getTaskLists(groupId);
			
			if (taskLists.size() == 0) {
				TaskList taskList = TaskListLocalServiceUtil.addTaskList(serviceContext.getUserId(), 
						"Main", serviceContext);
				
				taskListId = taskList.getTaskListId();
			}
			
			if (!(taskListId > 0)) {
				taskListId = taskLists.get(0).getTaskListId();
			}
			
			renderRequest.setAttribute("taskListId", taskListId);
		}
		catch (Exception e) {
			throw new PortletException(e);
		}
		
		super.render(renderRequest, renderResponse);
	}
	
}
