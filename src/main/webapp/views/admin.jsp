<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Admin</title>

<script>
	$(document).ready(
			function() {
				$("#mail").blur(function() {
								$.ajax({
						type : "GET",
						url : "uniqueEmail?email=" + $("#mail").val(),
						success : function(data) {
							if (data == "DUPLICATE") {
								$("#errMsg").text("Duplicate Email");
								$("#submitBtn").prop("disabled", true);
							} else {
								$("#submitBtn").prop("disabled", false);
							}
						}
					});

				</script>
				</head>

<body>
	<div class="container" align="center" style="width:800px">
	<h2>Account Registration Here</h2>
			<font color='red' id='err'>${err}</font> 
		         <font color='green'>${SUCC_MSG}</font>
		            <font color='green'>${UPDATE_MSG}</font>
		<form:form  method="post" action="saveAcc" modelAttribute="account">
		<table class="table">
				<tr>
					<td>First Name :</td>
					<td> <form:input path="fname" placeholder="First Name"/>
				
					</td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td> <form:input path="lname" placeholder="Last Name"/></td>
				</tr>
  
  <tr>
					<td>Email :</td>
					<td> <form:input path="email" placeholder="Email" id="mail" onblur="myFunction()"/></td>
				</tr>
				
				<tr>
					<td>Password :</td>
					<td> <form:input path="pwd" placeholder="Password"/></td>
				</tr>
				
					<tr>
					<td>Date of Birth :</td>
					<td> <form:input path="dob" placeholder="Date of Birth "/></td>
				</tr>
				
				
				<tr>
					<td>Gender :</td>
					<td>
					<form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Fe-Male</td>
					</td>
				</tr>
				
					
				<tr>
					<td>SSN No:</td>
					<td> <form:input path="ssn" placeholder="SSN-No"/></td>
				</tr>
				
					
				<tr>
					<td>Phone No :</td>
					<td> <form:input path="phNo" placeholder="Phone No"/></td>
				</tr>
				
						
				<tr>
					<td>Role:</td>
					<td>
					<form:select path="role">
							<form:option value="" label="--select--" />
							<form:option value="admin" label="Admin"/>  
        <form:option value="case worker" label="Case Worker"/>  
						</form:select>
					</tr>
				
						
				<tr>
					<td> <button type="submit" class="btn btn-primary mb-2" id="submitBtn">Submit</button></td>
					<td><td><a href="/">Home</a>  </td>
				</tr>
				
				
			</table>

		</form:form>
	</div>

</body>
</html>