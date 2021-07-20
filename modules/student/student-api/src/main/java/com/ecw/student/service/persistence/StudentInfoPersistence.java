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

package com.ecw.student.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.ecw.student.exception.NoSuchStudentInfoException;
import com.ecw.student.model.StudentInfo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the student info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ecw.student.service.persistence.impl.StudentInfoPersistenceImpl
 * @see StudentInfoUtil
 * @generated
 */
@ProviderType
public interface StudentInfoPersistence extends BasePersistence<StudentInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentInfoUtil} to access the student info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the student info in the entity cache if it is enabled.
	*
	* @param studentInfo the student info
	*/
	public void cacheResult(StudentInfo studentInfo);

	/**
	* Caches the student infos in the entity cache if it is enabled.
	*
	* @param studentInfos the student infos
	*/
	public void cacheResult(java.util.List<StudentInfo> studentInfos);

	/**
	* Creates a new student info with the primary key. Does not add the student info to the database.
	*
	* @param Id the primary key for the new student info
	* @return the new student info
	*/
	public StudentInfo create(long Id);

	/**
	* Removes the student info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the student info
	* @return the student info that was removed
	* @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	*/
	public StudentInfo remove(long Id) throws NoSuchStudentInfoException;

	public StudentInfo updateImpl(StudentInfo studentInfo);

	/**
	* Returns the student info with the primary key or throws a {@link NoSuchStudentInfoException} if it could not be found.
	*
	* @param Id the primary key of the student info
	* @return the student info
	* @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	*/
	public StudentInfo findByPrimaryKey(long Id)
		throws NoSuchStudentInfoException;

	/**
	* Returns the student info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the student info
	* @return the student info, or <code>null</code> if a student info with the primary key could not be found
	*/
	public StudentInfo fetchByPrimaryKey(long Id);

	@Override
	public java.util.Map<java.io.Serializable, StudentInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the student infos.
	*
	* @return the student infos
	*/
	public java.util.List<StudentInfo> findAll();

	/**
	* Returns a range of all the student infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student infos
	* @param end the upper bound of the range of student infos (not inclusive)
	* @return the range of student infos
	*/
	public java.util.List<StudentInfo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the student infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student infos
	* @param end the upper bound of the range of student infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of student infos
	*/
	public java.util.List<StudentInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentInfo> orderByComparator);

	/**
	* Returns an ordered range of all the student infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student infos
	* @param end the upper bound of the range of student infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of student infos
	*/
	public java.util.List<StudentInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentInfo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the student infos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of student infos.
	*
	* @return the number of student infos
	*/
	public int countAll();
}