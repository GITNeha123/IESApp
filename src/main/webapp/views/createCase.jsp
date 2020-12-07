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
 form {   
        border: 1px solid #f1f1f1;   
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
		<h1>Create New Case Here</h1>
		<font color='red' id='err'>${err}</font> 
		<font color='green'>${s}</font>
		<font color='green'>${susmsg}</font>
		<font color='green'>${errmsg}</font>
		<form:form method="POST" action="sveCse" 
		modelAttribute="ccse">
	<table class="table" border="2"  cellpadding="2" id="searchByRole" placeholder='Enter Role' name="vinform">
		
				<tr>
					<td>Application ID :</td>
					<td><form:input path="rID" class="ab"/>
					
					</td>
						</tr>
						
				<tr>
					<td>Name:</td>
					<td><form:input path="name" class="ab"  /></td>
				</tr>
				
				<tr>
					<td>Date Of Birth:</td>
					<td><form:input path="dob" class="ab" /></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><form:input path="gender" class="ab" /></td>
				</tr>
						
						<tr>
					<td>SSN No :</td>
					<td><form:input path="ssn" class="ab" id="ssn" /></td>
				</tr>
				<tr>
					<td>Phone No :</td>
					<td><form:input path="phNo" class="ab"  /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" class="ab" /></td>
				</tr>
				<tr>

					<td><b><button type="submit" id="submitBtn"/>Create Case</b></td>
					<td><b>
							<button type="reset" />Clear
					</b></td>
					<td><a href="/">Back</a></td>
					</tr>
			</table>
		</form:form>
	
</div>
</body>
</html>