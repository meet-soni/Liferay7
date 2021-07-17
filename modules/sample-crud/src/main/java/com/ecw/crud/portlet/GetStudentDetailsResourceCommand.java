package com.ecw.crud.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;

public class GetStudentDetailsResourceCommand extends BaseMVCResourceCommand{

	private static final Log LOG = LogFactoryUtil.getLog(GetStudentDetailsResourceCommand.class);
	
	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		// TODO Auto-generated method stub
		
		resourceResponse.setContentType("text/html");
		try(PrintWriter writer = resourceResponse.getWriter() ) {
			JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();
			jsonResponse.put("STATUS", "SUCCESS");
			writer.println(jsonResponse);
		} catch (IOException e) {
			LOG.error(e);
		}
		
	}

}
