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

package br.com.seatecnologia.test.todolist.service.base;

import br.com.seatecnologia.test.todolist.model.TaskList;
import br.com.seatecnologia.test.todolist.service.TaskListService;
import br.com.seatecnologia.test.todolist.service.persistence.TaskListPersistence;
import br.com.seatecnologia.test.todolist.service.persistence.TaskPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the task list remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.seatecnologia.test.todolist.service.impl.TaskListServiceImpl}.
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see br.com.seatecnologia.test.todolist.service.impl.TaskListServiceImpl
 * @see br.com.seatecnologia.test.todolist.service.TaskListServiceUtil
 * @generated
 */
public abstract class TaskListServiceBaseImpl extends BaseServiceImpl
	implements TaskListService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link br.com.seatecnologia.test.todolist.service.TaskListServiceUtil} to access the task list remote service.
	 */

	/**
	 * Returns the task local service.
	 *
	 * @return the task local service
	 */
	public br.com.seatecnologia.test.todolist.service.TaskLocalService getTaskLocalService() {
		return taskLocalService;
	}

	/**
	 * Sets the task local service.
	 *
	 * @param taskLocalService the task local service
	 */
	public void setTaskLocalService(
		br.com.seatecnologia.test.todolist.service.TaskLocalService taskLocalService) {
		this.taskLocalService = taskLocalService;
	}

	/**
	 * Returns the task remote service.
	 *
	 * @return the task remote service
	 */
	public br.com.seatecnologia.test.todolist.service.TaskService getTaskService() {
		return taskService;
	}

	/**
	 * Sets the task remote service.
	 *
	 * @param taskService the task remote service
	 */
	public void setTaskService(
		br.com.seatecnologia.test.todolist.service.TaskService taskService) {
		this.taskService = taskService;
	}

	/**
	 * Returns the task persistence.
	 *
	 * @return the task persistence
	 */
	public TaskPersistence getTaskPersistence() {
		return taskPersistence;
	}

	/**
	 * Sets the task persistence.
	 *
	 * @param taskPersistence the task persistence
	 */
	public void setTaskPersistence(TaskPersistence taskPersistence) {
		this.taskPersistence = taskPersistence;
	}

	/**
	 * Returns the task list local service.
	 *
	 * @return the task list local service
	 */
	public br.com.seatecnologia.test.todolist.service.TaskListLocalService getTaskListLocalService() {
		return taskListLocalService;
	}

	/**
	 * Sets the task list local service.
	 *
	 * @param taskListLocalService the task list local service
	 */
	public void setTaskListLocalService(
		br.com.seatecnologia.test.todolist.service.TaskListLocalService taskListLocalService) {
		this.taskListLocalService = taskListLocalService;
	}

	/**
	 * Returns the task list remote service.
	 *
	 * @return the task list remote service
	 */
	public br.com.seatecnologia.test.todolist.service.TaskListService getTaskListService() {
		return taskListService;
	}

	/**
	 * Sets the task list remote service.
	 *
	 * @param taskListService the task list remote service
	 */
	public void setTaskListService(
		br.com.seatecnologia.test.todolist.service.TaskListService taskListService) {
		this.taskListService = taskListService;
	}

	/**
	 * Returns the task list persistence.
	 *
	 * @return the task list persistence
	 */
	public TaskListPersistence getTaskListPersistence() {
		return taskListPersistence;
	}

	/**
	 * Sets the task list persistence.
	 *
	 * @param taskListPersistence the task list persistence
	 */
	public void setTaskListPersistence(TaskListPersistence taskListPersistence) {
		this.taskListPersistence = taskListPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return TaskList.class;
	}

	protected String getModelClassName() {
		return TaskList.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = taskListPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = br.com.seatecnologia.test.todolist.service.TaskLocalService.class)
	protected br.com.seatecnologia.test.todolist.service.TaskLocalService taskLocalService;
	@BeanReference(type = br.com.seatecnologia.test.todolist.service.TaskService.class)
	protected br.com.seatecnologia.test.todolist.service.TaskService taskService;
	@BeanReference(type = TaskPersistence.class)
	protected TaskPersistence taskPersistence;
	@BeanReference(type = br.com.seatecnologia.test.todolist.service.TaskListLocalService.class)
	protected br.com.seatecnologia.test.todolist.service.TaskListLocalService taskListLocalService;
	@BeanReference(type = br.com.seatecnologia.test.todolist.service.TaskListService.class)
	protected br.com.seatecnologia.test.todolist.service.TaskListService taskListService;
	@BeanReference(type = TaskListPersistence.class)
	protected TaskListPersistence taskListPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private TaskListServiceClpInvoker _clpInvoker = new TaskListServiceClpInvoker();
}