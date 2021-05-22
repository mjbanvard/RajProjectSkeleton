<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form:form action="/ThisOneDamnit/login" method="get" modelAttribute="userVo">
	<table>  
		<tr>
			<td colspan="2" align="center">Login</td>
		</tr>
		<tr>
			<td>Username</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td align="right"><input type="submit" value="Login" /></td>
			<td><input type="reset" value="Cancel" /></td>
		</tr>
	</table>
</form:form> 

</body>
</html>
