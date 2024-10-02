package flyweigth.desgin.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * BulletFactory is a Flyweight Factory that manages the creation and reuse
 * of BulletType objects. It helps reduce memory usage by ensuring that
 * multiple bullets of the same type share the same intrinsic state.
 */
public class BulletFactory {
    /**
     * A map to store and manage different types of bullets based on
     * their caliber. The key is the bullet caliber, and the value
     * is the corresponding BulletType.
     */
    private final Map<String, BulletType> bulletTypes = new HashMap<>();
    /**
     * Retrieves a BulletType instance based on the given parameters.
     * If a BulletType with the specified caliber does not already exist
     * ,
     * it creates a new BulletType
     * and stores it in the map.
     *
     * @param caliber The caliber/type of the bullet (e.g., "5.56mm","7.62mm").
     * @param damage    The damage value of the bullet.
     * @param range     The maximum range of the bullet before it disappears.
     * @param gravityEffect The gravity effect on the bullet's trajectory.
     * @param hitEffect The visual effect on impact.
     * @param trailEffect The visual trail effect of the bullet.
     * @param image   The image or visual representation of the bullet.
     * @return The BulletType instance with the specified attributes.
     * If it already exists, the existing instance is returned;
     * otherwise, a new instance is created.
     */
    public  BulletType getBulletType(final String caliber, final
        double damage, final  double range,
          final  double gravityEffect, final String hitEffect,
            final String trailEffect, final Image image) {
        if (!bulletTypes.containsKey(caliber)) {
            bulletTypes.put(caliber,
                    new BulletType(damage, range, gravityEffect, caliber,
                            hitEffect, trailEffect, image));
            System.out.println("Creating new BulletType: " + caliber);
        }
        return bulletTypes.get(caliber);
    }
}
