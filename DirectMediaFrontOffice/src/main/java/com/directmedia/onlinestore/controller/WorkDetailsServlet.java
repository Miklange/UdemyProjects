package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 * Servlet implementation class Somme
 */
@WebServlet( name = "WorkDetailsServlet", urlPatterns = { "/work-details" } )
public class WorkDetailsServlet extends HttpServlet
{
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        // If the catalog is empty, do nothing
        if ( !Catalogue.listOfWork.isEmpty() )
        {
            // Get id from parameters
            long idToFind = Long.parseLong( request.getParameter( "id" ) );

            // Find in the list the correct work
            Work currentWork = Catalogue.listOfWork.stream()
                    .filter( work -> work.getId() == idToFind )
                    .findFirst()
                    .orElse( null );

            if ( currentWork != null )
            {
                // Print details
                out.print( "<b>Titre : </b>" + currentWork.getTitle() + "<br>" );
                out.print( "<b>Artiste : </b>" + currentWork.getMainArtist().getName() + "<br>" );
                out.print( "<b>Date : </b>" + currentWork.getRelease() + "<br>" );
                out.print( "<b>Genre : </b>" + currentWork.getGenre() + "<br>" );
                out.print( "<b>Description : </b>" + currentWork.getSummary() + "<br>" );

                out.print( "<form action=\"addToCart\" method=\"POST\">" );
                out.print( "<input type=\"hidden\" name=\"idWork\" value=\"" + currentWork.getId() + "\">" );
                out.print( "<input type=\"submit\" value=\"Ajouter au caddy\">" );
                out.print( "</form>" );
            }
            else
            {
                // No elements for the Id
                out.print( "<H1>Aucun élément ne correspond à cet ID</H1>" );
            }
        }
        else
        {
            // Catalogue is empty
            out.print( "<H1>Le catalogue est vide</H1>" );
        }

        out.print( "</BODY></HTML>" );

    }

}
