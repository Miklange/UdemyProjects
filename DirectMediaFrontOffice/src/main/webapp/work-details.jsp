<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OnlineStore - Details de l'oeuvre</title>
</head>
<body>
    <h1>OnlineStore - Détails :</h1>

    <div>
        <b>Titre : </b> ${currentWork.title} <br> 
        <b>Artiste : </b> ${currentWork.mainArtist.name} <br> 
        <b>Date : </b>${currentWork.release} <br> 
        <b>Genre : </b>${currentWork.genre} <br> 
        <b>Description : </b> ${currentWork.summary} <br>
    </div>
    <br>
    <div>
        <form action="addToCart" method="POST">
            <input type="hidden" name="idWork" value="${currentWork.id}"> 
            <input type="submit" value="Ajouter au caddy">
        </form>
    </div>
    <br>
    <div>
        <a href="home.jsp">Home</a>
    </div>

</body>
</html>