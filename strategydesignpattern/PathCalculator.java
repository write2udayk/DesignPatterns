package com.example.strategydesignpattern;

/**
 * The {@code PathCalculator }Interface defines a method that all
 * Path Calculator must implement. It is Strategy Design Pattern
 * Where different transportation modes have different Path Calculator
 * strategies
 * <p>This interface ensures that every concrete implementation provides
 * a method to calculate the path between a source and a destination.</p>
 * <p>Each implementation will handle the path calculation based on the
 * transportation mode, such as a car, bike, or public transportation.</p>
 * * @author [Uday kv]
 * @version 1.0
 */

public interface PathCalculator {
    /**
     * Calculates the path between given source and destination.
     * @param src is starting point of the path
     * @param dest id ending point of the path
     */
     void pathCalculator(String src, String dest);
}
