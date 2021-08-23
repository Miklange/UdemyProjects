package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup
{

    public static void main( String[] args )
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

        // Afficher la liste
        for ( Work work : Catalogue.listOfWork )
        {
            System.out.println( work );
        }
    }
}
