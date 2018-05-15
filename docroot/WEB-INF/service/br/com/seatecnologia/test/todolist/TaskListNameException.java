/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package br.com.seatecnologia.test.todolist;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Marcello Gurgel Sasaki
 */
public class TaskListNameException extends PortalException {

	public TaskListNameException() {
		super();
	}

	public TaskListNameException(String msg) {
		super(msg);
	}

	public TaskListNameException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public TaskListNameException(Throwable cause) {
		super(cause);
	}

}