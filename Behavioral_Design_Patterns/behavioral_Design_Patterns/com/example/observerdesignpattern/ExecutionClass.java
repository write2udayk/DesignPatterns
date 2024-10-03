package com.example.observerdesignpattern;

/**
 * The {@code ExecutionClass} contains the main method to demonstrate the
 * functionality of the Observer design pattern using the
 * {@code ProductNotifier} and {@code EmailUser} classes.
 */
public final class ExecutionClass {
    private ExecutionClass() {
    }

    /**
     * The main method serves as the entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {
        // Create a ProductNotifier for a specific product
        ProductNotifier pn = new ProductNotifier("iPhone");
        // Create EmailUser instances
        EmailUser user1 = new EmailUser("uday");
        // Create EmailUser instances
        EmailUser user2 = new EmailUser("nagi");
        // Subscribe users to the notifier
        pn.subscribe(user1);
        pn.subscribe(user2);
        // Set the product to in stock, which will notify users
        pn.setInStock(true);
        pn.unsubscribe(user2);
        ProductNotifier product = new ProductNotifier("laptop");
        SMSUser user3 = new SMSUser("deepak");
        SMSUser user4 = new SMSUser("Nishith");
        product.subscribe(user3);
        product.setInStock(true);
        product.subscribe(user4);
        product.notifyUser();
    }

}
