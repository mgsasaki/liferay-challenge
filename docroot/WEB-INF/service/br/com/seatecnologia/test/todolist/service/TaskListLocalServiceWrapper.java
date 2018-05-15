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

package br.com.seatecnologia.test.todolist.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TaskListLocalService}.
 *
 * @author Marcello Gurgel Sasaki
 * @see TaskListLocalService
 * @generated
 */
public class TaskListLocalServiceWrapper implements TaskListLocalService,
	ServiceWrapper<TaskListLocalService> {
	public TaskListLocalServiceWrapper(
		TaskListLocalService taskListLocalService) {
		_taskListLocalService = taskListLocalService;
	}

	/**
	* Adds the task list to the database. Also notifies the appropriate model listeners.
	*
	* @param taskList the task list
	* @return the task list that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList addTaskList(
		br.com.seatecnologia.test.todolist.model.TaskList taskList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.addTaskList(taskList);
	}

	/**
	* Creates a new task list with the primary key. Does not add the task list to the database.
	*
	* @param taskListId the primary key for the new task list
	* @return the new task list
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList createTaskList(
		long taskListId) {
		return _taskListLocalService.createTaskList(taskListId);
	}

	/**
	* Deletes the task list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskListId the primary key of the task list
	* @return the task list that was removed
	* @throws PortalException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList deleteTaskList(
		long taskListId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.deleteTaskList(taskListId);
	}

	/**
	* Deletes the task list from the database. Also notifies the appropriate model listeners.
	*
	* @param taskList the task list
	* @return the task list that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList deleteTaskList(
		br.com.seatecnologia.test.todolist.model.TaskList taskList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.deleteTaskList(taskList);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taskListLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList fetchTaskList(
		long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.fetchTaskList(taskListId);
	}

	/**
	* Returns the task list with the matching UUID and company.
	*
	* @param uuid the task list's UUID
	* @param companyId the primary key of the company
	* @return the matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList fetchTaskListByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.fetchTaskListByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the task list matching the UUID and group.
	*
	* @param uuid the task list's UUID
	* @param groupId the primary key of the group
	* @return the matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList fetchTaskListByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.fetchTaskListByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the task list with the primary key.
	*
	* @param taskListId the primary key of the task list
	* @return the task list
	* @throws PortalException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList getTaskList(
		long taskListId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskList(taskListId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the task list with the matching UUID and company.
	*
	* @param uuid the task list's UUID
	* @param companyId the primary key of the company
	* @return the matching task list
	* @throws PortalException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList getTaskListByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskListByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the task list matching the UUID and group.
	*
	* @param uuid the task list's UUID
	* @param groupId the primary key of the group
	* @return the matching task list
	* @throws PortalException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList getTaskListByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskListByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the task lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @return the range of task lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> getTaskLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskLists(start, end);
	}

	/**
	* Returns the number of task lists.
	*
	* @return the number of task lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTaskListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskListsCount();
	}

	/**
	* Updates the task list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taskList the task list
	* @return the task list that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList updateTaskList(
		br.com.seatecnologia.test.todolist.model.TaskList taskList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.updateTaskList(taskList);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taskListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taskListLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taskListLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> getTaskLists(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskLists(groupId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> getTaskLists(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.getTaskLists(groupId, start, end);
	}

	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList addTaskList(
		long userId, java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskListLocalService.addTaskList(userId, name, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaskListLocalService getWrappedTaskListLocalService() {
		return _taskListLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaskListLocalService(
		TaskListLocalService taskListLocalService) {
		_taskListLocalService = taskListLocalService;
	}

	@Override
	public TaskListLocalService getWrappedService() {
		return _taskListLocalService;
	}

	@Override
	public void setWrappedService(TaskListLocalService taskListLocalService) {
		_taskListLocalService = taskListLocalService;
	}

	private TaskListLocalService _taskListLocalService;
}