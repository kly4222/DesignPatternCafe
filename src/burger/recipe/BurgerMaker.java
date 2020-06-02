package burger.recipe;

import java.util.ArrayList;
import java.util.List;

import burger.Burger;
import burger.ingredients.Bun;
import burger.ingredients.Sauce;
import burger.ingredients.Vegetable;

/**
 * Design Patterns used: Builder
 */
abstract public class BurgerMaker {
	private Bun bun;
	private List<Sauce> sauces = new ArrayList<Sauce>();
	private List<Vegetable> vegetables = new ArrayList<Vegetable>();

	public Bun getBun() {
		return this.bun;
	}

	public List<Sauce> getSauces() {
		return this.sauces;
	}

	public List<Vegetable> getVegetables() {
		return this.vegetables;
	}

	public void setBun(Bun bun) {
		this.bun = bun;
	}

	public void addSauce(Sauce sauce, Sauce... extras) {
		this.sauces.add(sauce);
	}

	public void addVegetable(Vegetable veg, Vegetable extras) {
		this.vegetables.add(veg);
	}

	public abstract Burger makeBurger();
}
