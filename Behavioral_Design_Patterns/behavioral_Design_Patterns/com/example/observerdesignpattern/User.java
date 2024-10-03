package com.example.observerdesignpattern;

/**
 * The {@code User} interface defines the methods for a user in the Observer
 * design pattern. Implementing classes should provide the behavior
 * for getting the user's name and notifying the user when a change occurs.
 * <p>This interface is typically used in systems where users need
 * to be notified of certain events or changes in
 * state, such as in the Observer pattern where
 * users are observers of some subject.</p>
 * <h3>Methods:</h3>
 * <ul>
 *   <li>{@link #getName()} - Retrieves the name of the user.</li>
 *   <li>{@link #notifyy()} - Notifies the user of changes or events.</li>
 * </ul>
 * @author [Your Name]
 * @version 1.0
 */
public interface User {

    /**
     * Retrieves the name of the user.
     * @return returns userName
     */
    String getName();

    /**
     * Notifies the user of changes or events.
     * @param productName to check product avaiable
     */
    void notifyy(String productName);
}
