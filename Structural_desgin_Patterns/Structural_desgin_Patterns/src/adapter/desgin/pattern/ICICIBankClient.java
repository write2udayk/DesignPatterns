package adapter.desgin.pattern;

/**
 * The {@code ICICIBankClient} class provides methods
 * to interact with an ICICI Bank client, allowing
 * operations such as checking balance,
 * transferring money, and registering new accounts.
 */
public class ICICIBankClient {

    /**
     *  Define a constant for the mock balance for.
     *  return
     */
    private static final double MOCK_BALANCE = 1000.00;

    /**
     * Retrieves the balance for the specified account number.
     *
     * @param accountNumber The account number to check the balance for.
     * @return The current balance of the account as a double.
     */
    public double getBalance(final String accountNumber) {
        System.out.println("Checking balance for account: " + accountNumber);
        return MOCK_BALANCE; // Returning a mock balance
    }

    /**
     * Transfers a specified amount of money from one account to another.
     *
     * @param from   The account number to send money from.
     * @param amount The amount of money to send.
     * @param to     The account number to send money to.
     * @return {@code true} if the transfer was successful,
     *{@code false} otherwise.
     */
    public boolean transferMoney(final String from,
            final double amount, final String to) {
        System.out.println("Sending " + amount + " from " + from + " to " + to);
        return true; // Returning a mock success response
    }

    /**
     * Registers a new bank account with the specified account number.
     *
     * @param accountNumber The account number of the new
     * account to be registered.
     * @return {@code true} if the account registration was
     *  successful, {@code false} otherwise.
     */
    public boolean registerNewAccount(final String accountNumber) {
        System.out.println("Registering account: " + accountNumber);
        return true; // Returning a mock success response
    }

}
