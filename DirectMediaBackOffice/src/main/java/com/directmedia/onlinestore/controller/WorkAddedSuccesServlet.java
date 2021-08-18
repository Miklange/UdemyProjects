package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkAddedSuccesServlet
 */
@WebServlet( name = "WorkAddedSuccesServlet", urlPatterns = { "/work-added-success" } )
public class WorkAddedSuccesServlet extends HttpServlet
{
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        out.print( "L'oeuvre avec ID [" + request.getAttribute( "idWork" ) + "] a été ajoutée !! <br><br>" );

        out.print( "<a href =\"home.jsp\">Page d'acceuil</a><br><br>" );

        out.print( "</BODY></HTML>" );
    }

}
