package flyweigth.desgin.pattern;
/**
 * The BulletInAction class represents a bullet in action with its position,
 * direction, velocity, lifespan, and bullet type.
 * This class is part of the Flyweight Design Pattern.
 */

public class BulletInAction {
    /**
     * The x-coordinate of the bullet's position in space.
     */
    private final double positionX;

    /**
     * The y-coordinate of the bullet's position in space.
     */
    private final double positionY;

    /**
     * The z-coordinate of the bullet's position in space.
     */
    private final double positionZ;

    /**
     * The x-component of the bullet's direction vector.
     */
    private final double directionX;

    /**
     * The y-component of the bullet's direction vector.
     */
    private final double directionY;

    /**
     * The z-component of the bullet's direction vector.
     */
    private final double directionZ;

    /**
     * The velocity of the bullet, determining how fast it moves.
     */
    private final double velocity;

    /**
     * The lifespan of the bullet, representing how long the bullet
     * exists in seconds.
     */
    private final double lifeSpan;

    /**
     * The type of bullet, containing details such as caliber, damage,
     * and range.
     */
    private final BulletType bulletType;

    /**
     * Constructs a new BulletInAction instance with the specified parameters.
     * @param positionx the x-coordinate of the bullet's position
     * @param positiony the y-coordinate of the bullet's position
     * @param positionz the z-coordinate of the bullet's position
     * @param directionx the x-component of the bullet's direction
     * @param directiony the y-component of the bullet's direction
     * @param directionz
     * the z-component of the bullet's direction
     * @param veloCity the velocity of the bullet
     * @param lifespan the lifespan of the bullet in seconds
     * @param bullettype the type of bullet, defined by the BulletType class
     */
    public BulletInAction(final double positionx, final double positiony,
            final double positionz, final double directionx, final double
            directiony, final double directionz, final double veloCity,
            final double lifespan,
            final BulletType bullettype) {
        this.positionX = positionx;
        this.positionY = positiony;
        this.positionZ = positionz;
        this.directionX = directionx;
        this.directionY = directiony;
        this.directionZ = directionz;
        this.velocity = veloCity;
        this.lifeSpan = lifespan;
        this.bulletType = bullettype;
    }

    /**
     * Displays the bullet's position, direction, velocity, lifespan, and type.
     * This method prints out the current status of the bullet in action.
     */
    public void display() {
        System.out.println("Bullet Position at (" + positionX + ", "
    + positionY + ", " + positionZ + ")");
        System.out.println("Direction (" + directionX + ", " + directionY
        + ", " + directionZ + "), Velocity: " + velocity);
        System.out.println("Lifespan: " + lifeSpan + " seconds");
        System.out.println("Bullet Type: " + bulletType.getCaliber()
        + ", Damage: " + bulletType.getDamage() + ", Range: "
                + bulletType.getRange());
    }
}

