package decorator.desgin.pattern;

/**
 * A concrete implementation of IIceCream Interface representing a cake cone in
 * the decorator desgin pattern This class provides cost and description of a
 * basic cake cone without any additional toppings or decorations.
 */

public class CakeCone implements IIceCream {

    /**
     * final variable to return cost.
     */
    public static final double COST  = 30.0;

    /**
     * return cost of the cake cone.
     * @return cost of the cake cone as double (30.0)
     */
    @Override
    public double getCost() {
        return COST;
    }

    /**
     * return description of the cake cone.
     * @return description of the cake cone as String ("Cake Cone")
     */

    @Override
    public String getDescription() {
        return "Cake Cone";
    }

}
