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

package com.ecw.student.service.persistence.impl;

import com.ecw.student.model.Student;
import com.ecw.student.service.persistence.StudentPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentFinderBaseImpl extends BasePersistenceImpl<Student> {
	public StudentFinderBaseImpl() {
		setModelClass(Student.class);
	}

	/**
	 * Returns the student persistence.
	 *
	 * @return the student persistence
	 */
	public StudentPersistence getStudentPersistence() {
		return studentPersistence;
	}

	/**
	 * Sets the student persistence.
	 *
	 * @param studentPersistence the student persistence
	 */
	public void setStudentPersistence(StudentPersistence studentPersistence) {
		this.studentPersistence = studentPersistence;
	}

	@BeanReference(type = StudentPersistence.class)
	protected StudentPersistence studentPersistence;
}