package com.ecw.crud.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.ecw.crud.constants.StudentControllerPortletKeys;
import com.ecw.student.model.Student;
import com.ecw.student.service.StudentLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	    immediate = true,
	    property = {
    		"javax.portlet.name=" + StudentControllerPortletKeys.StudentController,
	        "mvc.command.name=addStudent"
	    },
	    service = MVCActionCommand.class
	)
public class SaveStudentActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		String studentName = ParamUtil.getString(actionRequest, "name");
		String address = ParamUtil.getString(actionRequest, "address");
		int std = ParamUtil.getInteger(actionRequest, "std");
		String div = ParamUtil.getString(actionRequest, "div");
		

		long studentId = counterLocalService.increment(Student.class.getName());
		Student student = studentLocalService.createStudent(studentId);
		student.setName(studentName);
		student.setAddress(address);
		student.setStd(std);
		student.setDivison(div);
		studentLocalService.addStudent(student);
		hideDefaultSuccessMessage(actionRequest);
		actionResponse.setRenderParameter("mvcRenderCommandName", "viewStudents");
	}

	@Reference
	StudentLocalService studentLocalService;
	
	@Reference
	CounterLocalService counterLocalService;
}
