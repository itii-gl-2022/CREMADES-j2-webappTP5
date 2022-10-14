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
        <div>Individus:</div>
        <table>
          <tr>
            <td>count</td>
            <td>nom</td>
            <td>prenom</td>
            <td>adresse</td>
          </tr>
        <c:forEach items="${ individus }" var="individu" varStatus="status">
          <tr>
            <td>${status.count}</td>
            <td>${individu.nom}</td>
            <td>${individu.prenom}</td>
            <td>${individu.adresse}</td>
          </tr>
        </c:forEach>
        </table>
  </body>
</html>