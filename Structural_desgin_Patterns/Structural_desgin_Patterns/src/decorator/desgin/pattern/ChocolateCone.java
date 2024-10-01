package decorator.desgin.pattern;

/**
 * A concrete implementation of IIceCream Interface representing
 * a Chocolate cone inthe decorator desgin pattern This class provides
 * cost and description of a basic cake cone without any additional
 * toppings or decorations.
 */


public final class ChocolateCone implements IIceCream {
    /**
     * define a constant for COST.
     */
     private static final double COST = 30.0;
    /**
     * The base Ice Cream that is being decorated.
     */
    private IIceCream iceCream;

    /**
     * Constructs a ChocolateCone decorator for the given Ice Cream.
     * @param baseIceCream the Ice Cream to be decorated with a Chocolate Cone.
     */
    public ChocolateCone(final IIceCream baseIceCream) {

        this.iceCream = baseIceCream;
    }

    /**
     * return cost of the cake cone.
     * @return cost of the cake cone as double (30.0)
     */
    @Override
    public double getCost() {

        return iceCream.getCost() + COST;
    }

    /**
     * return description of the cake cone.
     * @return description of the cake cone as String ("Cake Cone")
     */

    @Override
    public String getDescription() {

        return iceCream.getDescription() + ", " + "Chocolate Cone";
    }

}
