<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Java EE - Exemple MVC</title>
  </head>
  <body>
        <div>Vos données personnelles&nbsp;:</div>
        <ul>
                <li>Nom : ${sessionScope.nom}</li>
                <li>Prenom : <c:out value="${sessionScope.prenom}"/></li>
                <li>Adresse : <c:out value="${sessionScope.adresse}"/></li>
        </ul>
        <div>
            <a href='<c:url value="/"/>'>Retour à l'accueil</a>
        </div>
  </body>
</html>