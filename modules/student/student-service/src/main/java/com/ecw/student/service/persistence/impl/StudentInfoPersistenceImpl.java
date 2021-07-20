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

import aQute.bnd.annotation.ProviderType;

import com.ecw.student.exception.NoSuchStudentInfoException;
import com.ecw.student.model.StudentInfo;
import com.ecw.student.model.impl.StudentInfoImpl;
import com.ecw.student.model.impl.StudentInfoModelImpl;
import com.ecw.student.service.persistence.StudentInfoPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the student info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfoPersistence
 * @see com.ecw.student.service.persistence.StudentInfoUtil
 * @generated
 */
@ProviderType
public class StudentInfoPersistenceImpl extends BasePersistenceImpl<StudentInfo>
	implements StudentInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StudentInfoUtil} to access the student info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StudentInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoModelImpl.FINDER_CACHE_ENABLED, StudentInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoModelImpl.FINDER_CACHE_ENABLED, StudentInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StudentInfoPersistenceImpl() {
		setModelClass(StudentInfo.class);
	}

	/**
	 * Caches the student info in the entity cache if it is enabled.
	 *
	 * @param studentInfo the student info
	 */
	@Override
	public void cacheResult(StudentInfo studentInfo) {
		entityCache.putResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoImpl.class, studentInfo.getPrimaryKey(), studentInfo);

		studentInfo.resetOriginalValues();
	}

	/**
	 * Caches the student infos in the entity cache if it is enabled.
	 *
	 * @param studentInfos the student infos
	 */
	@Override
	public void cacheResult(List<StudentInfo> studentInfos) {
		for (StudentInfo studentInfo : studentInfos) {
			if (entityCache.getResult(
						StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
						StudentInfoImpl.class, studentInfo.getPrimaryKey()) == null) {
				cacheResult(studentInfo);
			}
			else {
				studentInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all student infos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StudentInfoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the student info.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StudentInfo studentInfo) {
		entityCache.removeResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoImpl.class, studentInfo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StudentInfo> studentInfos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StudentInfo studentInfo : studentInfos) {
			entityCache.removeResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
				StudentInfoImpl.class, studentInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new student info with the primary key. Does not add the student info to the database.
	 *
	 * @param Id the primary key for the new student info
	 * @return the new student info
	 */
	@Override
	public StudentInfo create(long Id) {
		StudentInfo studentInfo = new StudentInfoImpl();

		studentInfo.setNew(true);
		studentInfo.setPrimaryKey(Id);

		return studentInfo;
	}

	/**
	 * Removes the student info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the student info
	 * @return the student info that was removed
	 * @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo remove(long Id) throws NoSuchStudentInfoException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the student info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student info
	 * @return the student info that was removed
	 * @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo remove(Serializable primaryKey)
		throws NoSuchStudentInfoException {
		Session session = null;

		try {
			session = openSession();

			StudentInfo studentInfo = (StudentInfo)session.get(StudentInfoImpl.class,
					primaryKey);

			if (studentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(studentInfo);
		}
		catch (NoSuchStudentInfoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StudentInfo removeImpl(StudentInfo studentInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(studentInfo)) {
				studentInfo = (StudentInfo)session.get(StudentInfoImpl.class,
						studentInfo.getPrimaryKeyObj());
			}

			if (studentInfo != null) {
				session.delete(studentInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (studentInfo != null) {
			clearCache(studentInfo);
		}

		return studentInfo;
	}

	@Override
	public StudentInfo updateImpl(StudentInfo studentInfo) {
		boolean isNew = studentInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (studentInfo.isNew()) {
				session.save(studentInfo);

				studentInfo.setNew(false);
			}
			else {
				studentInfo = (StudentInfo)session.merge(studentInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
			StudentInfoImpl.class, studentInfo.getPrimaryKey(), studentInfo,
			false);

		studentInfo.resetOriginalValues();

		return studentInfo;
	}

	/**
	 * Returns the student info with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the student info
	 * @return the student info
	 * @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudentInfoException {
		StudentInfo studentInfo = fetchByPrimaryKey(primaryKey);

		if (studentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return studentInfo;
	}

	/**
	 * Returns the student info with the primary key or throws a {@link NoSuchStudentInfoException} if it could not be found.
	 *
	 * @param Id the primary key of the student info
	 * @return the student info
	 * @throws NoSuchStudentInfoException if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo findByPrimaryKey(long Id)
		throws NoSuchStudentInfoException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the student info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student info
	 * @return the student info, or <code>null</code> if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
				StudentInfoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		StudentInfo studentInfo = (StudentInfo)serializable;

		if (studentInfo == null) {
			Session session = null;

			try {
				session = openSession();

				studentInfo = (StudentInfo)session.get(StudentInfoImpl.class,
						primaryKey);

				if (studentInfo != null) {
					cacheResult(studentInfo);
				}
				else {
					entityCache.putResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
						StudentInfoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
					StudentInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return studentInfo;
	}

	/**
	 * Returns the student info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the student info
	 * @return the student info, or <code>null</code> if a student info with the primary key could not be found
	 */
	@Override
	public StudentInfo fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, StudentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, StudentInfo> map = new HashMap<Serializable, StudentInfo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			StudentInfo studentInfo = fetchByPrimaryKey(primaryKey);

			if (studentInfo != null) {
				map.put(primaryKey, studentInfo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
					StudentInfoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (StudentInfo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STUDENTINFO_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (StudentInfo studentInfo : (List<StudentInfo>)q.list()) {
				map.put(studentInfo.getPrimaryKeyObj(), studentInfo);

				cacheResult(studentInfo);

				uncachedPrimaryKeys.remove(studentInfo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(StudentInfoModelImpl.ENTITY_CACHE_ENABLED,
					StudentInfoImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the student infos.
	 *
	 * @return the student infos
	 */
	@Override
	public List<StudentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StudentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<StudentInfo> findAll(int start, int end,
		OrderByComparator<StudentInfo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<StudentInfo> findAll(int start, int end,
		OrderByComparator<StudentInfo> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<StudentInfo> list = null;

		if (retrieveFromCache) {
			list = (List<StudentInfo>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STUDENTINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTINFO;

				if (pagination) {
					sql = sql.concat(StudentInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StudentInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StudentInfo>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the student infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StudentInfo studentInfo : findAll()) {
			remove(studentInfo);
		}
	}

	/**
	 * Returns the number of student infos.
	 *
	 * @return the number of student infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STUDENTINFO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StudentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the student info persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(StudentInfoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STUDENTINFO = "SELECT studentInfo FROM StudentInfo studentInfo";
	private static final String _SQL_SELECT_STUDENTINFO_WHERE_PKS_IN = "SELECT studentInfo FROM StudentInfo studentInfo WHERE Id IN (";
	private static final String _SQL_COUNT_STUDENTINFO = "SELECT COUNT(studentInfo) FROM StudentInfo studentInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "studentInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StudentInfo exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(StudentInfoPersistenceImpl.class);
}