package com.ecw.student.listener;

import org.osgi.service.component.annotations.Component;

import com.ecw.student.model.Student;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

@Component(immediate = true, service = ModelListener.class)
public class StudentModelListener extends BaseModelListener<Student> {

	@Override
	public void onBeforeCreate(Student student) throws ModelListenerException {
		if(student.getPhoneNo() == 0) {
			student.setPhoneNo(9111111111L);
		}
		super.onBeforeCreate(student);
	}

}
