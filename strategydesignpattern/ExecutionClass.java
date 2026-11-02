package com.example.strategydesignpattern;
/**
 * The {@code ExecutionClass} is the entry point of the application
 * that demonstrates the usage of the {@link GoogleMaps} class to find
 * a path between two locations using different transportation modes.
 * <p>This class contains the main method where the application starts.
 * It creates an instance of {@code GoogleMaps} and uses it to calculate
 * a path based on the specified source and destination.</p>
 * @author [Your Name]
 * @version 1.0
 */
public final class ExecutionClass {
     private ExecutionClass() {
    }
     /**
      * The main method is the entry point of the application.
      *
      * @param args command-line arguments passed to the application (not used)
      */
     public static void main(final String[] args) {
             GoogleMaps gm = new GoogleMaps();
                 gm.findPath("Yelahanka", "Navagara",
                         TranspartationMode.PUBLIC_TRANSPORTATION);
     }

}
