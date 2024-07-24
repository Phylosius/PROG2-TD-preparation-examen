package org.travel.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public abstract class Personne {
    protected String nom;
    protected String prenoms;
    protected LocalDate dateNaissance;
    protected String adresse;
    protected double poids;

    public Personne(String nom, String prenoms, String dateNaissance, String adresse, double poids) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.dateNaissance = LocalDate.parse(dateNaissance);

        this.adresse = adresse;
        this.poids = poids;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dateNaissance.getYear();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    abstract void voyager();
}
