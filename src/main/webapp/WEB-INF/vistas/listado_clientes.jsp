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
		<h2>Listado de Clientes</h2>
		<table class="table">
			<tr>
				<th>Código</th>
				<th>NIF</th>
				<th>Razón Social</th>
				<th>Fecha Alta</th>
				<th>Activo</th>
				<th>Crédito</th>
			</tr>
			<c:forEach var="cliente" items="${clientes}">
			<tr>
				<td>${cliente.codigo}</td>
				<td>${cliente.nif}</td>
				<td>${cliente.razonSocial}</td>
				<td><fmt:formatDate value="${cliente.fechaAlta}" pattern="dd/MM/yyyy"/>
				<td>
					<c:if test="${!cliente.activo}">
						<span style="color:red;">NO</span>
					</c:if>
				</td>
				<td style="text-align: right;">
					<fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${cliente.credito}"/> €   
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>