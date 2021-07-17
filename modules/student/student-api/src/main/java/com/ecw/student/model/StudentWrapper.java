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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("Address", getAddress());
		attributes.put("Std", getStd());
		attributes.put("Divison", getDivison());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Address = (String)attributes.get("Address");

		if (Address != null) {
			setAddress(Address);
		}

		Integer Std = (Integer)attributes.get("Std");

		if (Std != null) {
			setStd(Std);
		}

		String Divison = (String)attributes.get("Divison");

		if (Divison != null) {
			setDivison(Divison);
		}
	}

	@Override
	public Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	@Override
	public int compareTo(Student student) {
		return _student.compareTo(student);
	}

	/**
	* Returns the address of this student.
	*
	* @return the address of this student
	*/
	@Override
	public String getAddress() {
		return _student.getAddress();
	}

	/**
	* Returns the divison of this student.
	*
	* @return the divison of this student
	*/
	@Override
	public String getDivison() {
		return _student.getDivison();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	/**
	* Returns the ID of this student.
	*
	* @return the ID of this student
	*/
	@Override
	public long getId() {
		return _student.getId();
	}

	/**
	* Returns the name of this student.
	*
	* @return the name of this student
	*/
	@Override
	public String getName() {
		return _student.getName();
	}

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	/**
	* Returns the std of this student.
	*
	* @return the std of this student
	*/
	@Override
	public int getStd() {
		return _student.getStd();
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public void persist() {
		_student.persist();
	}

	/**
	* Sets the address of this student.
	*
	* @param Address the address of this student
	*/
	@Override
	public void setAddress(String Address) {
		_student.setAddress(Address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	/**
	* Sets the divison of this student.
	*
	* @param Divison the divison of this student
	*/
	@Override
	public void setDivison(String Divison) {
		_student.setDivison(Divison);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this student.
	*
	* @param Id the ID of this student
	*/
	@Override
	public void setId(long Id) {
		_student.setId(Id);
	}

	/**
	* Sets the name of this student.
	*
	* @param Name the name of this student
	*/
	@Override
	public void setName(String Name) {
		_student.setName(Name);
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the std of this student.
	*
	* @param Std the std of this student
	*/
	@Override
	public void setStd(int Std) {
		_student.setStd(Std);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public String toString() {
		return _student.toString();
	}

	@Override
	public Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _student.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Objects.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _student.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _student.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private final Student _student;
}