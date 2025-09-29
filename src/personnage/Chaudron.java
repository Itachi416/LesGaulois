package personnage;

public class Chaudron {
private int quantitePotion;
private int forcePotion;

public Chaudron(int quantitePotion, int forcePotion) {
	this.quantitePotion = quantitePotion;
	this.forcePotion = forcePotion;
}


public void remplirChaudron(int quantite, int forcePotion) {
	System.out.println("J'ai concoté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	quantitePotion = quantite;
	this.forcePotion = forcePotion;
}

public Boolean resterPotion() {
	if (quantitePotion > 0){
		return true;
	}else {
		return false;
}
}
}





