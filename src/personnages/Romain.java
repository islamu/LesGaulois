
package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipments = new Equipement[2];
		assert (force>= 0)
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force ;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	} 

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	public Equipement[] recevoirCoup(int ForceCoup) {
		Equipement[] EquipementEjecte = null ;
		assert force > 0 ; 
		int olfForce = force ; 
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup; 
		if (force==0)	{
			parler("Aie"); }
		else { 
			equipementEjecte = ejecterEquipement();
			parler("j'abandonne...")
			}
		assert force < oldForce;
		return equipementEjecte ; 
	}
	private int calculResistanceEquipement( int forceCoup) {
		String texte ;
		texte = "Ma force est de "+ this.force + " , et de la force de coup est de " + forceCoup;
		int resistanceEquipement = 0 ;
	
		}
	}
}
