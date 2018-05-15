/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.seatecnologia.test.todolist.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ServiceContext;

import br.com.seatecnologia.test.todolist.TaskDescriptionException;
import br.com.seatecnologia.test.todolist.TaskDueDateException;
import br.com.seatecnologia.test.todolist.model.Task;
import br.com.seatecnologia.test.todolist.service.base.TaskLocalServiceBaseImpl;

/**
 * The implementation of the task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.com.seatecnologia.test.todolist.service.TaskLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see br.com.seatecnologia.test.todolist.service.base.TaskLocalServiceBaseImpl
 * @see br.com.seatecnologia.test.todolist.service.TaskLocalServiceUtil
 */
public class TaskLocalServiceImpl extends TaskLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link br.com.seatecnologia.test.todolist.service.TaskLocalServiceUtil} to access the task local service.
	 */
	
	public List<Task> getTasks(long groupId, long taskListId) throws SystemException {
		return taskPersistence.findByG_TL(groupId, taskListId);
	}
	
	public List<Task> getTasks(long groupId, long taskListId, int start, int end) throws SystemException {
		return taskPersistence.findByG_TL(groupId, taskListId, start, end);
	}
	
	public int getTasksCount(long groupId, long taskListId) throws SystemException {
		return taskPersistence.findByG_TL(groupId, taskListId).size();
	}

	public Task addTask(long userId, long taskListId, String description, Date dueDate, ServiceContext serviceContext) 
			throws PortalException, SystemException {
		
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		
		validate(description, dueDate);
		
		long taskId = counterLocalService.increment();
		Task task = taskPersistence.create(taskId);
		
		task.setUuid(serviceContext.getUuid());
		task.setUserId(userId);
		task.setGroupId(groupId);
		task.setCompanyId(user.getCompanyId());
		task.setUserName(user.getFullName());
		task.setCreateDate(serviceContext.getCreateDate(now));
		task.setModifiedDate(serviceContext.getModifiedDate(now));
		task.setExpandoBridgeAttributes(serviceContext);
		
		task.setTaskListId(taskListId);
		task.setDescription(description);
		task.setDueDate(dueDate);
		task.setDone(false);
		
		taskPersistence.update(task);
		
		resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
			       Task.class.getName(), taskId, false, true, true);
		
		return task;
	}
	
	public Task deleteTask(long taskId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		Task task = getTask(taskId);
		
		resourceLocalService.deleteResource(serviceContext.getCompanyId(), Task.class.getName(), 
				ResourceConstants.SCOPE_INDIVIDUAL, taskId);
		
		task = deleteTask(taskId);
		
		return task;
	}
	
	public Task updateTask(long userId, long taskListId, long taskId,
			String description, Date dueDate, Boolean done, ServiceContext serviceContext)
		throws PortalException, SystemException {
		
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		
		validate(description, dueDate);
		
		Task task = getTask(taskId);
		
		task.setUserId(userId);
		task.setUserName(user.getFullName());
		task.setDescription(description);
		task.setDueDate(dueDate);
		task.setDone(done);
		task.setModifiedDate(serviceContext.getModifiedDate(now));
		task.setExpandoBridgeAttributes(serviceContext);
		
		taskPersistence.update(task);
		
		resourceLocalService.updateResources(user.getCompanyId(), groupId, Task.class.getName(), taskId, 
				serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());
		
		return task;
	}
	
	@SuppressWarnings("deprecation")
	protected void validate(String description, Date dueDate) throws PortalException {
		if (Validator.isNull(description)) {
			throw new TaskDescriptionException();
		}
		
		if (Validator.isNotNull(dueDate)) {
			if (!Validator.isDate(dueDate.getMonth(), dueDate.getDay(), dueDate.getYear())) {
				// TODO: Validate date as future date?
				throw new TaskDueDateException();
			}
		}
	}
}