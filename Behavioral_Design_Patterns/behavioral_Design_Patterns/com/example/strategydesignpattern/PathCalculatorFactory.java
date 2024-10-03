package com.example.strategydesignpattern;

/**
 * The {@code PathCalculatorFactory} class is a factory for creating instances
 * of {@link PathCalculator} based on the specified {@link TransportationMode}.
 * <p>
 * This class implements the Factory Design Pattern, allowing the application to
 * create different path calculator strategies for various modes of
 * transportation without needing to know the concrete classes being
 * instantiated.
 * </p>
 * <p>
 * Supported transportation modes include:
 * </p>
 * <ul>
 * <li>Car</li>
 * <li>Bike</li>
 * <li>Walk</li>
 * <li>Public Transportation</li>
 * </ul>
 * @author [Your Name]
 * @version 1.0
 */
public final class PathCalculatorFactory {
    private PathCalculatorFactory() {
    }
    /**
     * Returns a {@link PathCalculator} instance based on the specified
     * transportation mode.
     * @param mode the mode of transportation for which to get the
     *  path calculator
     * @return an instance of {@link PathCalculator} for the specified mode, or
     *{@code null} if the mode is not recognized
     */
    public static PathCalculator getPathCalculatorForMode(
            final TranspartationMode mode) {
        if (mode == TranspartationMode.CAR) {
            return new CarPathCalculator();
        } else if (mode == TranspartationMode.BIKE) {
            return new BikePathCalculator();
        } else if (mode == TranspartationMode.WALK) {
            return new WalkPathCalculator();
        } else if (mode == TranspartationMode.PUBLIC_TRANSPORTATION) {
            return new PublicTransportPathCalculator();
        }
        return null;

    }

}
