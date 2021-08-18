package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet( name = "HomeServlet", urlPatterns = { "/home" } )
public class HomeServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

        // Get user
        String user = request.getSession().getAttribute( "login" ).toString();

        out.print( "<HTML><BODY>  Online Store - Gestion de la boutique <br>"
                + "<br> <div> Bonjour " + user + "(<a href =\"logout\">Déconnexion</a>)" + "</div>"
                + "<br> <a href=/DirectMediaBackOffice/catalogue>Accès au catalogue des oeuvres </a>"
                + "<br> <a href=/DirectMediaBackOffice/add-work-form.html>Ajouter une oeuvre </a>"
                + " </BODY></HTML>" );
    }
}
