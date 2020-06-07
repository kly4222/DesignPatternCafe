package toy.lightsaber;

import java.awt.Color;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Design Patterns: Prototype
 */
public class LightSaber
	implements
	Cloneable {
	private static AtomicInteger idGenerator = new AtomicInteger();

	private Color colour;
	private boolean doubleBladed;

	// Only LightSaber prototypes should have IDs = 0.
	private int id;

	LightSaber(Color colour, boolean doubleBladed) {
		this.colour = colour;
		this.doubleBladed = doubleBladed;
		this.id = 0;
	}

	private LightSaber(LightSaber prototype) {
		this.colour = prototype.colour;
		this.doubleBladed = prototype.doubleBladed;
		this.id = idGenerator.incrementAndGet();
	}

	@Override
	public LightSaber clone() {
		return new LightSaber(this);
	}

	public Color getColour() {
		return this.colour;
	}

	public boolean isDoubleBladed() {
		return this.doubleBladed;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (this.doubleBladed) {
			sb.append("Double-Bladed ");
		}
		sb.append(this.colour.toString().toUpperCase());
		sb.append(" Lightsaber (ID: " + this.id + ")");
		return sb.toString();
	}
}
