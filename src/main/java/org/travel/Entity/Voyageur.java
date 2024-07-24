package org.travel.Entity;

import java.util.Date;

public class Voyageur extends Personne {

    protected Date dateVoyage;

    public Voyageur(String nom, String prenom, String adresse, String dateNaissance, double poids, String dateVoyage) {
        super(nom, prenom, adresse, dateNaissance, poids);
        this.dateVoyage = new Date(dateVoyage);

    }

    @Override
    void voyager() {
        System.out.println("En voyage");
    }
}
