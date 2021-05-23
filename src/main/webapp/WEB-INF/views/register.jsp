<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.galaxe.springMvc.domain.UserVO" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<%
	//String username = (String)request.getParameter("username");
	UserVO userVo = new UserVO();
	
	%>
	
 <h2>Registration Page</h2>
 
 <form action="/create" method="POST" modelAttribute="userVo">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" path="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" path="lastName" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" path="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" path="password" /></td>
    </tr>
    <tr>
     <td>Confirm Password</td>
     <td><input type="password" path="confirmPassword" /></td>
    </tr>
    <tr>
     <td>Role</td>
     <td>
	     <select>
	       	<option value="Admin">Admin</option>
	     	<option value="User">User</option> 
	     </select>
	 </td>
    
    </tr>
    <tr>
     <td>Gender</td>
     <td>
	     <select>
	       	<option value="Male">Male</option>
	     	<option value="Female">Female</option> 
	     </select>
	 </td>
    
    </tr>
   </table>
   <input type="reset" value="Cancel">
   <input type="submit" value="Submit">
</form>

</body>
</html>