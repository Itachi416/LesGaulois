package personnage;

public class Druide {
private String nom;
private int force;
private Chaudron chaudron = new Chaudron(0,0);



public Druide(String nom, int force) {
	this.nom = nom;
	this.force = force;
}
public String getNom() {
	return nom;
}

private String prendreParole() {
	return "Le Druide " + nom + " :";
}

public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
}

public void fabriquerPotion(int quantite, int forcePotion) {
	chaudron.remplirChaudron( quantite,  forcePotion);
}

public void boosterGaulois(Gaulois gaulois) {
	if (chaudron.resterPotion()) {
		if (gaulois.getNom() == "Obélix") {
			System.out.println("Non,"+gaulois.getNom()+" Non !...Et tu le sais très bien !");
		}else {
			gaulois.boirePotion(chaudron.prendreLouche());
			System.out.println("Tient "+gaulois.getNom()+" un peu de potion magique.");
		}
	}else {
		System.out.println("Désolé "+gaulois.getNom()+" il n'y a plus une seule goutte de potion.");
	}
}












}
