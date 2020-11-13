package gr.wine.store;

import gr.wine.store.model.NonAlcoholDrink;
import gr.wine.store.model.Whiskey;
import gr.wine.store.model.Wine;

public class Main {

	public static void main(String[] args) {
		
		NonAlcoholDrink denpinetaiaytotoprama = new NonAlcoholDrink(1, "Non alcohol beer");
		System.out.println(denpinetaiaytotoprama);
		
		Wine saintgeorge = new Wine(2, "Agiou Gewrgiou", 0.1, "Erythro");
		System.out.println(saintgeorge);
		
		Whiskey chivas = new Whiskey(3, "chivas", 0.20, 10);
		System.out.println(chivas);
	}

}
