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
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import br.com.seatecnologia.test.todolist.TaskListNameException;
import br.com.seatecnologia.test.todolist.model.TaskList;
import br.com.seatecnologia.test.todolist.service.base.TaskListLocalServiceBaseImpl;

/**
 * The implementation of the task list local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.com.seatecnologia.test.todolist.service.TaskListLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see br.com.seatecnologia.test.todolist.service.base.TaskListLocalServiceBaseImpl
 * @see br.com.seatecnologia.test.todolist.service.TaskListLocalServiceUtil
 */
public class TaskListLocalServiceImpl extends TaskListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link br.com.seatecnologia.test.todolist.service.TaskListLocalServiceUtil} to access the task list local service.
	 */
	
	public List<TaskList> getTaskLists(long groupId) throws SystemException {
		return taskListPersistence.findByGroupId(groupId);
	}
	
	public List<TaskList> getTaskLists(long groupId, int start, int end) throws SystemException {
		return taskListPersistence.findByGroupId(groupId, start, end);
	}
	
	public TaskList addTaskList(long userId, String name, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		
		validate(name);
		
		long taskListId = counterLocalService.increment();
		
		TaskList taskList = taskListPersistence.create(taskListId);
		
		taskList.setUuid(serviceContext.getUuid());
		taskList.setUserId(userId);
		taskList.setGroupId(groupId);
		taskList.setCompanyId(user.getCompanyId());
		taskList.setUserName(user.getFullName());
		taskList.setCreateDate(serviceContext.getCreateDate(now));
		taskList.setModifiedDate(serviceContext.getModifiedDate(now));
		taskList.setName(name);
		taskList.setExpandoBridgeAttributes(serviceContext);
		
		taskListPersistence.update(taskList);
		
		resourceLocalService.addResources(user.getCompanyId(), groupId, userId, 
				TaskList.class.getName(), taskListId, false, true, true);
		
		return taskList;
	}
	
	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new TaskListNameException();
		}
	}
}