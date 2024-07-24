package org.travel.Entity;

import java.util.List;

public class Vehicule {
    protected String modele;
    protected String immatricule;
    protected double killometrage;
    protected double poidAVideKg;
    protected double longueurMetre;
    protected double reserveCarburantLitre;
    protected Conducteur conducteur;
    protected List<Personne> Passagers;
    protected double coutCarburantKm;

    public Vehicule(String modele, String immatricule, double killometrage, double poidAVideKg, double longueurMetre, double reserveCarburantLitre) {
        this.modele = modele;
        this.immatricule = immatricule;
        this.killometrage = killometrage;
        this.poidAVideKg = poidAVideKg;
        this.longueurMetre = longueurMetre;
        this.reserveCarburantLitre = reserveCarburantLitre;
        this.coutCarburantKm = 15d;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatricule() {
        return immatricule;
    }

    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }

    public double getKillometrage() {
        return killometrage;
    }

    public void setKillometrage(double killometrage) {
        this.killometrage = killometrage;
    }

    public double getPoidAVideKg() {
        return poidAVideKg;
    }

    public void setPoidAVideKg(double poidAVideKg) {
        this.poidAVideKg = poidAVideKg;
    }

    public double getLongueurMetre() {
        return longueurMetre;
    }

    public void setLongueurMetre(double longueurMetre) {
        this.longueurMetre = longueurMetre;
    }

    public double getReserveCarburantLitre() {
        return reserveCarburantLitre;
    }

    public void setReserveCarburantLitre(double reserveCarburantLitre) {
        this.reserveCarburantLitre = reserveCarburantLitre;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public boolean setConducteur(Conducteur conducteur) {
        // verify conducteur age
        if (conducteur.getAge() >= 18) {
            this.conducteur = conducteur;
            return true;
        }
        return false;
    }

    public boolean changerConducteur(Conducteur conducteur) {
        return setConducteur(conducteur);
    }

    public double getPoidsPassagers() {
        return Passagers.stream().mapToDouble(Personne::getPoids).sum();
    }

    public double getPoidsCarburant() {
        return reserveCarburantLitre;
    }

    public double getPoidsConducteur() {
        if (conducteur.getPoids() > 0) {
            return conducteur.getPoids();
        }
        return 0d;
    }

    public void addPassagers(Personne personne) {
        Passagers.add(personne);
    }

    public double getPoids() {
        return poidAVideKg + getPoidsPassagers() + getPoidsCarburant() + getPoidsConducteur();
    }

    public void allerAlaPompe(double litreCarburant) {
        if (litreCarburant > 0d) {
            setReserveCarburantLitre(litreCarburant + getReserveCarburantLitre());
        }
    }

    public void rouler(double distanceKm) {
        if (distanceKm > 0) {
            if (getPoidsConducteur() > 0) {
                double consommationCarburant = distanceKm * coutCarburantKm;
                if (reserveCarburantLitre - consommationCarburant >= 0) {
                    reserveCarburantLitre -= consommationCarburant;
                } else {
                    throw new RessourceException("carburnat insuffisant");
                }
            } else {
                throw new RessourceException("conducteur absent");
            }
        }
    }
}
