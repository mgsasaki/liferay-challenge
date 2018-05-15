package br.com.seatecnologia.test.todolist.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

import br.com.seatecnologia.test.todolist.model.TaskList;
import br.com.seatecnologia.test.todolist.service.TaskListLocalServiceUtil;

public class TaskListPermission {
	public static void check(PermissionChecker permissionChecker,
            long taskListId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, taskListId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long taskListId, String actionId) throws PortalException,
            SystemException {

        TaskList taskList = TaskListLocalServiceUtil
                .getTaskList(taskListId);

        return permissionChecker
                .hasPermission(taskList.getGroupId(),
                        TaskList.class.getName(), taskList.getTaskListId(),
                        actionId);
    }
}
