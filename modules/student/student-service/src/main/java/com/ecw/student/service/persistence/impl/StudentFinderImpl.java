package com.ecw.student.service.persistence.impl;

import java.util.List;

import com.ecw.student.model.Student;
import com.ecw.student.model.impl.StudentImpl;
import com.ecw.student.service.persistence.StudentFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

public class StudentFinderImpl extends StudentFinderBaseImpl implements StudentFinder{
	
	@SuppressWarnings("unchecked")
	public List<Student> findStudentByBloodGroupAndStd(String bloodGroup, int std) {
		Session session = null;
	    try {
	        session = openSession();

	        String sql = CustomSQLUtil.get(
	            getClass(),
	            FIND_BY_BLOOD_GROUP_STD);

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("GB_Entry", StudentImpl.class);

	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(std);
	        qPos.add(bloodGroup);

	        return (List<Student>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }

	    return null;
	}

	public static final String FIND_BY_BLOOD_GROUP_STD=
	    StudentFinder.class.getName() +
	        "_findStudentByBloodGroupAndStd";
}