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

package br.com.seatecnologia.test.todolist.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TaskList}.
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see TaskList
 * @generated
 */
public class TaskListWrapper implements TaskList, ModelWrapper<TaskList> {
	public TaskListWrapper(TaskList taskList) {
		_taskList = taskList;
	}

	@Override
	public Class<?> getModelClass() {
		return TaskList.class;
	}

	@Override
	public String getModelClassName() {
		return TaskList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("taskListId", getTaskListId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long taskListId = (Long)attributes.get("taskListId");

		if (taskListId != null) {
			setTaskListId(taskListId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this task list.
	*
	* @return the primary key of this task list
	*/
	@Override
	public long getPrimaryKey() {
		return _taskList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this task list.
	*
	* @param primaryKey the primary key of this task list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_taskList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this task list.
	*
	* @return the uuid of this task list
	*/
	@Override
	public java.lang.String getUuid() {
		return _taskList.getUuid();
	}

	/**
	* Sets the uuid of this task list.
	*
	* @param uuid the uuid of this task list
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_taskList.setUuid(uuid);
	}

	/**
	* Returns the task list ID of this task list.
	*
	* @return the task list ID of this task list
	*/
	@Override
	public long getTaskListId() {
		return _taskList.getTaskListId();
	}

	/**
	* Sets the task list ID of this task list.
	*
	* @param taskListId the task list ID of this task list
	*/
	@Override
	public void setTaskListId(long taskListId) {
		_taskList.setTaskListId(taskListId);
	}

	/**
	* Returns the group ID of this task list.
	*
	* @return the group ID of this task list
	*/
	@Override
	public long getGroupId() {
		return _taskList.getGroupId();
	}

	/**
	* Sets the group ID of this task list.
	*
	* @param groupId the group ID of this task list
	*/
	@Override
	public void setGroupId(long groupId) {
		_taskList.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this task list.
	*
	* @return the company ID of this task list
	*/
	@Override
	public long getCompanyId() {
		return _taskList.getCompanyId();
	}

	/**
	* Sets the company ID of this task list.
	*
	* @param companyId the company ID of this task list
	*/
	@Override
	public void setCompanyId(long companyId) {
		_taskList.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this task list.
	*
	* @return the user ID of this task list
	*/
	@Override
	public long getUserId() {
		return _taskList.getUserId();
	}

	/**
	* Sets the user ID of this task list.
	*
	* @param userId the user ID of this task list
	*/
	@Override
	public void setUserId(long userId) {
		_taskList.setUserId(userId);
	}

	/**
	* Returns the user uuid of this task list.
	*
	* @return the user uuid of this task list
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskList.getUserUuid();
	}

	/**
	* Sets the user uuid of this task list.
	*
	* @param userUuid the user uuid of this task list
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_taskList.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this task list.
	*
	* @return the user name of this task list
	*/
	@Override
	public java.lang.String getUserName() {
		return _taskList.getUserName();
	}

	/**
	* Sets the user name of this task list.
	*
	* @param userName the user name of this task list
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_taskList.setUserName(userName);
	}

	/**
	* Returns the create date of this task list.
	*
	* @return the create date of this task list
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _taskList.getCreateDate();
	}

	/**
	* Sets the create date of this task list.
	*
	* @param createDate the create date of this task list
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_taskList.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this task list.
	*
	* @return the modified date of this task list
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _taskList.getModifiedDate();
	}

	/**
	* Sets the modified date of this task list.
	*
	* @param modifiedDate the modified date of this task list
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_taskList.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this task list.
	*
	* @return the name of this task list
	*/
	@Override
	public java.lang.String getName() {
		return _taskList.getName();
	}

	/**
	* Sets the name of this task list.
	*
	* @param name the name of this task list
	*/
	@Override
	public void setName(java.lang.String name) {
		_taskList.setName(name);
	}

	@Override
	public boolean isNew() {
		return _taskList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_taskList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _taskList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_taskList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _taskList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _taskList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_taskList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _taskList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_taskList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_taskList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_taskList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaskListWrapper((TaskList)_taskList.clone());
	}

	@Override
	public int compareTo(
		br.com.seatecnologia.test.todolist.model.TaskList taskList) {
		return _taskList.compareTo(taskList);
	}

	@Override
	public int hashCode() {
		return _taskList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<br.com.seatecnologia.test.todolist.model.TaskList> toCacheModel() {
		return _taskList.toCacheModel();
	}

	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList toEscapedModel() {
		return new TaskListWrapper(_taskList.toEscapedModel());
	}

	@Override
	public br.com.seatecnologia.test.todolist.model.TaskList toUnescapedModel() {
		return new TaskListWrapper(_taskList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _taskList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _taskList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_taskList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskListWrapper)) {
			return false;
		}

		TaskListWrapper taskListWrapper = (TaskListWrapper)obj;

		if (Validator.equals(_taskList, taskListWrapper._taskList)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _taskList.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TaskList getWrappedTaskList() {
		return _taskList;
	}

	@Override
	public TaskList getWrappedModel() {
		return _taskList;
	}

	@Override
	public void resetOriginalValues() {
		_taskList.resetOriginalValues();
	}

	private TaskList _taskList;
}