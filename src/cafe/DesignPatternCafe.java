package cafe;

/**
 * The only cafe serving out Design Pattern dishes!
 * 
 * Design Patterns used: Singleton
 */
public class DesignPatternCafe {
	private static DesignPatternCafe instance;

	public static DesignPatternCafe getInstance() {
		DesignPatternCafe cafe = instance;

		if (cafe == null) {
			synchronized (DesignPatternCafe.class) {
				cafe = new DesignPatternCafe();
			}
		}
		return cafe;
	}

	public static void main(String args) {
	}
}
