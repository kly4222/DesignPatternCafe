package burger.recipe;

import burger.Burger;
import burger.ingredients.Patty;

public class BeefBurgerMaker
	extends
	BurgerMaker {
	@Override
	public Burger makeBurger() {
		return new BeefBurger(this);
	}
}

class BeefBurger
	extends
	Burger {
	public BeefBurger(BurgerMaker b) {
		super(Patty.beef, b);
	}

	@Override
	protected String getFlavour() {
		return "Beef Burger";
	}
}
