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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ecw.student.service.http.StudentInfoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.ecw.student.service.http.StudentInfoServiceSoap
 * @generated
 */
@ProviderType
public class StudentInfoSoap implements Serializable {
	public static StudentInfoSoap toSoapModel(StudentInfo model) {
		StudentInfoSoap soapModel = new StudentInfoSoap();

		soapModel.setId(model.getId());
		soapModel.setStudentId(model.getStudentId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setBloodGroup(model.getBloodGroup());

		return soapModel;
	}

	public static StudentInfoSoap[] toSoapModels(StudentInfo[] models) {
		StudentInfoSoap[] soapModels = new StudentInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentInfoSoap[][] toSoapModels(StudentInfo[][] models) {
		StudentInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentInfoSoap[] toSoapModels(List<StudentInfo> models) {
		List<StudentInfoSoap> soapModels = new ArrayList<StudentInfoSoap>(models.size());

		for (StudentInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentInfoSoap[soapModels.size()]);
	}

	public StudentInfoSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public long getStudentId() {
		return _StudentId;
	}

	public void setStudentId(long StudentId) {
		_StudentId = StudentId;
	}

	public String getFirstName() {
		return _FirstName;
	}

	public void setFirstName(String FirstName) {
		_FirstName = FirstName;
	}

	public String getLastName() {
		return _LastName;
	}

	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	public String getBloodGroup() {
		return _BloodGroup;
	}

	public void setBloodGroup(String BloodGroup) {
		_BloodGroup = BloodGroup;
	}

	private long _Id;
	private long _StudentId;
	private String _FirstName;
	private String _LastName;
	private String _BloodGroup;
}