package br.com.seatecnologia.test.todolist.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

import br.com.seatecnologia.test.todolist.model.Task;
import br.com.seatecnologia.test.todolist.service.TaskLocalServiceUtil;

public class TaskPermission {
	public static void check(PermissionChecker permissionChecker,
            long taskId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, taskId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long taskId, String actionId) throws PortalException,
            SystemException {

        Task task = TaskLocalServiceUtil
                .getTask(taskId);

        return permissionChecker
                .hasPermission(task.getGroupId(),
                        Task.class.getName(), task.getTaskId(),
                        actionId);
    }
}
