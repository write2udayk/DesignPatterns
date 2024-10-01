package decorator.desgin.pattern;

/**
 * Interface represnting an a ice cream Decorator desgin pattern.
 * This interfaceprovides the methods to cost and description of
 * an Ice Cream , which can be decorated with additional features
 */
public interface IIceCream {

    /**
     * Get cost of the Ice Cream.
     * @return cost of an Ice Cream as double
     */

    double getCost();

    /**
     * Get description of the Ice Cream.
     * @return description of an Ice Cream
     */
     String getDescription();

}
