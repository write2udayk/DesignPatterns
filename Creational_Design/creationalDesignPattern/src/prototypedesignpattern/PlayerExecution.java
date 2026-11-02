/**
 * The Player_Execution class demonstrates the use of the Prototype Design Pattern
 * by cloning a Player object. It contains the main method to execute the program
 * and a utility method to copy a Player using the clone method.
 * 
 * <p>The {@code CopyPlayer} method clones a given Player object and returns a 
 * copy of the original. In the {@code main} method, a {@code BotPlayer} object is
 * created, cloned using {@code CopyPlayer}, and its details are printed.</p>
 */
package prototypedesignpattern;

public class PlayerExecution {

    /**
     * Clones the given Player object using its {@code clone} method.
     *
     * @param obj the Player object to clone
     * @return a new cloned Player object
     */
    public static Player CopyPlayer(Player obj) {
        return obj.clone();
    }

    /**
     * Main method to execute the program. It creates a {@code BotPlayer} object,
     * clones it, and prints the details of the cloned player.
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        Player bot = new BotPlayer("Nishith", 42, "Kar", "Bang", "Ind", "M16A4");
        Player uday = CopyPlayer(bot); // This works using clone method
        uday.Print();
    }
}
