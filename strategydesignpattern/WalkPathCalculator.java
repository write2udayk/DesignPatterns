package com.example.strategydesignpattern;
/**
 * The {@code WalkPathCalculator} class provides a concrete implementation
 * of the {@link PathCalculator} interface for calculating paths when
 * traveling by car.
 * <p>This class is part of the Strategy Design Pattern, where different
 * strategies are applied for different modes of transportation.
 * The {@code WalkPathCalculator}
 * calculates and outputs the path for traveling by car.</p>
 * @author [Uday kv]
 * @version 1.0
 */
public class WalkPathCalculator implements PathCalculator {

    @Override
    public final void pathCalculator(final String src, final String dest) {
        System.out.println("By Walk 10 Km from : " + src
                + " to : " + dest);
    }

}
