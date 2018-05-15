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

package br.com.seatecnologia.test.todolist.service.persistence;

import br.com.seatecnologia.test.todolist.model.TaskList;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the task list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see TaskListPersistenceImpl
 * @see TaskListUtil
 * @generated
 */
public interface TaskListPersistence extends BasePersistence<TaskList> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskListUtil} to access the task list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the task lists where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task lists where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @return the range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task lists where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task lists before and after the current task list in the ordered set where uuid = &#63;.
	*
	* @param taskListId the primary key of the current task list
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList[] findByUuid_PrevAndNext(
		long taskListId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the task lists where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task list where uuid = &#63; and groupId = &#63; or throws a {@link br.com.seatecnologia.test.todolist.NoSuchTaskListException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByUUID_G(
		java.lang.String uuid, long groupId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task list where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task list where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the task list where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task list that was removed
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task lists where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task lists where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @return the range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task lists where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task lists before and after the current task list in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param taskListId the primary key of the current task list
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList[] findByUuid_C_PrevAndNext(
		long taskListId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the task lists where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task lists where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task lists where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @return the range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task lists where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task list in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task list in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task list, or <code>null</code> if a matching task list could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task lists before and after the current task list in the ordered set where groupId = &#63;.
	*
	* @param taskListId the primary key of the current task list
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList[] findByGroupId_PrevAndNext(
		long taskListId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task lists that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching task lists that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task lists that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @return the range of matching task lists that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task lists that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task lists that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task lists before and after the current task list in the ordered set of task lists that the user has permission to view where groupId = &#63;.
	*
	* @param taskListId the primary key of the current task list
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList[] filterFindByGroupId_PrevAndNext(
		long taskListId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the task lists where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching task lists
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching task lists that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the task list in the entity cache if it is enabled.
	*
	* @param taskList the task list
	*/
	public void cacheResult(
		br.com.seatecnologia.test.todolist.model.TaskList taskList);

	/**
	* Caches the task lists in the entity cache if it is enabled.
	*
	* @param taskLists the task lists
	*/
	public void cacheResult(
		java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> taskLists);

	/**
	* Creates a new task list with the primary key. Does not add the task list to the database.
	*
	* @param taskListId the primary key for the new task list
	* @return the new task list
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList create(
		long taskListId);

	/**
	* Removes the task list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskListId the primary key of the task list
	* @return the task list that was removed
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList remove(
		long taskListId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	public br.com.seatecnologia.test.todolist.model.TaskList updateImpl(
		br.com.seatecnologia.test.todolist.model.TaskList taskList)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task list with the primary key or throws a {@link br.com.seatecnologia.test.todolist.NoSuchTaskListException} if it could not be found.
	*
	* @param taskListId the primary key of the task list
	* @return the task list
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskListException if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList findByPrimaryKey(
		long taskListId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskListException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskListId the primary key of the task list
	* @return the task list, or <code>null</code> if a task list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.TaskList fetchByPrimaryKey(
		long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task lists.
	*
	* @return the task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task lists
	* @param end the upper bound of the range of task lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of task lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.TaskList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the task lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task lists.
	*
	* @return the number of task lists
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}