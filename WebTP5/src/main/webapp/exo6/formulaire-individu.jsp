<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<head>
    <title>A very simple inscription servlet</title>
	</head>
	<body>
		<form action="./individu" method="post">
		nom: <input type="text" name="nom" required/><br/>
		prenom: <input type="text" name="prenom" required/><br/>
		adresse: <input type="text" name="adresse" required/><br/>
		<input type="submit" value="Suivant">
		</form>
	</body>
</html>