package lieux;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterHabitant(Gaulois gaulois) {
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
    }

    public Gaulois trouverHabitant(int numero) {
        return villageois[numero - 1];
    }

    public void afficherVillageois() {
        System.out.println("Dans " + getNom() + " du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println(" - " + villageois[i].getNom());
        }
    }

    public static void main(String[] args) {
        Village village = new Village("Village des Irréductibles", 30);

        // No Gaulois has been added to the village yet, so the following line will cause an exception
        // Gaulois gaulois = village.trouverHabitant(30);

        Chef abraracourix = new Chef("Abraracourcix", 6,village, 1);
        village.setChef(abraracourix);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);

        // Gaulois gaulois = village.trouverHabitant(1);
        // System.out.println(gaulois);

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(obelix);

        village.afficherVillageois();
    }
}
