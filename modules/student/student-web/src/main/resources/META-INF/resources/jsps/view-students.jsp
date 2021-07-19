<%@page import="com.ecw.student.model.Student"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>

<portlet:renderURL var="addStudentURL">
	<portlet:param name="mvcPath" value="/jsps/add-student.jsp"/>
</portlet:renderURL>

<a href="<%=addStudentURL.toString()%>">Add Student</a>

<table class="table table-striped">
	<thead>
		<tr>
			<th>Student Id</th>
			<th>Name </th>
			<th>Address</th>			
			<th>Std - div </th>
			<th>Phone No</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentsList }" var = "student">
		<portlet:actionURL name="deleteStudent" var = "deleteStudentURL">
			<portlet:param name="studentId" value="${student.getId() }" />
		</portlet:actionURL>
		
		<portlet:renderURL var="updateStudentURL">
			<portlet:param name="mvcPath" value ="/jsps/update-student.jsp"/>
			<portlet:param name="studentId" value ="${student.getId() }" />
			<portlet:param name="name" value ="${student.getName() }" />
			<portlet:param name="address" value ="${student.getAddress() }" />
			<portlet:param name="std" value ="${student.getStd() }" />
			<portlet:param name="div" value ="${student.getDivison() }" />
			<portlet:param name="phoneNo" value ="${student.getPhoneNo() }" />
		</portlet:renderURL>
			<tr>
				<th>${student.getId() }</th>
				<th>${student.getName() }</th>
				<th>${student.getAddress() }</th>
				<th>${student.getStd() } - ${student.getDivison()}</th>
				<th>${student.getPhoneNo() }</th>
				<th>
					<a href="<%=updateStudentURL%>" 
	                    class="btn  btn-primary btn-default btn-sm px-2 py-1"> 
	                    <i class ="glyphicon glyphicon-edit"></i>
	                </a>
				</th>
				<th>
					<a href="<%=deleteStudentURL%>" 
	                    class="btn  btn-primary btn-default btn-sm px-2 py-1"
	                    onclick="return confirm('Are you sure you want to delete this item?');"> 
	                    <i class ="glyphicon glyphicon-remove"></i>
	                </a>
				</th>
			</tr>
		</c:forEach>
	</tbody>
</table>