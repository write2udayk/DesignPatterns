package com.example.strategydesignpattern;
/**
 * The {@code CarPathCalculator} class provides a concrete implementation
 * of the {@link PathCalculator} interface for calculating paths when
 * traveling by car.
 * <p>This class is part of the Strategy Design Pattern, where different
 * strategies are applied for different modes of transportation.
 * The {@code CarPathCalculator}
 * calculates and outputs the path for traveling by car.</p>
 * @author [Uday kv]
 * @version 1.0
 */
public class BikePathCalculator implements PathCalculator {
    /**
     * Calculates the path for traveling by Bike between the given
     * source and destination.
     * <p>This method prints the calculated path distance in kilometers
     * along with the source and destination.</p>
     * @param src  the starting point of the path
     * @param dest the endpoint of the path
     */
    @Override
    public final void pathCalculator(final String src, final String dest) {
        System.out.println("By Bike 12 Km from : " + src + " To : " + dest);

    }

}
