package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effePotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public String toString() {
		return nom;
	}
	
	public void boirePotion(int forcePotion) {
		effePotion = forcePotion;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force*effePotion / 3);
		if (effePotion>1) {
			effePotion-=1;
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
	}

}