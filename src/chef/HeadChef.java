package chef;

import burger.Burger;
import burger.recipe.BurgerMaker;

/**
 * HeadChef, the only chef at Design Patterns Pizzas. Design Patterns used:
 * Singleton
 */
public class HeadChef {
	private static volatile HeadChef instance;

	private BurgerMaker currentRecipe;

	private HeadChef() {
	}

	public void setCurrentRecipe(BurgerMaker newRecipe) {
		this.currentRecipe = newRecipe;
	}

	public Burger makeBurger() {
		return this.currentRecipe.makeBurger();
	}

	public static HeadChef getInstance() {
		if (instance == null) {
			synchronized (HeadChef.class) {
				if (instance == null) {
					instance = new HeadChef();
				}
			}
		}
		return instance;
	}
}
