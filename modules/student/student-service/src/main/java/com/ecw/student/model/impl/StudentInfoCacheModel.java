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

package com.ecw.student.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.ecw.student.model.StudentInfo;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing StudentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfo
 * @generated
 */
@ProviderType
public class StudentInfoCacheModel implements CacheModel<StudentInfo>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentInfoCacheModel)) {
			return false;
		}

		StudentInfoCacheModel studentInfoCacheModel = (StudentInfoCacheModel)obj;

		if (Id == studentInfoCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", StudentId=");
		sb.append(StudentId);
		sb.append(", FirstName=");
		sb.append(FirstName);
		sb.append(", LastName=");
		sb.append(LastName);
		sb.append(", BloodGroup=");
		sb.append(BloodGroup);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StudentInfo toEntityModel() {
		StudentInfoImpl studentInfoImpl = new StudentInfoImpl();

		studentInfoImpl.setId(Id);
		studentInfoImpl.setStudentId(StudentId);

		if (FirstName == null) {
			studentInfoImpl.setFirstName("");
		}
		else {
			studentInfoImpl.setFirstName(FirstName);
		}

		if (LastName == null) {
			studentInfoImpl.setLastName("");
		}
		else {
			studentInfoImpl.setLastName(LastName);
		}

		if (BloodGroup == null) {
			studentInfoImpl.setBloodGroup("");
		}
		else {
			studentInfoImpl.setBloodGroup(BloodGroup);
		}

		studentInfoImpl.resetOriginalValues();

		return studentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();

		StudentId = objectInput.readLong();
		FirstName = objectInput.readUTF();
		LastName = objectInput.readUTF();
		BloodGroup = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		objectOutput.writeLong(StudentId);

		if (FirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(FirstName);
		}

		if (LastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LastName);
		}

		if (BloodGroup == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BloodGroup);
		}
	}

	public long Id;
	public long StudentId;
	public String FirstName;
	public String LastName;
	public String BloodGroup;
}