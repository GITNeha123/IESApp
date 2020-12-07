<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accounts</title>
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
    <script>
      function updateEmployees(){
        $.ajax({
          type: "GET",
          url: "roleAcc?role=role",
          dataType : 'json',
          cache: false,
          success: function(records){
            $('#workers').text(JSON.stringify(records, null, 4));
          }
        });
      }

      updateEmployees();
  </script>

</head>
<body>
	<h1>View Account Here</h1>
	Select Role :  <select name="--select--" id="role" onkeyup="searchInfo()">
	 <option value="">--Select--</option>
    <option value="admin">Admin</option>
    <option value="case worker">Case Worker</option>
     </select>
	<b> <font color='green'>${delmsg}</font> </b>
	</b>
	<br>	<br>	<br>
 <!-- Custom Filter -->
<table class="table" border="2"  cellpadding="2" id="searchByRole" placeholder='Enter Role' name="vinform">
		<tr>
		    <td>SNo. </td>
			<td>First Name</td>
			<td>Last Name</td>
		   <td>Email</td>
			<td>Role</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		
		<c:forEach items = "${accounts}" var="emp">
		<tr>
	<td>${emp.id}</td>
	<td>${emp.fname}</td>
	<td>${emp.lname}</td>
	<td>${emp.email}</td>
	<td>${emp.role}</td>
<td>
	<a href="edit?id=${emp.id}">Edit</a></td>
	<td>
	<a href="deleteAcc?id=${emp.id}" onclick="return deleteConferm()">Delete</a>
	</td>
	
	</tr>
	</c:forEach>
	</table>
		<td><td><a href="/">Back</a>  </td>
		
</body>
</html>