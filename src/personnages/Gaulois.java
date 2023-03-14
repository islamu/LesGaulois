package personnages;

public class Gaulois {
	private String nom;
	private int nbTrophees;
	private Equipement trophees[] = new Equipement[100];
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
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    Equipement[] nouveauxTrophees = romain.recevoirCoup((force / 3) * effetPotion);
	    for (int i = 0; i < nouveauxTrophees.length && nbTrophees < trophees.length; i++, nbTrophees++) {
	        trophees[nbTrophees] = nouveauxTrophees[i];
	    }
	}
	public void boirePotion(int forcePotion) {
		effetPotion=+forcePotion;
		parler("Merci Druide , je sens que ma force est "+forcePotion + "fois decuplee.");
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("hehe");
		asterix.boirePotion(6);
        System.out.println(asterix.getNom());
        System.out.println(asterix);
        System.out.println(asterix.prendreParole());
        asterix.parler("hehe");
        asterix.boirePotion(6);

        Romain titus = new Romain("Titus", 6);
        System.out.println(titus.getNom());
        System.out.println(titus);
        titus.parler("J'en ai vu d'autres !");

        }
		
	}





