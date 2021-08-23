package com.directmedia.onlinestore.frontoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.ShoppingCart;
import com.directmedia.onlinestore.core.entity.Work;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet( name = "AddToCartServlet", urlPatterns = { "/addToCart" } )
public class AddToCartServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        // Get id to add in caddy
        String idWork = request.getParameter( "idWork" );
        long id = Long.parseLong( idWork );

        // Get the current caddy
        ShoppingCart myCart = (ShoppingCart) request.getSession().getAttribute( "myCaddy" );

        // The first time, add it in the current session
        if ( myCart == null )
        {
            myCart = new ShoppingCart();
            request.getSession().setAttribute( "myCaddy", myCart );
        }

        // Find in the catalogue the work with id, null otherwise
        Work work = Catalogue.listOfWork.stream()
                .filter( w -> w.getId() == id )
                .findFirst()
                .orElse( null );

        // if found, add it in caddy
        if ( work != null )
        {
            myCart.getCaddy().add( work );
        }

        response.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = response.getWriter();

        out.print( "<HTML><BODY>" );

        out.print( "<b> Oeuvre ajouté au caddy (" + myCart.getCaddy().size() + ")</b><br><br>" );

        out.print( "<a href =\"catalogue\">Retour Catalogue</a>" );

        out.print( "</BODY></HTML>" );

    }

}
