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
 * This class is a wrapper for {@link StudentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfo
 * @generated
 */
@ProviderType
public class StudentInfoWrapper implements StudentInfo,
	ModelWrapper<StudentInfo> {
	public StudentInfoWrapper(StudentInfo studentInfo) {
		_studentInfo = studentInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return StudentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return StudentInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("StudentId", getStudentId());
		attributes.put("FirstName", getFirstName());
		attributes.put("LastName", getLastName());
		attributes.put("BloodGroup", getBloodGroup());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long StudentId = (Long)attributes.get("StudentId");

		if (StudentId != null) {
			setStudentId(StudentId);
		}

		String FirstName = (String)attributes.get("FirstName");

		if (FirstName != null) {
			setFirstName(FirstName);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String BloodGroup = (String)attributes.get("BloodGroup");

		if (BloodGroup != null) {
			setBloodGroup(BloodGroup);
		}
	}

	@Override
	public Object clone() {
		return new StudentInfoWrapper((StudentInfo)_studentInfo.clone());
	}

	@Override
	public int compareTo(StudentInfo studentInfo) {
		return _studentInfo.compareTo(studentInfo);
	}

	/**
	* Returns the blood group of this student info.
	*
	* @return the blood group of this student info
	*/
	@Override
	public String getBloodGroup() {
		return _studentInfo.getBloodGroup();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _studentInfo.getExpandoBridge();
	}

	/**
	* Returns the first name of this student info.
	*
	* @return the first name of this student info
	*/
	@Override
	public String getFirstName() {
		return _studentInfo.getFirstName();
	}

	/**
	* Returns the ID of this student info.
	*
	* @return the ID of this student info
	*/
	@Override
	public long getId() {
		return _studentInfo.getId();
	}

	/**
	* Returns the last name of this student info.
	*
	* @return the last name of this student info
	*/
	@Override
	public String getLastName() {
		return _studentInfo.getLastName();
	}

	/**
	* Returns the primary key of this student info.
	*
	* @return the primary key of this student info
	*/
	@Override
	public long getPrimaryKey() {
		return _studentInfo.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _studentInfo.getPrimaryKeyObj();
	}

	/**
	* Returns the student ID of this student info.
	*
	* @return the student ID of this student info
	*/
	@Override
	public long getStudentId() {
		return _studentInfo.getStudentId();
	}

	@Override
	public int hashCode() {
		return _studentInfo.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _studentInfo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _studentInfo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _studentInfo.isNew();
	}

	@Override
	public void persist() {
		_studentInfo.persist();
	}

	/**
	* Sets the blood group of this student info.
	*
	* @param BloodGroup the blood group of this student info
	*/
	@Override
	public void setBloodGroup(String BloodGroup) {
		_studentInfo.setBloodGroup(BloodGroup);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_studentInfo.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_studentInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_studentInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_studentInfo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this student info.
	*
	* @param FirstName the first name of this student info
	*/
	@Override
	public void setFirstName(String FirstName) {
		_studentInfo.setFirstName(FirstName);
	}

	/**
	* Sets the ID of this student info.
	*
	* @param Id the ID of this student info
	*/
	@Override
	public void setId(long Id) {
		_studentInfo.setId(Id);
	}

	/**
	* Sets the last name of this student info.
	*
	* @param LastName the last name of this student info
	*/
	@Override
	public void setLastName(String LastName) {
		_studentInfo.setLastName(LastName);
	}

	@Override
	public void setNew(boolean n) {
		_studentInfo.setNew(n);
	}

	/**
	* Sets the primary key of this student info.
	*
	* @param primaryKey the primary key of this student info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_studentInfo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_studentInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the student ID of this student info.
	*
	* @param StudentId the student ID of this student info
	*/
	@Override
	public void setStudentId(long StudentId) {
		_studentInfo.setStudentId(StudentId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<StudentInfo> toCacheModel() {
		return _studentInfo.toCacheModel();
	}

	@Override
	public StudentInfo toEscapedModel() {
		return new StudentInfoWrapper(_studentInfo.toEscapedModel());
	}

	@Override
	public String toString() {
		return _studentInfo.toString();
	}

	@Override
	public StudentInfo toUnescapedModel() {
		return new StudentInfoWrapper(_studentInfo.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _studentInfo.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentInfoWrapper)) {
			return false;
		}

		StudentInfoWrapper studentInfoWrapper = (StudentInfoWrapper)obj;

		if (Objects.equals(_studentInfo, studentInfoWrapper._studentInfo)) {
			return true;
		}

		return false;
	}

	@Override
	public StudentInfo getWrappedModel() {
		return _studentInfo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _studentInfo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _studentInfo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_studentInfo.resetOriginalValues();
	}

	private final StudentInfo _studentInfo;
}