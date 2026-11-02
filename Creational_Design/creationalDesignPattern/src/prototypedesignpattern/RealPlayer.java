/**
 * Represents a concrete implementation of the Player class in the Prototype Design Pattern.
 * The Real_Player class adds additional functionality specific to a player, such as a bomb attribute.
 * This class demonstrates the cloning behavior by implementing the {@code clone} method using the copy constructor.
 * 
 * <p>This class serves as a specific prototype of a player with additional state (bomb) that can be cloned.
 * It overrides the {@code clone} method to create a new instance of {@code Real_Player} by copying the attributes
 * of an existing one.</p>
 */
package prototypedesignpattern;

public class RealPlayer extends Player {

	private String bomb;

	/**
	 * Constructs a new Real_Player with the specified name, age, state, district,
	 * nationality, and bomb details.
	 *
	 * @param name   the name of the player
	 * @param age    the age of the player
	 * @param state  the state of residence of the player
	 * @param dist   the district of residence of the player
	 * @param nation the nationality of the player
	 * @param bomb   the bomb attribute associated with the player
	 */
	public RealPlayer(String name, int age, String state, String dist, String nation, String bomb) {
		super(name, age, state, dist, nation);
		this.bomb = bomb;
	}

	/**
	 * Copy constructor to create a new Real_Player instance as a copy of an
	 * existing one. This constructor is used for cloning in the Prototype Design
	 * Pattern.
	 *
	 * @param other the Real_Player instance to copy
	 */
	public RealPlayer(RealPlayer other) {
		super(other.getName(), other.getAge(), other.getState(), other.getDist(), other.getNation());
		this.bomb = other.bomb;
	}

	/**
	 * Creates and returns a clone of this Real_Player instance. This method
	 * implements the Prototype Design Pattern by using the copy constructor to
	 * create a new instance.
	 *
	 * @return a cloned Real_Player instance
	 */
	@Override
	public Player clone() {
		return new RealPlayer(this); // Using the copy constructor to clone
	}

	/**
	 * Prints the details of the Real_Player instance, including the bomb attribute.
	 * This method provides a detailed output of the player’s attributes.
	 */
	@Override
	public void Print() {
		System.out.println("Real_Player: Name = " + getName() + ", Age = " + getAge() + ", State = " + getState()
				+ ", Dist = " + getDist() + ", Nation = " + getNation() + ", Bomb = " + bomb);
	}
}
