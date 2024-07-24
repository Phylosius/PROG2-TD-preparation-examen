package org.travel.Entity;

public class Colis {
    private String description;
    private double poids;

    public Colis(String description, double poids) {
        this.description = description;
        this.poids = poids;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
}
