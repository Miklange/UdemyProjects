package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {

        // Get all parameters
        String titre = request.getParameter( "title" );
        String date = request.getParameter( "release" );
        String genre = request.getParameter( "genre" );
        String description = request.getParameter( "summary" );
        String artist = request.getParameter( "artist" );

        // Create object
        Work newWork = new Work( titre );
        newWork.setGenre( genre );
        newWork.setRelease( Integer.parseInt( date ) );
        newWork.setSummary( description );
        newWork.setMainArtist( new Artist( artist ) );

        // Add in the list
        Catalogue.listOfWork.add( newWork );

        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        out.print( "L'oeuvre a été ajouté ! <br><br>" );

        out.print( "<a href =\"home\">Page d'acceuil</a><br><br>" );

        out.print( "</BODY></HTML>" );
    }

}
