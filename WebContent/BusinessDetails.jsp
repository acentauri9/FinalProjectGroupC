<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BusinessDetails</title>
</head>
<body>
<form name="Business Type" method="post" action="GoogleMap.jsp"> 
<table align="center" width="250px" border=0 style="background-color:ffeeff;">
<tr><td colspan=2 align="center" style="font-weight:bold;font-size:15pt;" align="center">Select Your Business Type</td>
</tr>
<tr><td colspan=2>&nbsp;</td>
</tr>
<tr><td style="font-size:12pt;" align="center">Business Type:</td>
<td><select name="BusinessList">
  <option value="shoe_store">shoe_store</option>
  <option value="electronic_store">electronic_store</option>
  <option value="grocery_or_supermarket">grocery_or_supermarket</option>
  <option value="restaurant">restaurant</option>
</select></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="pageName" value="submit"></td>
</tr>
</table>
</form>
</body>
</html>