package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
// Plus besoin de cette servlet avec l'ajout de la page home.jsp
@Deprecated
//@WebServlet( name = "HomeServlet", urlPatterns = { "/home" } )
public class HomeServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {

        response.setContentType( "text/html;charset=UTF-8" );

        PrintWriter out = response.getWriter();
        out.print( "<HTML><BODY> <a href=/DirectMediaFrontOffice/catalogue>Accès au catalogue des oeuvres </a></BODY></HTML>" );
    }
}
