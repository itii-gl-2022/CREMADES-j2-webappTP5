<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@
	${ }
 %>
<html>
<head>
<title>Bienvenue pour acheter des trucs super utiles</title>
</head>
<body>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Id</th>
			<th>Libelle</th>
			<th>Code</th>
			<th>Prix</th>
			<th>Ajouter au panier</th>
		</tr>
		<c:forEach var="product" items="${produits }">
			<tr>
				<td>${produit.id }</td>
				<td>${produit.libelle }</td>
				<td>${produit.code }</td>
				<td>${produit.price }</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/panier?&action=acheter&id=${produit.id }">Ajouter au panier</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>