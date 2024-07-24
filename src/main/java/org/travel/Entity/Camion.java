package org.travel.Entity;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehicule {

    private List<Colis> cargaison;

    public Camion(String modele, String immatricule, double killometrage, double poidAVideKg, double longueurMetre, double reserveCarburantLitre) {
        super(modele, immatricule, killometrage, poidAVideKg, longueurMetre, reserveCarburantLitre);

        this.cargaison = new ArrayList<>();
    }

    public void ajouterColis(Colis colis) {
        this.cargaison.add(colis);
    }

    public void retirerColis(Colis colis) {
        this.cargaison.remove(colis);
    }
}
