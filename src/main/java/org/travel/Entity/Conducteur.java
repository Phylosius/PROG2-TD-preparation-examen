package org.travel.Entity;

public class Conducteur extends Voyageur{

    protected String numPermis;

    public Conducteur(String nom, String prenom, String adresse, String dateNaissance, double poids, String dateVoyage, String numPermis) {
        super(nom, prenom, adresse, dateNaissance, poids, dateVoyage);
        this.numPermis = numPermis;
    }
}
