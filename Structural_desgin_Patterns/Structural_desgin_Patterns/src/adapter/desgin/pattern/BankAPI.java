package adapter.desgin.pattern;

/**
 * The {@code BankAPI} is an abstract class that represents the core functions
 * of a banking system. If you're creating a new banking API, you'll extend this
 * class and implement these basic features like checking balances, sending
 * money, and registering accounts.
 */
public abstract class BankAPI {

    /**
     * Check the balance of a given account.
     *
     * @param accNum The account number you want to check the balance for.
     * @return The current balance of the account as a double.
     */
    public abstract double checkBalance(String accNum);

    /**
     * Send money from one account to another.
     *
     * @param from   The account number you're sending money from.
     * @param amount The amount of money you're sending.
     * @param to     The account number you're sending money to.
     * @return {@code true} if the transaction is successful, {@code false}
     *         otherwise.
     */
    public abstract boolean sendMoney(String from, double amount, String to);

    /**
     * Register a new bank account.
     *
     * @param name           The name of the person registering the account.
     * @param phoneNumString The phone number associated with the account.
     * @return {@code true} if the registration is successful, {@code false}
     *         otherwise.
     */
    public abstract boolean registerAccount(String name, String phoneNumString);

}
