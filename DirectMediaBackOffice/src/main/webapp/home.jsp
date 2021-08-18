<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OnlineStore - Accueil du Back Office</title>
</head>
<body>
    <h1>Online Store - Gestion de la boutique</h1>

    <%
    String user = (String) session.getAttribute( "login" );

    if ( user != null )
    {
    %>
    <div>
        Bonjour
        <%=user%>
        (<a href=logout>Déconnexion</a>) <br> <br>
    </div>
    <%
    }
    else
    {
    %>
    <div>
        <a href=login.html>Connexion</a><br> <br>
    </div>
    <%
    }
    %>

    <div>
        <a href="catalogue.jsp">Accès au catalogue des oeuvres </a> <br> <br>
    </div>

    <div>
        <a href="add-work-form.html">Ajouter une oeuvre </a> <br> <br>
    </div>

</body>
</html>