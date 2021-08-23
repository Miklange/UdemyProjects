package com.directmedia.onlinestore.frontoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
                request.setAttribute( "currentWork", currentWork );

                // Forward to JSP details page
                RequestDispatcher dispatcher = request.getRequestDispatcher( "/WEB-INF/work-details.jsp" );
                dispatcher.forward( request, response );
            }
            else
            {
                // No elements for the Id
                out.print( "<HTML><BODY>" );
                out.print( "<H1>Aucun élément ne correspond à cet ID</H1>" );
                out.print( "</BODY></HTML>" );
            }
        }
        else
        {
            out.print( "<HTML><BODY>" );
            // Catalogue is empty
            out.print( "<H1>Le catalogue est vide</H1>" );
            out.print( "</BODY></HTML>" );
        }
    }
}
