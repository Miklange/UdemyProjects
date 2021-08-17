package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet( name = "AuthenticationServlet", urlPatterns = { "/login" } )
public class AuthenticationServlet extends HttpServlet
{
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {

    }

    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {

        String login = request.getParameter( "login" );
        String password = request.getParameter( "password" );

        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        if ( login.equals( "michel" ) && password.equals( "123456" )
                || login.equals( "caroline" ) && password.equals( "abcdef" ) )
        {

            HttpSession session = request.getSession();
            session.setAttribute( "login", login );

            out.print( "Vous êtes bien identifié<br><br>" );
        }
        else
        {
            out.print( "Identifiants inconnus<br><br>" );
            out.print( "<a href =\"login.html\">Login</a><br><br>" );
        }

        out.print( "<a href =\"home\">Page d'acceuil</a><br><br>" );

        out.print( "</BODY></HTML>" );
    }
}
