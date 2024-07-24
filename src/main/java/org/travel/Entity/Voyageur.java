package org.travel.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Voyageur extends Personne {

    protected LocalDate dateVoyage;

    public Voyageur(String nom, String prenom, String adresse, String dateNaissance, double poids, String dateVoyage) {
        super(nom, prenom, dateNaissance, adresse, poids);
        this.dateVoyage = LocalDate.parse(dateVoyage);

    }

    @Override
    void voyager() {
        System.out.println("En voyage");
    }
}
