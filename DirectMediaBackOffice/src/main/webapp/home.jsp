<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OnlineStore - Accueil du Back Office</title>
</head>
<body>
    <h1>Online Store - Gestion de la boutique</h1>

    <c:if test="${not empty login}">
        <div>
            Bonjour ${login} (<a href=logout>Déconnexion</a>) <br> <br>
        </div>
    </c:if>
    <div>
        <!-- <a href=login.html>Connexion</a><br> <br> -->
    </div>
    <div>
        <a href="catalogue">Accès au catalogue des oeuvres </a> <br> <br>
    </div>

    <div>
        <a href="add-work-form.html">Ajouter une oeuvre </a> <br> <br>
    </div>

</body>
</html>