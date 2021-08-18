<%@page import="com.directmedia.onlinestore.core.entity.Catalogue"%>
<%@page import="com.directmedia.onlinestore.core.entity.Work"%>
<%@page import="com.directmedia.onlinestore.core.entity.Artist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OnlineStore - Catalogue</title>
</head>
<body>
    <h1>Online Store - Catalogue</h1>

    <%
    // Add only if empty at beginning
    if ( Catalogue.listOfWork.isEmpty() )
    {
        Artist artistA = new Artist( "Michael Jackson" );
        Artist artistB = new Artist( "J.J. Goldman" );
        Artist artistC = new Artist( "Maitre Gims" );

        Work oeuvreA = new Work( "Thriller" );
        oeuvreA.setMainArtist( artistA );
        oeuvreA.setGenre( "Pop" );
        oeuvreA.setSummary( "C'est de la bombe" );
        oeuvreA.setRelease( 1980 );

        Work oeuvreB = new Work( "Traces" );
        oeuvreB.setMainArtist( artistB );
        oeuvreB.setGenre( "Pop Rock" );
        oeuvreB.setSummary( "Les enfoirés" );
        oeuvreB.setRelease( 1989 );

        Work oeuvreC = new Work( "Subliminal" );
        oeuvreC.setMainArtist( artistC );
        oeuvreC.setGenre( "Rap" );
        oeuvreC.setSummary( "Wesh !" );
        oeuvreC.setRelease( 2013 );

        Catalogue.listOfWork.add( oeuvreA );
        Catalogue.listOfWork.add( oeuvreB );
        Catalogue.listOfWork.add( oeuvreC );
    }
    %>

    <h3>Liste des oeuvres :</h3>

    <div>
        <ul>
            <%
            // Afficher la liste
            for ( Work work : Catalogue.listOfWork )
            {
            %>
            <li><%=work.toString()%></li>
            <%
            }
            %>
        </ul>
    </div>
    
    <div>
        <a href="home.jsp">Home</a>
    </div>

</body>
</html>