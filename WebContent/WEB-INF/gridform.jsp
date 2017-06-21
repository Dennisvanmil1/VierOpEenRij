<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/VierOpEenRij/GridFormStyle.css" type="text/css">
<title>gridform</title>
</head>
<body>

<div id= "tableform">

	<button type="button">A</button>
	<button type="button">B</button>
	<button type="button">C</button>
	<button type="button">D</button>
	<button type="button">E</button>
	<button type="button">F</button>
	<button type="button">G</button>
	<button type="button">H</button>
	
<table style="width:420px">
  	<tr>
  	<td><c:if test="${g.collumnA > 0}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 0}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 0}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 0}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 0}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 0}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 0}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 0}">${g.token}</c:if></td>
    
  </tr>
  <tr>
    <td><c:if test="${g.collumnA > 1}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 1}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 1}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 1}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 1}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 1}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 1}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 1}">${g.token}</c:if></td>
  </tr>
  	<tr>
    <td><c:if test="${g.collumnA > 2}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 2}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 2}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 2}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 2}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 2}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 2}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 2}">${g.token}</c:if></td>
  </tr>
  	<tr>
    <td><c:if test="${g.collumnA > 3}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 3}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 3}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 3}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 3}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 3}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 3}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 3}">${g.token}</c:if></td>
  </tr>
   	<tr>
    <td><c:if test="${g.collumnA > 4}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 4}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 4}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 4}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 4}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 4}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 4}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 4}">${g.token}</c:if></td>
  </tr>
   	<tr>
    <td><c:if test="${g.collumnA > 5}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 5}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 5}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 5}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 5}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 5}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 5}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 5}">${g.token}</c:if></td>
  </tr>
   	<tr>
    <td><c:if test="${g.collumnA > 6}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 6}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 6}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 6}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 6}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 6}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 6}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 6}">${g.token}</c:if></td>
  </tr>
   	<tr>
    <td><c:if test="${g.collumnA > 7}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnB > 7}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnC > 7}">${g.token}</c:if></td>
   	<td><c:if test="${g.collumnD > 7}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnE > 7}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnF > 7}">${g.token}</c:if></td>
    <td><c:if test="${g.collumnG > 7}">${g.token}</c:if></td> 
    <td><c:if test="${g.collumnH > 7}">${g.token}</c:if></td>
   </tr>
  
  
  </table>
  
  </div>

</body>
</html>