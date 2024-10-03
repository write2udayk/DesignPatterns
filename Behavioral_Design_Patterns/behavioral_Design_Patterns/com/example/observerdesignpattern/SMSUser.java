package com.example.observerdesignpattern;

public class SMSUser implements User {
    /**
     * The name of the user.
     */
    private String userName;

    /**
     * Constructs an EmailUser with the specified name.
     *
     * @param username the name of the user
     */
    public SMSUser(final String username) {

        this.userName = username;
    }

    /**
     * Retrieves the name of the user.
     *
     * @return the name of the user
     */
    @Override
    public final String getName() {
        return userName;
    }

    /**
     * Notifies the user about the product availability.
     *
     * @param productName the name of the product that is back in stock
     */

    @Override
    public void notifyy(final String productName) {
        System.out.println("Notified user : " + userName + " through Email!!");
    }
}
