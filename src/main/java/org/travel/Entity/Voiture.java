package org.travel.Entity;

import java.util.List;

public class Voiture extends Vehicule{

    private List<Personne> passagers;
    private final int nombrePlaces;
    private int nombrePassagers;

    public Voiture(String modele, int nombrePlaces, String immatricule, double killometrage, double poidAVideKg, double longueurMetre, double reserveCarburantLitre) {
        super(modele, immatricule, killometrage, poidAVideKg, longueurMetre, reserveCarburantLitre);
        this.nombrePlaces = nombrePlaces;
    }

    public void monter(Personne passager) {
        if (nombrePassagers < this.nombrePlaces) {
            this.passagers.add(passager);
            nombrePassagers++;
        } else {
            throw new RessourceException("place insuffisant");
        }
    }

    public void descendre(Personne passager) {
        if (passagers.contains(passager)) {
            passagers.remove(passager);
            nombrePassagers--;
        } else {
            throw new RessourceException("passager absent");
        }
    }

    public List<Personne> getPassagers() {
        return passagers;
    }

    public void setPassagers(List<Personne> passagers) {
        this.passagers = passagers;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }
}
