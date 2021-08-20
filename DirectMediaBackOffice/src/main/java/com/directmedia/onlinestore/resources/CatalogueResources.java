package com.directmedia.onlinestore.resources;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

@Path( "/catalogue" )
public class CatalogueResources
{
    @Path( "/liste" )
    @GET
    @Produces( MediaType.APPLICATION_JSON )
    public Set<Work> liste()
    {
        // Add only if empty at beginning
        if ( Catalogue.listOfWork.isEmpty() )
        {
            Artist artistA = new Artist( "Michael Jackson" );
            Artist artistB = new Artist( "J.J. Goldman" );
            Artist artistC = new Artist( "Maitre Gims" );

            Work oeuvreA = new Work( "Thriller" );
            oeuvreA.setMainArtist( artistA );
            oeuvreA.setGenre( "Pop" );
            oeuvreA.setSummary( "C'est de la bombe" );
            oeuvreA.setRelease( 1980 );

            Work oeuvreB = new Work( "Traces" );
            oeuvreB.setMainArtist( artistB );
            oeuvreB.setGenre( "Pop Rock" );
            oeuvreB.setSummary( "Les enfoirés" );
            oeuvreB.setRelease( 1989 );

            Work oeuvreC = new Work( "Subliminal" );
            oeuvreC.setMainArtist( artistC );
            oeuvreC.setGenre( "Rap" );
            oeuvreC.setSummary( "Wesh !" );
            oeuvreC.setRelease( 2013 );

            Catalogue.listOfWork.add( oeuvreA );
            Catalogue.listOfWork.add( oeuvreB );
            Catalogue.listOfWork.add( oeuvreC );
        }

        return Catalogue.listOfWork;
    }
}
