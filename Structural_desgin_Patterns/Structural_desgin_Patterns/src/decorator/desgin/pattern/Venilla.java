package decorator.desgin.pattern;

/**
 * A concrete decorator class in the Decorator Design Pattern, representing a
 * Mango flavor added to an Ice Cream. This class decorates an existing Ice
 * Cream by adding a Mango flavor and updating the cost and description
 * accordingly.
 */

public class Venilla implements IIceCream {
    /**
     * final variable to return cost.
     */
    public static final double COST  = 27.0;
    /**
     * the base IceCream that is being docorated.
     */

    private IIceCream iceCream;

    /**
     * Constructs a venilla decorator for the given Ice Cream.
     * @param baseIceCream the Ice Cream to be decorated with Venilla flavor.
     */
    public Venilla(final IIceCream baseIceCream) {
        this.iceCream = baseIceCream;
    }

    /**
     * return cost of an Ice Cream including the Venilla flavor.
     * @return the updated cost of the ice Cream with Vennila flavor,
     * adding 27.0 to the base cost.
     */
    @Override
    public double getCost() {
        return iceCream.getCost() + COST;
    }

    /**
     * return description of an Ice Cream including the venilla flavor added.
     * @return a String describing the Ice Cream, appending "venilla"
     * to the base description.
     */
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", " + "Venilla";
    }
}
