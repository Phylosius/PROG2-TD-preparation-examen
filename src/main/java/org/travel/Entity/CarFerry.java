package org.travel.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class CarFerry extends Vehicule{
    private List<Vehicule> vehicules;

    public CarFerry(String modele, String immatricule, double killometrage, double poidAVideKg, double longueurMetre, double reserveCarburantLitre) {
        super(modele, immatricule, killometrage, poidAVideKg, longueurMetre, reserveCarburantLitre);
        this.vehicules = new ArrayList<Vehicule>();
    }

    public void embarquer(Vehicule vehicule) {
        this.vehicules.add(vehicule);
    }

    public void debarquer(Vehicule vehicule) {
        this.vehicules.remove(vehicule);
    }

    public AtomicBoolean chercherVoyageur(Voyageur voyageur) {
        AtomicBoolean truth = new AtomicBoolean(false);
        if (getConducteur().equals(voyageur)) {
            truth.set(true);
        } else {
            vehicules.forEach(vehicule -> {
                Object tclass = vehicule.getClass();
                if (vehicule.getClass().equals(Camion.class)) {
                    truth.set(vehicule.getConducteur().equals(voyageur));
                } else if (vehicule.getClass().equals(Voiture.class)) {
                    truth.set(vehicule.getConducteur().equals(voyageur) | ((Voiture) vehicule).getPassagers().contains(voyageur));
                } else {
                    truth.set(false);
                }
            });
        }

        return truth;
    }
}
