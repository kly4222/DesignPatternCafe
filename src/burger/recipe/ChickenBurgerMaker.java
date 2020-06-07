package burger.recipe;

import burger.Burger;
import burger.ingredients.Patty;

public class ChickenBurgerMaker
	extends
	BurgerMaker {
	@Override
	public Burger makeBurger() {
		return new ChickenBurger(this);
	}
}

class ChickenBurger
	extends
	Burger {
	public ChickenBurger(BurgerMaker b) {
		super(Patty.chicken, b);
	}

	@Override
	protected String getFlavour() {
		return "Chicken Burger";
	}
}
