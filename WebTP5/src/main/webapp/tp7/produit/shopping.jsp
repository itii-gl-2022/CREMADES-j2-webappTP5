<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%! 

Produit prod1 = new Produit("0X","1","Pomme","Le légendaire fruit défendu")
Produit prod2 = new Produit("0Z","2","Bonbon","Pour les grands enfants");
Produit prod3 = new Produit("0H","3","Perçeuse","Le bricolage a portée de mains");
Produit prod4 = new Produit("0C","4","Boeing AH-64 Apache","C'est pas ma guerre");
ArrayList produits = new ArrayList();
produits.add(prod1);
produits.add(prod2);
produits.add(prod3);
produits.add(prod4); 

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
		<c:forEach var="product" items="${produits}">
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