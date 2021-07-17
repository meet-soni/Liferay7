<%@ include file="/init.jsp" %>

<portlet:actionURL name="addStudent" var="addStudentURL" />

<aui:form action="<%=addStudentURL.toString() %>" method="post" name="name">
	<aui:input type="text" name ="name">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="address">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="std">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:input type="text" name ="div">
		<aui:validator name="required" ></aui:validator>
	</aui:input>
	<aui:button type="submit" value ="Add Student" name=""></aui:button>
</aui:form>
	