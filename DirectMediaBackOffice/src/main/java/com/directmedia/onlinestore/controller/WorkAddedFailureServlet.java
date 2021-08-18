package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkAddedFailureServlet
 */
@WebServlet( name = "WorkAddedFailureServlet", urlPatterns = { "/work-added-failure" } )
public class WorkAddedFailureServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        out.print( "Une erreur est survenue, l'oeuvre n'a pas été ajoutée !! <br><br>" );

        out.print( "<a href =\"home.jsp\">Page d'acceuil</a><br><br>" );

        out.print( "</BODY></HTML>" );
    }

}
