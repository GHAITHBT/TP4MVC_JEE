<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modele.Utilisateurbean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Utilisateur</title>
</head>
<body BGCOLOR="ffffcc">
<form action="index1.html">
 <%
      Utilisateurbean u=(Utilisateurbean) session.getAttribute("user");
 %>
 <pre>
 	<h3>Bienvenue a votre session
 
		 NOM = <%=u.getNom() %>
		 
		 PRENOM = <%=u.getPrenom() %></h3>
		 
 	<input type="submit"value="Retour">
 	</pre>
 </form>
 </body>
</html>