package com.example.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;


public class ProductNotifier {

    /**
     * List of subscribed users who will receive notifications about the
     * product's availability.
     */
    private List<User> users;

    /**
     * The name of the product that the notifier is associated with.
     */
    private String productName;

    /**
     * Indicates the availability status of the product.
     * {@code true} if the product is in stock, {@code false} otherwise.
     */
    private boolean inStock;

    /**
     * Constructs a ProductNotifier with the specified product name.
     * @param productname the name of the product
     */
    public ProductNotifier(final String productname) {
        this.users = new ArrayList<User>();
        this.productName = productname;
        this.inStock = false;
    }

    /**
     * Subscribes a user to the notifier.
     * @param user the user to subscribe
     */
    public void subscribe(final User user) {
        users.add(user);
        System.out.println(user.getName() + " has been subscribed! ");
    }
    /**
     * Notifies all subscribed users about the product's availability
     * if it is in stock.
     */
    public void notifyUser() {
        if (inStock) {
            for (User user:users) {
                user.notifyy(productName);
            }
        }
    }
    /**
     * Unsubscribes a user from receiving notifications.
     *
     * @param user the user to unsubscribe
     */
    public void unsubscribe(final User user) {
        users.remove(user);
        System.out.println(user.getName() + " Unsubscribed! ");
    }
    /**
     * Sets the stock status of the product and notifies users if the
     * product is now in stock.
     * @param isInStrock {@code true} if the product is in stock,
     * {@code false} otherwise
     */
    public void setInStock(final boolean isInStrock) {
        this.inStock = isInStrock;
        if (isInStrock) {
            System.out.println(productName + " is back in Stock!");
           notifyUser();
        }
    }

}
