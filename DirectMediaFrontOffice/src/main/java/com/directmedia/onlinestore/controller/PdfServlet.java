package com.directmedia.onlinestore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class PdfServlet
 */
@WebServlet( name = "PdfServlet", urlPatterns = { "/pdf" } )
public class PdfServlet extends HttpServlet
{

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        response.setContentType( "application/pdf;charset=UTF-8" );

        try
        {
            Document doc = new Document();
            PdfWriter.getInstance( doc, response.getOutputStream() );

            doc.open();
            doc.add( new Paragraph( "Hello World" ) );
            doc.close();
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
}
