<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="head_info.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<jsp:include page="cabecera.jsp"></jsp:include>
		<h2>Bienvenidos a PediGest!</h2>
		<div style="margin:20px;">
			<table>
				<tr>
					<td width="300px">API REST Reference </td>
					<td><strong>http://localhost:8080/swagger-ui.html</strong></td>
				</tr>
					<tr>
					<td>H2 Console </td>
					<td><strong>http://localhost:8080/h2-console</strong></td>
				</tr>
			</table>
		</div>
		<img width="200px" height="200px" src="/img/bootsy.jpg"/>
	</div>
</body>
</html>