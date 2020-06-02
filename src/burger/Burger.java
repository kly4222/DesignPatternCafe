package burger;

import java.util.List;
import java.util.stream.Collectors;

import burger.ingredients.Bun;
import burger.ingredients.Patty;
import burger.ingredients.Sauce;
import burger.ingredients.Vegetable;
import burger.recipe.BurgerMaker;

public abstract class Burger {
	private final Patty patty;
	private final Bun bun;
	private final List<Sauce> sauces;
	private final List<Vegetable> vegetables;

	protected Burger(Patty patty, BurgerMaker b) {
		this.patty = patty;
		this.bun = b.getBun();
		this.sauces = b.getSauces();
		this.vegetables = b.getVegetables();
	}

	protected abstract String getFlavour();

	@Override
	public String toString() {
		String s = "Burger Flavour: " + this.getFlavour()
			+ "\n\tBun: " + this.bun
			+ "\n\tPatty: " + this.patty
			+ "\n\tSauce: " + this.sauces.stream().map(sauce -> sauce.name()).collect(Collectors.joining(", "))
			+ "\n\tVegetables: " + this.vegetables.stream().map(sauce -> sauce.name()).collect(Collectors.joining(", "));
		return s;
	}
}
