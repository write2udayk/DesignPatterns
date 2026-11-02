/**
 * Represents a concrete implementation of the Player class in the Prototype
 * Design Pattern. The BotPlayer class adds additional functionality specific to
 * a bot player, such as a weapon attribute. This class demonstrates the cloning
 * behavior by implementing the {@code clone} method using the copy constructor.
 * 
 * <p>This class serves as a specific prototype of a player with additional state
 * (weapon) that can be cloned. It overrides the {@code clone} method to create
 * a new instance of {@code BotPlayer} by copying the attributes of an existing
 * one.</p>
 */
package prototypedesignpattern;

public class BotPlayer extends Player {

    private String weapon;

    /**
     * Constructs a new BotPlayer with the specified name, age, state, district,
     * nationality, and weapon details.
     *
     * @param name   the name of the bot player
     * @param age    the age of the bot player
     * @param state  the state of residence of the bot player
     * @param dist   the district of residence of the bot player
     * @param nation the nationality of the bot player
     * @param weapon the weapon attribute associated with the bot player
     */
    public BotPlayer(String name, int age, String state, String dist, String nation, String weapon) {
        super(name, age, state, dist, nation);
        this.weapon = weapon;
    }

    /**
     * Copy constructor to create a new BotPlayer instance as a copy of an existing
     * one. This constructor is used for cloning in the Prototype Design Pattern.
     *
     * @param other the BotPlayer instance to copy
     */
    public BotPlayer(BotPlayer other) {
        super(other.getName(), other.getAge(), other.getState(), other.getDist(), other.getNation());
        this.weapon = other.weapon;
    }

    /**
     * Creates and returns a clone of this BotPlayer instance. This method implements
     * the Prototype Design Pattern by using the copy constructor to create a new
     * instance.
     *
     * @return a cloned BotPlayer instance
     */
    @Override
    public Player clone() {
        return new BotPlayer(this); // Using the copy constructor to clone
    }

    /**
     * Prints the details of the BotPlayer instance, including the weapon attribute.
     * This method provides a detailed output of the player's attributes.
     */
    @Override
    public void Print() {
        System.out.println("Bot_Player: Name = " + getName() + ", Age = " + getAge() +
            ", State = " + getState() + ", Dist = " + getDist() + ", Nation = " +
            getNation() + ", Weapon = " + weapon);
    }
}
