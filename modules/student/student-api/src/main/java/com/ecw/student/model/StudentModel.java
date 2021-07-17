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

package com.ecw.student.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Student service. Represents a row in the &quot;Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ecw.student.model.impl.StudentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ecw.student.model.impl.StudentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @see com.ecw.student.model.impl.StudentImpl
 * @see com.ecw.student.model.impl.StudentModelImpl
 * @generated
 */
@ProviderType
public interface StudentModel extends BaseModel<Student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
	 */

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this student.
	 *
	 * @return the ID of this student
	 */
	public long getId();

	/**
	 * Sets the ID of this student.
	 *
	 * @param Id the ID of this student
	 */
	public void setId(long Id);

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this student.
	 *
	 * @param Name the name of this student
	 */
	public void setName(String Name);

	/**
	 * Returns the address of this student.
	 *
	 * @return the address of this student
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this student.
	 *
	 * @param Address the address of this student
	 */
	public void setAddress(String Address);

	/**
	 * Returns the std of this student.
	 *
	 * @return the std of this student
	 */
	public int getStd();

	/**
	 * Sets the std of this student.
	 *
	 * @param Std the std of this student
	 */
	public void setStd(int Std);

	/**
	 * Returns the divison of this student.
	 *
	 * @return the divison of this student
	 */
	@AutoEscape
	public String getDivison();

	/**
	 * Sets the divison of this student.
	 *
	 * @param Divison the divison of this student
	 */
	public void setDivison(String Divison);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Student student);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Student> toCacheModel();

	@Override
	public Student toEscapedModel();

	@Override
	public Student toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}