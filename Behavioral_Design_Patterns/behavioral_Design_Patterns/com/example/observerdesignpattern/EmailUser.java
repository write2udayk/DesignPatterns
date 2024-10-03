package com.example.observerdesignpattern;


public class EmailUser implements User {
    /**
     * The name of the user.
     */
    private String userName;

    /**
     * Constructs an EmailUser with the specified name.
     *
     * @param name the name of the user
     */
    public EmailUser(final String name) {
        this.userName = name;
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

    /**
     * Retrieves the name of the user.
     *
     * @return the name of the user
     */

    @Override
    public String getName() {
        return userName;
    }

}
