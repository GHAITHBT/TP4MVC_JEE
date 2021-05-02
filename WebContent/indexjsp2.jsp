<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="modele.clientbean"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creer client</title>
</head>
<body bgcolor="cccfff">
<%
      clientbean c=(clientbean) session.getAttribute("client");
 %>
 <pre> Client créé avec succés !
 <h3>
 		 NOM = <%=c.getNom() %>
		 
		 PRENOM = <%=c.getPrenom() %>
		 
		 ADRESSE = <%=c.getAdrliv() %>
		 
		 TELEPHONE = <%=c.getTel() %>
		 
		 EMAIL = <%=c.getEmail() %>
		 
		 
		 </h3>
		 
</body>
</html>