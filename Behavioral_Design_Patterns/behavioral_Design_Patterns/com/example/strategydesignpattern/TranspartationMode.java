package com.example.strategydesignpattern;

/**
 * The {@code TransportationMode} enum represents the various modes
 * of transportation that can be used in the application.
 * <p>This enum is used by the {@link PathCalculatorFactory} to
 * determine the appropriate {@link PathCalculator} strategy for
 * calculating paths based on the transportation
 * mode selected by the user.</p>
 * <p>Supported transportation modes include:</p>
 * <ul>
 *   <li>{@link #CAR}</li>
 *   <li>{@link #BIKE}</li>
 *   <li>{@link #PUBLIC_TRANSPORTATION}</li>
 *   <li>{@link #WALK}</li>
 * </ul>
 * @author [Your Name]
 * @version 1.0
 */
public enum TranspartationMode {
    /**
     * Car transportation mode.
     */
    CAR,

    /**
     * Bike transportation mode.
     */
    BIKE,

    /**
     * Public transportation mode.
     */
    PUBLIC_TRANSPORTATION,

    /**
     * Walking mode.
     */
    WALK
}
