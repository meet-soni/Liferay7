package com.ecw.student.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.ecw.student.constants.StudentPortletKeys;
import com.ecw.student.model.Student;
import com.ecw.student.service.StudentLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(
	    immediate = true,
	    property = {
    		"javax.portlet.name=" + StudentPortletKeys.Student,
	        "mvc.command.name=updateStudent"
	    },
	    service = MVCActionCommand.class
	)
public class UpdateStudentMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		String studentName = ParamUtil.getString(actionRequest, "name");
		String address = ParamUtil.getString(actionRequest, "address");
		int std = ParamUtil.getInteger(actionRequest, "std");
		String div = ParamUtil.getString(actionRequest, "div");
		
		Student student = studentLocalService.fetchStudent(studentId);
		if(Validator.isNotNull(student)) {
			student.setName(studentName);
			student.setAddress(address);
			student.setStd(std);
			student.setDivison(div);
			studentLocalService.updateStudent(student);
		}
		
		actionResponse.setRenderParameter("MVCRenderCommandName", "viewStudents");
	}
	
	@Reference
	StudentLocalService studentLocalService;

}
