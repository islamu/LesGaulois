package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) * effectPotion);
		for (int i=0 ; trophees != null && i<trophees.length;i++,nbTrophees++) {
			this.trophees[nbTrophees]= trophees[i];
	}
	}
	public void boirePortion(int forcePotion) {
		effetPotion=+forcePotion;
		parler("Merci Druide , je sens que ma force est "+forcePotion + "fois decuplee.");
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("hehe");
		asterix.boirePotion(6);
		// TODO cr�er un main permettant de tester la classe Gaulois
		    
	}
}
}


