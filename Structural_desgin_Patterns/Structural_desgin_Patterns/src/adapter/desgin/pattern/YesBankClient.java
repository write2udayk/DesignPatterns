package adapter.desgin.pattern;

/**
 * The {@code YesBankClient} class represents a mock
 * implementation of a banking client
 * that provides functionalities
 *for checking account balance, transferring money,
 * and registering new accounts.
 */


public class YesBankClient {
    /**
     * passing return value.
     */
    public static final double AMOUNT = 100.0;

    /**
     * Fetches the balance of the specified account number.
     *
     * @param accountNumber The account number for which to fetch the balance.
     * @return The current balance of the account as a double.
     */
    public double fetchBalance(final String accountNumber) {
        System.out.println("Checking balance for account: " + accountNumber);
        return AMOUNT; // Returning a mock balance
    }

    /**
     * Sends a specified amount of money from one account to another.
     *
     * @param from   The account number to send money from.
     * @param amount The amount of money to send.
     * @param to     The account number to send money to.
     * @return {@code true} if the transfer was successful,
     * {@code false} otherwise.
     */
    public boolean payMoney(final String from,
            final double amount, final String to) {
        System.out.println("Sending " + amount + " from " + from + " to " + to);
        return true; // Returning a mock success response
    }

    /**
     * Registers a new account with the specified phone number.
     * @param number The phone number associated with the new account.
     * @return {@code true} if the account registration was successful,
     * {@code false} otherwise.
     */
    public boolean registerAccount(final String number) {
        System.out.println("Registering account from: "
   + number + " PhoneNumber");
        return true; // Returning a mock success response
    }
}
