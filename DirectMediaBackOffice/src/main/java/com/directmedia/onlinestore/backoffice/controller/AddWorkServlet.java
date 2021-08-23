package com.directmedia.onlinestore.backoffice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 * Servlet implementation class AddWorkServlet
 */
@WebServlet( name = "AddWorkServlet", urlPatterns = { "/add-work" } )
public class AddWorkServlet extends HttpServlet
{

    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
    }

    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {

        boolean ok = true;

        // Get all parameters
        String titre = request.getParameter( "title" );
        String date = request.getParameter( "release" );
        String genre = request.getParameter( "genre" );
        String description = request.getParameter( "summary" );
        String artist = request.getParameter( "artist" );

        // Create object
        Work newWork = new Work( titre );
        newWork.setGenre( genre );
        newWork.setSummary( description );
        newWork.setMainArtist( new Artist( artist ) );

        // Check value of the date
        try
        {
            newWork.setRelease( Integer.parseInt( date ) );
        }
        catch ( NumberFormatException e )
        {
            ok = false;
        }

        // Check if the Work already exists in the catalogue
        boolean exist = Catalogue.listOfWork.stream().filter( w -> w.getTitle().equals( newWork.getTitle() )
                && w.getRelease() == newWork.getRelease()
                && w.getMainArtist().getName().equals( newWork.getMainArtist().getName() ) )
                .findAny()
                .isPresent();

        RequestDispatcher dispatcher;

        if ( ok && !exist )
        {
            // Add in the list
            Catalogue.listOfWork.add( newWork );

            // Add id in attributes values to get it in other servlet
            request.setAttribute( "idWork", newWork.getId() );

            // Forward to success page
            dispatcher = request.getRequestDispatcher( "/work-added-success" );
        }
        else
        {
            // Forward to failure page
            dispatcher = request.getRequestDispatcher( "/work-added-failure" );
        }

        dispatcher.forward( request, response );
    }
}
