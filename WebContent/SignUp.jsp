<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<form name="signupform" method="post" action="loginServlet"> 
<table align="center" width="250px" border=0 style="background-color:ffeeff;">
<tr><td colspan=2 align="center" style="font-weight:bold;font-size:20pt;" align="center">User Signup</td>
</tr>
<tr><td colspan=2>&nbsp;</td>
</tr>
<tr><td style="font-size:12pt;" align="center">Username:</td>
<td><input type="text" name="userName" value=""></td>
</tr>
<tr><td style="font-size:12pt;" align="center">UserId:</td>
<td><input type="text" name="userid" value=""></td>
</tr>
<tr><td style="font-size:12pt;" align="center">Password:</td>
<td><input type="password" name="password" value=""></td>
</tr>
<tr><td style="font-size:12pt;" align="center">Email:</td>
<td><input type="text" name="email" value=""></td>
</tr>
<tr><td style="font-size:12pt;" align="center">Phone Number:</td>
<td><input type="text" name="phno" value=""></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="pageName" value="SignUp" onClick="alert('successfully registered! Enter UserId and Password for login')"></td>
</tr>
</table> 
</form>
</body>
</html>