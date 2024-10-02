package flyweigth.desgin.pattern;

/**
 * The Execution class demonstrates the Flyweight Design Pattern by creating bullets
 * and displaying their properties. This class is final and cannot be subclassed.
 */
public final class Execution {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private Execution() {
    }

    /**
     * The main method is the entry point of the application. It demonstrates
     * creating a bullet type using the BulletFactory and a BulletInAction instance.
     *
     * @param args the command-line arguments (not used in this example)
     */
    public static void main(final String[] args) {
        // Create a BulletFactory to manage BulletType instances
        BulletFactory bulletFactory = new BulletFactory();

        // Create an image for the bullet type (assuming the Image class is defined)
        Image image = new Image();

        // Get a BulletType from the factory
        BulletType type1 = bulletFactory.getBulletType("hello", 50.5, 15.0,
                33.0, "70", "20", image);

        // Create a BulletInAction with the retrieved BulletType
        BulletInAction bullet1 = new BulletInAction(53, 66, 77, 33, 66,
                44, 33, 33, type1);

        // Display the bullet's properties
        bullet1.display();
    }
}
