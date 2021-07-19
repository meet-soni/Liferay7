<%@ include file="init.jsp"%>

<%
String studentId = request.getParameter("studentId");
String name = request.getParameter("name");
String address = request.getParameter("address");
String std = request.getParameter("std");
String div = request.getParameter("div");
String phoneNo = request.getParameter("phoneNo");
%>

<portlet:actionURL name="updateStudent" var="updateStudentURL" />

<aui:form action="<%=updateStudentURL.toString() %>" method="post" name="name">
	<aui:input type="hidden" name="studentId" value="<%=studentId %>" />
	<aui:input type="text" name ="name" value="<%=name %>">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="address" value="<%=address %>">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="std" value="<%=std %>">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="div" value="<%=div %>">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="phoneNo" value ="<%=phoneNo %>">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:button type="submit" value ="Update Student" name=""></aui:button>
</aui:form>