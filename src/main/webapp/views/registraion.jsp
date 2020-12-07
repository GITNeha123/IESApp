<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Insert title here</title>
<style>
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: white;
}

.ab {
	width: 180%;
	border: 2px solid grey;
	box-sizing: border-box;
	height: 50px
}

button {
	width: 100%;
	background-color: DodgerBlue; /* Green */
	color: white;
	border: 2px solid grey;
	padding: 15px;
	margin: 10px 0px;
	cursor: pointer;
	font-size: 15px;
}

td {
	font-size: 18px;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

<div align="center" color="white" size="10px">
		<h1>New Register Here</h1>
	<font color="green" size="8px">${succ}</font>
 <font color="red">${err}</font>
 
		<form:form method="post" action="saveRegistration"
			modelAttribute="registration">
			<table>
				<tr>
					<td>First Name :</td>
					<td><form:input path="fname" class="ab" /></td>
					
				</tr>

				<tr>
					<td>Last Name:</td>
					<td><form:input path="lname" class="ab" /></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Fe-Male</td>
				</tr>


				<tr>
					<td>Date Of Birth:</td>
					<td><form:input path="dob" class="ab" /></td>
				</tr>

				<tr>
					<td>Phone No :</td>
					<td><form:input path="phNo" class="ab" /></td>
				</tr>
				
				<tr>
					<td>SSN No :</td>
					<td><form:input path="ssn" class="ab" id="ssn"/></td>
				</tr>
				
				<tr>
					<td>Email:</td>
					<td><form:input path="email" class="ab" /></td>
				</tr>


				
				<br>
				<tr>

					<td><b><button type="submit" id="submitBtn" />Register</b></td>
					<td><b>
							<button type="reset" />Clear
					</b></td>
					<td><a href="/">Back</a></td>
					</td>

				</tr>
			</table>
		</form:form>


	</div>


</body>
</html>