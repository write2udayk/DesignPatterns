/**
 * Abstract class representing a Player, intended to be used as a prototype in the Prototype Design Pattern.
 * The Prototype Design Pattern allows the creation of new objects by copying existing ones, which can be
 * useful for objects that are costly to create or have numerous configuration settings.
 *
 * <p>This class provides a basic structure for player-related data, such as name, age, and location
 * details (state, district, and nationality). It includes a copy constructor and an abstract {@code clone}
 * method to support deep cloning of subclasses, ensuring that derived objects can be duplicated as prototypes.</p>
 *
 * <p>In the context of the Prototype Design Pattern, this class serves as the base "prototype" from which
 * other player instances can be created by copying. Subclasses should implement the {@code clone} method
 * to provide their specific cloning behavior.</p>
 */
package prototypedesignpattern;

abstract public class Player {

	private String name;
	private int age;
	private String state;
	private String dist;
	private String nation;

	/**
	 * Constructs a new Player with the specified name, age, and location details.
	 *
	 * @param name   the name of the player
	 * @param age    the age of the player
	 * @param state  the state of residence of the player
	 * @param dist   the district of residence of the player
	 * @param nation the nationality of the player
	 */
	public Player(String name, int age, String state, String dist, String nation) {
		this.name = name;
		this.age = age;
		this.state = state;
		this.dist = dist;
		this.nation = nation;
	}

	/**
	 * Copy constructor to create a new Player instance as a copy of an existing
	 * one. This supports the Prototype Design Pattern by allowing objects to be
	 * created by copying an existing prototype instance.
	 *
	 * @param other the Player instance to copy
	 */
	public Player(Player other) {
		this.state = other.state;
		this.dist = other.dist;
		this.nation = other.nation;
	}

	/**
	 * Returns the name of the player.
	 *
	 * @return the player's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the age of the player.
	 *
	 * @return the player's age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Returns the state of residence of the player.
	 *
	 * @return the player's state of residence
	 */
	public String getState() {
		return state;
	}

	/**
	 * Returns the district of residence of the player.
	 *
	 * @return the player's district of residence
	 */
	public String getDist() {
		return dist;
	}

	/**
	 * Returns the nationality of the player.
	 *
	 * @return the player's nationality
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * Creates and returns a clone of this player instance. This method is part of
	 * the Prototype Design Pattern, allowing subclasses to provide specific cloning
	 * behavior.
	 *
	 * @return a cloned Player instance
	 */
	abstract public Player clone();

	/**
	 * Prints the details of the player.
	 */
	abstract public void Print();
}
