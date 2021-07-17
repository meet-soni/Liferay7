package com.ecw.crud.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.ecw.crud.constants.StudentControllerPortletKeys;
import com.ecw.student.service.StudentLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	    immediate = true,
	    property = {
    		"javax.portlet.name=" + StudentControllerPortletKeys.StudentController,
	        "mvc.command.name=deleteStudent"
	    },
	    service = MVCActionCommand.class
	)
public class DeleteStudentActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		studentLocalService.deleteStudent(studentId);
		hideDefaultSuccessMessage(actionRequest);
		
		actionResponse.setRenderParameter("mvcRenderCommandName", "viewStudents");
	}
	
	@Reference
	StudentLocalService studentLocalService;

}
