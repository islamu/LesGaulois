
package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements ;
	private int nbEquipement = 0 ; 

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	} 

//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		break;
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
		}
	private int CalculResistanceEquipement(int forceCoup) {
		String texte ; 
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace a mon équipement sa force est diminue de ";
		    for (int i = 0; i < nbEquipement ; i++) {
		    	if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
		    		resistanceEquipement += 8;
		    } else {
		    		System.out.println("Equipement casque");
		    		resistanceEquipement += 5;
		    	}
		    }
		    texte =+ resistanceEquipement + "!";

		
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'equipement de " + nom.toString() + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] =equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null; }
		}
		return equipementEjecte;
		}
	public void presente(String text ) {
		System.out.println("Le soldat"+ text+ ".");
		
	}
	public void equipe(Equipement equip) {
		presente("s'quipe avec un " + equip.getNom());
		nbEquipement ++ ; 
		equipements[nbEquipement-1]= equip; 
		
	}
	public void sEquiper(Equipement equip) {
		switch(nbEquipement) {
		case 2 : 
			presente("est deja protegee !");
			break;
		case 1 : 
			if (equip == equipements[0]) {
				presente("possede deja un" + equip.getNom());
			}else {
				equipe(equip);
			}
			break;
		case 0 : 
			equipe(equip);
			break ; 
			
			}
		}
@Override 
   public String toString() {
	   return "Romain [ nom = " + nom + ", force = "+force+ "]" ;
}
	

   public static void main(String[] args) {
	   Romain minus = new Romain("Minus",6); 
	   minus.nom="minus"; 
	   minus.force=6; 
	   System.out.println(minus);
	   System.out.println(minus.prendreParole());
	   minus.parler("hoho");
	   minus.recevoirCoup(2);
	   System.out.println(minus);
	   System.out.println(Equipement.CASQUE);
	   System.out.println(Equipement.BOUCLIER);
	   minus.sEquiper(Equipement.CASQUE);
	   minus.sEquiper(Equipement.CASQUE);
	   minus.sEquiper(Equipement.BOUCLIER);
	   minus.sEquiper(Equipement.CASQUE);



	
}
	}



