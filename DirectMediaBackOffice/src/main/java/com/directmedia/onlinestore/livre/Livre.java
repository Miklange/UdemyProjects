package com.directmedia.onlinestore.livre;

public class Livre
{
    private String nom;

    private int    numeroLivre;

    public Livre()
    {

    }

    public Livre( String nom, int numeroLivre )
    {
        this.nom = nom;
        this.numeroLivre = numeroLivre;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom( String nom )
    {
        this.nom = nom;
    }

    public int getNumeroLivre()
    {
        return numeroLivre;
    }

    public void setNumeroLivre( int numeroLivre )
    {
        this.numeroLivre = numeroLivre;
    }
}
