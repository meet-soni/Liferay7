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

import com.ecw.student.model.Student;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentCacheModel)) {
			return false;
		}

		StudentCacheModel studentCacheModel = (StudentCacheModel)obj;

		if (Id == studentCacheModel.Id) {
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
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Address=");
		sb.append(Address);
		sb.append(", Std=");
		sb.append(Std);
		sb.append(", Divison=");
		sb.append(Divison);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setId(Id);

		if (Name == null) {
			studentImpl.setName("");
		}
		else {
			studentImpl.setName(Name);
		}

		if (Address == null) {
			studentImpl.setAddress("");
		}
		else {
			studentImpl.setAddress(Address);
		}

		studentImpl.setStd(Std);

		if (Divison == null) {
			studentImpl.setDivison("");
		}
		else {
			studentImpl.setDivison(Divison);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Name = objectInput.readUTF();
		Address = objectInput.readUTF();

		Std = objectInput.readInt();
		Divison = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Name);
		}

		if (Address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Address);
		}

		objectOutput.writeInt(Std);

		if (Divison == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Divison);
		}
	}

	public long Id;
	public String Name;
	public String Address;
	public int Std;
	public String Divison;
}