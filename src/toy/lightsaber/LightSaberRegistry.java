package toy.lightsaber;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 * Design Patterns: Singleton
 */
public class LightSaberRegistry {
	private static LightSaberRegistry registry;

	public static LightSaberRegistry getInstance() {
		LightSaberRegistry instance = registry;

		if (instance == null) {
			synchronized (LightSaberRegistry.class) {
				instance = new LightSaberRegistry();
			}
		}
		return null;
	}

	private final Set<LightSaber> lightsabers = new HashSet<LightSaber>();

	public LightSaber getLightSaber(final Color c, final boolean doubleBladed) {
		for (final LightSaber saber : this.lightsabers) {
			if (saber.getColour().equals(c) && saber.isDoubleBladed() == doubleBladed) {
				return saber;
			}
		}
		// LightSaber configuration is not in the registry: add one.
		final LightSaber saber = new LightSaber(c, doubleBladed);
		this.lightsabers.add(saber);
		return saber;
	}
}
