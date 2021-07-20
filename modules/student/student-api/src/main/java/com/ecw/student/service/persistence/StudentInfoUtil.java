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

import com.ecw.student.model.StudentInfo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the student info service. This utility wraps {@link com.ecw.student.service.persistence.impl.StudentInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfoPersistence
 * @see com.ecw.student.service.persistence.impl.StudentInfoPersistenceImpl
 * @generated
 */
@ProviderType
public class StudentInfoUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StudentInfo studentInfo) {
		getPersistence().clearCache(studentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StudentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StudentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StudentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StudentInfo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StudentInfo update(StudentInfo studentInfo) {
		return getPersistence().update(studentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StudentInfo update(StudentInfo studentInfo,
		ServiceContext serviceContext) {
		return getPersistence().update(studentInfo, serviceContext);
	}

	/**
	* Caches the student info in the entity cache if it is enabled.
	*
	* @param studentInfo the student info
	*/
	public static void cacheResult(StudentInfo studentInfo) {
		getPersistence().cacheResult(studentInfo);
	}

	/**
	* Caches the student infos in the entity cache if it is enabled.
	*
	* @param studentInfos the student infos
	*/
	public static void cacheResult(List<StudentInfo> studentInfos) {
		getPersistence().cacheResult(studentInfos);
	}

	/**
	* Creates a new student info with the primary key. Does not add the student info to the database.
	*
	* @param Id the primary key for the new student info
	* @return the new student info
	*/
	public static StudentInfo create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the student info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the student info
	* @return the student info that was removed
	* @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	*/
	public static StudentInfo remove(long Id)
		throws com.ecw.student.exception.NoSuchStudentInfoException {
		return getPersistence().remove(Id);
	}

	public static StudentInfo updateImpl(StudentInfo studentInfo) {
		return getPersistence().updateImpl(studentInfo);
	}

	/**
	* Returns the student info with the primary key or throws a {@link NoSuchStudentInfoException} if it could not be found.
	*
	* @param Id the primary key of the student info
	* @return the student info
	* @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	*/
	public static StudentInfo findByPrimaryKey(long Id)
		throws com.ecw.student.exception.NoSuchStudentInfoException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the student info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the student info
	* @return the student info, or <code>null</code> if a student info with the primary key could not be found
	*/
	public static StudentInfo fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, StudentInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the student infos.
	*
	* @return the student infos
	*/
	public static List<StudentInfo> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<StudentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<StudentInfo> findAll(int start, int end,
		OrderByComparator<StudentInfo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<StudentInfo> findAll(int start, int end,
		OrderByComparator<StudentInfo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the student infos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of student infos.
	*
	* @return the number of student infos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StudentInfoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StudentInfoPersistence, StudentInfoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StudentInfoPersistence.class);

		ServiceTracker<StudentInfoPersistence, StudentInfoPersistence> serviceTracker =
			new ServiceTracker<StudentInfoPersistence, StudentInfoPersistence>(bundle.getBundleContext(),
				StudentInfoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}