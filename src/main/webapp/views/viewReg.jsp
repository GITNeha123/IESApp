<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function deleteConferm() {
		return confirm("Are u sure want to delete?");
	}
	</script>
	<script src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<link href='//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css' rel='stylesheet' type='text/css'>
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
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>

<body>
<center>
	<h1>View Registered Here</h1>
		<b> <font color='green'>${delmsg}</font> </b>
	</b>
	</center>
	<br>	<br>	<br>
 <!-- Custom Filter -->
<table class="table" border="2"  cellpadding="2" id="searchByRole" placeholder='Enter Role' name="vinform">
		<tr>
		   
			<td>First Name</td>
			<td>Last Name</td>
		   <td>Email</td>
			<td>Date of Birth</td>
			<td>Gender</td>
			<td>Mobile</td>
			<td>SSN No</td>
			
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		
		<c:forEach var="emp" items="${registration}">   
   <tr>  
   <td>${emp.fname}</td>  
   <td>${emp.lname}</td>  
   <td>${emp.email}</td>  
   <td>${emp.dob}</td>  
    <td>${emp.gender}</td>  
    <td>${emp.phNo}</td>  
    <td>${emp.ssn}</td>  
   <td><a href="editARR?arID=${emp.arID}">Edit</a></td>  
   <td><a href="deleteAR?arID=${emp.arID}" onclick="return deleteConferm()">Delete</a></td>  
   </tr>  
   </c:forEach>  
	</table>
		<td><td><a href="/">Back</a>  </td>
		

</body>
</html>