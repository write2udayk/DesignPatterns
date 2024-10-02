package decorator.desgin.pattern;


/**
 * The ExecutionClass serves as the entry point for the application,
 * demonstrating the use of the Decorator Design Pattern with different
 * types of ice cream. It creates a hierarchy of ice cream objects,
 * calculates the total cost, and prints the description of the
 * ice cream combination.
 */

 public final  class ExecutionClass {
     private ExecutionClass() {
     }
     /**
      * The main method serves as the entry point for the program.
      * It creates a combination of ice cream objects (CakeCone, ChocolateCone
      * , and Mango),
      * calculates the total cost, and prints the description of the ice cream.
      * @param args command-line arguments (not used)
      */
    public static void main(final String[] args) {
        Venilla venilla =
        new Venilla(new ChocolateCone(new Mango(new CakeCone())));
        System.out.println("Total Cost: " + venilla.getCost());
        System.out.println("Description: " + venilla.getDescription());
    }

}
