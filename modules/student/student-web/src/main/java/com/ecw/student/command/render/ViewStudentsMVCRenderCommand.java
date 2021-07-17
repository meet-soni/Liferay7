package com.ecw.student.command.render;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.ecw.student.constants.StudentPortletKeys;
import com.ecw.student.model.Student;
import com.ecw.student.service.StudentLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
	    immediate = true,
	    property = {
    		"javax.portlet.name=" + StudentPortletKeys.Student,
	        "mvc.command.name=viewStudents"
	    },
	    service = MVCRenderCommand.class
	)
public class ViewStudentsMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		List<Student> studentsList = studentLocalService.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		renderRequest.setAttribute("studentsList", studentsList);
		return "/jsps/view-students.jsp";
	}
	
	@Reference
	StudentLocalService studentLocalService;
}
