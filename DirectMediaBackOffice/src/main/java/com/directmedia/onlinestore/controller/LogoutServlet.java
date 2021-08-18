package com.directmedia.onlinestore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet( name = "LogoutServlet", urlPatterns = { "/logout" } )
public class LogoutServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        out.print( "Vous avez été déconnecté !! <br><br>" );

        out.print( "Cliquez <a href =\"login.html\">ici</a> pour vous reconnecter !<br><br>" );

        out.print( "</BODY></HTML>" );
    }

}
