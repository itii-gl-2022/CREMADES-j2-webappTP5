<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%@ page import ="java.util.ArrayList" %> 
  	<%@ page import ="java.util.List" %> 
  	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Articles dans votre panier</title>
</head>
<body>
	<c:forEach items="${itemPaniers }" var="item">
        <tr>
            <td>Nom produit : <c:out value="${itemPanier.produit.libelle}"/></td>
            <td>Prix : <c:out value="${itemPanier.produit.prix}"/></td>  
            <td>Quantite : <c:out value="${itemPanier.quantite}"/></td>  
        </tr>
    </c:forEach>
</body>
</html>