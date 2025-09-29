package personnage;

public class Druide {
private String nom;
private int force;



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

public void parler(int texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
}

public void fabriquerPotion(int quantite, int forcePotion) {
	Chaudron magique = new Chaudron(quantite,forcePotion);
	magique.remplirChaudron(quantite, forcePotion);
}












}
