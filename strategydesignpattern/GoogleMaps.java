package com.example.strategydesignpattern;
/**
 * The {@code GoogleMaps} class simulates the process of finding a path
 * between two locations based on the selected {@link TransportationMode}.
 * <p>This class works with the {@link PathCalculatorFactory} to retrieve
 * the appropriate {@link PathCalculator} implementation based on the mode
 * of transportation, and then uses that calculator to determine the path
 * between the source and destination.</p>
 <p>If the specified mode of transportation is not supported,
 *  an error message will be printed to indicate that no path
 *   calculator is available for the selected mode.</p>
 * @author [Your Name]
 * @version 1.0
 */
public class GoogleMaps {
    /**
     * Finds the path between the source and destination based on
     * the selected  {@link TransportationMode}.
     * <p>This method uses the {@link PathCalculatorFactory} to
     * obtain the appropriate path calculator for the given transportation
     * mode. If no valid path calculator is available for the selected mode,
     *  an error message is printed.</p>
     * @param src  the starting location
     * @param dist the destination location
     * @param mode the mode of transportation for which to calculate the path
     */
    public void findPath(final String src, final String dist,
             final TranspartationMode mode) {
    PathCalculator pc = PathCalculatorFactory.getPathCalculatorForMode(mode);
        if (pc != null) {
            pc.pathCalculator(src, dist);
        } else {
            System.out.println("No PathCalculator available for the"
                    + " selected transportation mode");
        }
    }

}
