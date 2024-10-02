package flyweigth.desgin.pattern;

/**
 * Represents the type of a bullet, containing properties such as damage,
 * range, gravity effect, caliber, and visual effects like hit and
 * trail effects.
 */
public class BulletType {

    /**
     * The damage caused by the bullet upon impact.
     */
    private final double damage;

    /**
     * The maximum range of the bullet in meters.
     */
    private final double range;

    /**
     * The effect of gravity on the bullet's trajectory.
     */
    private final double gravityEffect;

    /**
     * The caliber of the bullet (e.g., 9mm, .50 caliber).
     */
    private final String caliber;

    /**
     * The visual effect or animation when the bullet hits a target.
     */
    private final String hitEffect;

    /**
     * The visual effect or trail left behind as the bullet moves through space.
     */
    private final String trailEffect;

    /**
     * An image representing the bullet type for display purposes.
     */
    private final Image image;

    /**
     * Constructs a new BulletType instance with the specified attributes.
     *
     * @param damage the damage caused by the bullet
     * @param range the maximum range of the bullet
     * @param gravityEffect the effect of gravity on the bullet's trajectory
     * @param caliber the caliber of the bullet
     * @param hitEffect the visual effect when the bullet hits a target
     * @param trailEffect the visual trail left behind by the bullet
     * @param image an image representing the bullet
     */
    public BulletType(final double damage,final  double range,
        final  double gravityEffect,final String caliber, final
        String hitEffect, final String trailEffect,final
        Image image) {
        this.damage = damage;
        this.range = range;
        this.gravityEffect = gravityEffect;
        this.caliber = caliber;
        this.hitEffect = hitEffect;
        this.trailEffect = trailEffect;
        this.image = image;
    }

    /**
     * Returns the damage caused by the bullet.
     *
     * @return the damage value
     */
    public double getDamage() {
        return damage;
    }

    /**
     * Returns the maximum range of the bullet.
     *
     * @return the range in meters
     */
    public double getRange() {
        return range;
    }

    /**
     * Returns the effect of gravity on the bullet's trajectory.
     *
     * @return the gravity effect value
     */
    public double getGravityEffect() {
        return gravityEffect;
    }

    /**
     * Returns the caliber of the bullet.
     *
     * @return the bullet caliber as a string
     */
    public String getCaliber() {
        return caliber;
    }

    /**
     * Returns the visual effect or animation when the bullet hits a target.
     *
     * @return the hit effect as a string
     */
    public String getHitEffect() {
        return hitEffect;
    }

    /**
     * Returns the visual trail left behind by the bullet.
     *
     * @return the trail effect as a string
     */
    public String getTrailEffect() {
        return trailEffect;
    }

    /**
     * Returns the image representing the bullet type.
     *
     * @return the image representing the bullet
     */
    public Image getImage() {
        return image;
    }
}
