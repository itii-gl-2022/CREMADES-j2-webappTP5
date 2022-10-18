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
       <div>Info Produit :s&nbsp;:</div>
       <ul>
           <li>Produit : ${sessionScope.produit}</li>
           <li>Code : <c:out value="${sessionScope.code}"/></li>
       </ul>
       <div>Votre QR code produit :&nbsp;:</div>       
      <a ref src="qrcode.png">QR CODE</a>
  </body>
</html>