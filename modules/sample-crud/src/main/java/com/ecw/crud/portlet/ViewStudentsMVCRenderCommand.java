package com.ecw.crud.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.ecw.crud.constants.StudentControllerPortletKeys;
import com.ecw.student.model.Student;
import com.ecw.student.service.StudentLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
	    immediate = true,
	    property = {
    		"javax.portlet.name=" + StudentControllerPortletKeys.StudentController,
	        "mvc.command.name=viewStudents"
	    },
	    service = MVCRenderCommand.class
	)
public class ViewStudentsMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		List<Student> studentsList = studentLocalService.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		System.out.println("student list is "+studentsList.toString());
		renderRequest.setAttribute("studentsList", studentsList);
		return "/viewStudents.jsp";
	}
	
	@Reference
	StudentLocalService studentLocalService;

}
