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
		<h2>Listado de Camareros</h2>
		<table class="table">
			<tr>
				<th>Código</th>
				<th>Nombre</th>
			</tr>
			<c:forEach var="camarero" items="${camareros}">
			<tr>
				<td>${camarero.id}</td>
				<td>${camarero.nombre}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>