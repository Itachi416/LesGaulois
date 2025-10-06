package test_fonctionnel;

import personnage.Gaulois;
import personnage.Romain;
import personnage.Druide;
import personnage.Chaudron;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("brutus", 14);
		Druide Panoramix = new Druide("Panoramix", 2);

		
		
		Panoramix.fabriquerPotion(4,3);
		Panoramix.boosterGaulois(obelix);
		Panoramix.boosterGaulois(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}

	}

}
