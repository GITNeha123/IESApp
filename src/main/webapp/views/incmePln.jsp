<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Income</title>
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
</head>
<body>
<div align="center" color="white" size="10px">
		<h1>Income Details Here</h1>
		<font color='red' id='err'>${errmsg}</font> 
		<font color='green'>${susmsg}</font>
		<form:form method="POST" action="sveInme"
			modelAttribute="incm">
			<table>
			<tr>
					<td>Case ID:</td>
					<td><form:input path="cID" class="ab" /></td>
				</tr>


				<tr>
					<td>Indivisual Name :</td>
					<td><form:input path="name" class="ab" /></td>
				</tr>
			<tr>
					<td>Working Employee :</td>
					<td>
					<form:radiobutton path="emp" value="Y" />Yes 
					<form:radiobutton
							path="emp" value="N" />No
					</td>
					
				</tr>

			
				<tr>
					<td> Other Income:</td>
					<td><form:input path="incme" class="ab" placeholder="00.$" /></td>
						</tr>

				
				
				<br>
				<tr>

					<td><b><button type="submit" id="submitBtn" />Next</b></td>
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