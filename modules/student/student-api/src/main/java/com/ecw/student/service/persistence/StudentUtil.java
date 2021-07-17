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

import com.ecw.student.model.Student;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the student service. This utility wraps {@link com.ecw.student.service.persistence.impl.StudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentPersistence
 * @see com.ecw.student.service.persistence.impl.StudentPersistenceImpl
 * @generated
 */
@ProviderType
public class StudentUtil {
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
	public static void clearCache(Student student) {
		getPersistence().clearCache(student);
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
	public static List<Student> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Student> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Student update(Student student) {
		return getPersistence().update(student);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Student update(Student student, ServiceContext serviceContext) {
		return getPersistence().update(student, serviceContext);
	}

	/**
	* Returns all the students where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @return the matching students
	*/
	public static List<Student> findByStdAndDiv(int Std, String Divison) {
		return getPersistence().findByStdAndDiv(Std, Divison);
	}

	/**
	* Returns a range of all the students where Std = &#63; and Divison = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Std the std
	* @param Divison the divison
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	*/
	public static List<Student> findByStdAndDiv(int Std, String Divison,
		int start, int end) {
		return getPersistence().findByStdAndDiv(Std, Divison, start, end);
	}

	/**
	* Returns an ordered range of all the students where Std = &#63; and Divison = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Std the std
	* @param Divison the divison
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	*/
	public static List<Student> findByStdAndDiv(int Std, String Divison,
		int start, int end, OrderByComparator<Student> orderByComparator) {
		return getPersistence()
				   .findByStdAndDiv(Std, Divison, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the students where Std = &#63; and Divison = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Std the std
	* @param Divison the divison
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching students
	*/
	public static List<Student> findByStdAndDiv(int Std, String Divison,
		int start, int end, OrderByComparator<Student> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStdAndDiv(Std, Divison, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first student in the ordered set where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws NoSuchStudentException if a matching student could not be found
	*/
	public static Student findByStdAndDiv_First(int Std, String Divison,
		OrderByComparator<Student> orderByComparator)
		throws com.ecw.student.exception.NoSuchStudentException {
		return getPersistence()
				   .findByStdAndDiv_First(Std, Divison, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	*/
	public static Student fetchByStdAndDiv_First(int Std, String Divison,
		OrderByComparator<Student> orderByComparator) {
		return getPersistence()
				   .fetchByStdAndDiv_First(Std, Divison, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws NoSuchStudentException if a matching student could not be found
	*/
	public static Student findByStdAndDiv_Last(int Std, String Divison,
		OrderByComparator<Student> orderByComparator)
		throws com.ecw.student.exception.NoSuchStudentException {
		return getPersistence()
				   .findByStdAndDiv_Last(Std, Divison, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	*/
	public static Student fetchByStdAndDiv_Last(int Std, String Divison,
		OrderByComparator<Student> orderByComparator) {
		return getPersistence()
				   .fetchByStdAndDiv_Last(Std, Divison, orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where Std = &#63; and Divison = &#63;.
	*
	* @param Id the primary key of the current student
	* @param Std the std
	* @param Divison the divison
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws NoSuchStudentException if a student with the primary key could not be found
	*/
	public static Student[] findByStdAndDiv_PrevAndNext(long Id, int Std,
		String Divison, OrderByComparator<Student> orderByComparator)
		throws com.ecw.student.exception.NoSuchStudentException {
		return getPersistence()
				   .findByStdAndDiv_PrevAndNext(Id, Std, Divison,
			orderByComparator);
	}

	/**
	* Removes all the students where Std = &#63; and Divison = &#63; from the database.
	*
	* @param Std the std
	* @param Divison the divison
	*/
	public static void removeByStdAndDiv(int Std, String Divison) {
		getPersistence().removeByStdAndDiv(Std, Divison);
	}

	/**
	* Returns the number of students where Std = &#63; and Divison = &#63;.
	*
	* @param Std the std
	* @param Divison the divison
	* @return the number of matching students
	*/
	public static int countByStdAndDiv(int Std, String Divison) {
		return getPersistence().countByStdAndDiv(Std, Divison);
	}

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public static void cacheResult(Student student) {
		getPersistence().cacheResult(student);
	}

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public static void cacheResult(List<Student> students) {
		getPersistence().cacheResult(students);
	}

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param Id the primary key for the new student
	* @return the new student
	*/
	public static Student create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the student
	* @return the student that was removed
	* @throws NoSuchStudentException if a student with the primary key could not be found
	*/
	public static Student remove(long Id)
		throws com.ecw.student.exception.NoSuchStudentException {
		return getPersistence().remove(Id);
	}

	public static Student updateImpl(Student student) {
		return getPersistence().updateImpl(student);
	}

	/**
	* Returns the student with the primary key or throws a {@link NoSuchStudentException} if it could not be found.
	*
	* @param Id the primary key of the student
	* @return the student
	* @throws NoSuchStudentException if a student with the primary key could not be found
	*/
	public static Student findByPrimaryKey(long Id)
		throws com.ecw.student.exception.NoSuchStudentException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	*/
	public static Student fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, Student> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the students.
	*
	* @return the students
	*/
	public static List<Student> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of students
	*/
	public static List<Student> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students
	*/
	public static List<Student> findAll(int start, int end,
		OrderByComparator<Student> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of students
	*/
	public static List<Student> findAll(int start, int end,
		OrderByComparator<Student> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the students from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of students.
	*
	* @return the number of students
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StudentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StudentPersistence, StudentPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StudentPersistence.class);

		ServiceTracker<StudentPersistence, StudentPersistence> serviceTracker = new ServiceTracker<StudentPersistence, StudentPersistence>(bundle.getBundleContext(),
				StudentPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}