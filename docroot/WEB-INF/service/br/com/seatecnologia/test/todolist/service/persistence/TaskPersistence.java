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

import br.com.seatecnologia.test.todolist.model.Task;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the task service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marcello Gurgel Sasaki
 * @see TaskPersistenceImpl
 * @see TaskUtil
 * @generated
 */
public interface TaskPersistence extends BasePersistence<Task> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskUtil} to access the task persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tasks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tasks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tasks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tasks before and after the current task in the ordered set where uuid = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task[] findByUuid_PrevAndNext(
		long taskId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tasks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or throws a {@link br.com.seatecnologia.test.todolist.NoSuchTaskException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByUUID_G(
		java.lang.String uuid, long groupId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the task where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task that was removed
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tasks before and after the current task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task[] findByUuid_C_PrevAndNext(
		long taskId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tasks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tasks where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @return the matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByG_TL(
		long groupId, long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tasks where groupId = &#63; and taskListId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByG_TL(
		long groupId, long taskListId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tasks where groupId = &#63; and taskListId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findByG_TL(
		long groupId, long taskListId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByG_TL_First(
		long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task in the ordered set where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByG_TL_First(
		long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByG_TL_Last(
		long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task in the ordered set where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByG_TL_Last(
		long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tasks before and after the current task in the ordered set where groupId = &#63; and taskListId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task[] findByG_TL_PrevAndNext(
		long taskId, long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tasks that the user has permission to view where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @return the matching tasks that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> filterFindByG_TL(
		long groupId, long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tasks that the user has permission to view where groupId = &#63; and taskListId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> filterFindByG_TL(
		long groupId, long taskListId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tasks that the user has permissions to view where groupId = &#63; and taskListId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> filterFindByG_TL(
		long groupId, long taskListId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tasks before and after the current task in the ordered set of tasks that the user has permission to view where groupId = &#63; and taskListId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task[] filterFindByG_TL_PrevAndNext(
		long taskId, long groupId, long taskListId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tasks where groupId = &#63; and taskListId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_TL(long groupId, long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_TL(long groupId, long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks that the user has permission to view where groupId = &#63; and taskListId = &#63;.
	*
	* @param groupId the group ID
	* @param taskListId the task list ID
	* @return the number of matching tasks that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_TL(long groupId, long taskListId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the task in the entity cache if it is enabled.
	*
	* @param task the task
	*/
	public void cacheResult(br.com.seatecnologia.test.todolist.model.Task task);

	/**
	* Caches the tasks in the entity cache if it is enabled.
	*
	* @param tasks the tasks
	*/
	public void cacheResult(
		java.util.List<br.com.seatecnologia.test.todolist.model.Task> tasks);

	/**
	* Creates a new task with the primary key. Does not add the task to the database.
	*
	* @param taskId the primary key for the new task
	* @return the new task
	*/
	public br.com.seatecnologia.test.todolist.model.Task create(long taskId);

	/**
	* Removes the task with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the task
	* @return the task that was removed
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task remove(long taskId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	public br.com.seatecnologia.test.todolist.model.Task updateImpl(
		br.com.seatecnologia.test.todolist.model.Task task)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task with the primary key or throws a {@link br.com.seatecnologia.test.todolist.NoSuchTaskException} if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task
	* @throws br.com.seatecnologia.test.todolist.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task findByPrimaryKey(
		long taskId)
		throws br.com.seatecnologia.test.todolist.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task, or <code>null</code> if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.test.todolist.model.Task fetchByPrimaryKey(
		long taskId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tasks.
	*
	* @return the tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.test.todolist.model.impl.TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tasks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.test.todolist.model.Task> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tasks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tasks.
	*
	* @return the number of tasks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}