package lieux;

public class Village {
	private String nom ;
	private Chef chef ; 
	private Gaulois[] villageois ; 
	private int nbVillageois ; 
	public Village(String nom , int nbVillageoisMaximum ) {
		this.nom = nom ;
		this.Villageois= new Gaulois[nbVillageois];
		
	}
	public void setChef(Chef chef) {
		this.chef = chef ; 
		
	}
	public String getNom() {
		return nom ; 
		
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois ; 
		nbVillageois += 1 ; 
		
	}
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero-1]
				
	}
	public void afficherVillageois() {
		int i ; 
		System.out.println("Dans "+getNom()+"du chef"+chef.getNom()+"vivent les legendaires gaulois : ");
		for (i=0;i <nbVillageois ; i++) {
			System.out.println(" - "+ villageois[i].getNom());
		}
	}
	public static void main(String[] args ) {
		Village village = new Village("Village des Irreductibles",30);
		
//      Gaulois gaulois = village.trouverHabitant(30);
//      aucun gaulois n'a ete mit dans le village donc cette case est vide
		Chef abraracourix = new Chef("Abraracourcix",6,1, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix); 
//      Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}

  
