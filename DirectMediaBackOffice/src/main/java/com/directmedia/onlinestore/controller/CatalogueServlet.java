package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 * Servlet implementation class CatalogueServlet
 */
//Plus besoin de cette servlet avec l'ajout de la page home.jsp
@Deprecated
//@WebServlet( name = "CatalogueServlet", urlPatterns = { "/catalogue" } )
public class CatalogueServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

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

        out.print( "<HTML><BODY> Liste des oeuvres : <br> <ul>" );

        // Afficher la liste
        for ( Work work : Catalogue.listOfWork )
        {
            out.print( "<li>" + work.toString() + "</li>" );
        }

        out.print( "</ul></BODY></HTML>" );
    }
}
