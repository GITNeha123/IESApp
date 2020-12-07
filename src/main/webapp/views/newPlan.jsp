<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
		<h1>New Plan Register Here</h1>
		<font color='red' id='err'>${err}</font> 
		<font color='green'>${SUCC_MSG}</font>

		<form:form method="post" action="savePlan"
			modelAttribute="plan">
			<table>
				<tr>
					<td>Plan Name :</td>
					<td><form:select path="pname"  class="ab">
							<form:option value="" label="--select--" />

							<form:option value="SNAP" label="SNAP" />
							<form:option value="CCAP" label="CCAP" />
							<form:option value="MEDICATED" label="MEDICATED" />
							<form:option value="MEDICARE" label="MEDICARE" />
							<form:option value="QHP" label="QHP" />
							<form:option value="KT-WORKS" label="KT-WORKS" />
						</form:select></td>
					
				</tr>

				<tr>
					<td>Plan Description:</td>
					<td><form:input path="pDes" class="ab" /></td>
				</tr>


				<tr>
					<td>Plan Start Date :</td>
					<td><form:input path="sDate" class="ab" /></td>
				</tr>

				<tr>
					<td>Plan End Date :</td>
					<td><form:input path="eDate" class="ab" /></td>
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