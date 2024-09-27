package adapter.desgin.pattern;

/**
 * The {@code PhonePe} class represents a payment
 * interface that interacts with a banking API to
 * perform various banking operations such as
 * checking balances, transferring money, and creating accounts.
 */

public class PhonePe {
    /**
     * The {@code BankAPI} instance used by this {@code PhonePe}
     * class to perform various banking operations such as checking
     * balances, transferring money,
     * and creating accounts.
     */
    private final BankAPI bankApi;

    /**
     * Constructs a {@code PhonePe} instance with the specified {@code BankAPI}.
     *
     * @param api The {@code BankAPI} instance that this PhonePe
     * will use for operations.
     */
    public PhonePe(final BankAPI api) {
        this.bankApi = api;
    }

    /**
     * Checks the balance of the specified account.
     *
     * @param accNum The account number for which to check the balance.
     * @return The current balance of the account as a double.
     */
    public double checkBalance(final String accNum) {
        return bankApi.checkBalance(accNum);
    }

    /**
     * Transfers a specified amount of money from one account to another.
     *
     * @param from   The account number to send money from.
     * @param amount The amount of money to send.
     * @param to     The account number to send money to.
     * @return {@code true} if the transfer was successful,
     * {@code false} otherwise.
     */
    public boolean transferMoney(final String from,
                                 final double amount,
                                 final String to) {
        return bankApi.sendMoney(from, amount, to);
    }

    /**
     * Creates a new bank account with the specified name and phone number.
     *
     * @param name   The name of the person registering the account.
     * @param phNum  The phone number associated with the new account.
     * @return {@code true} if the account creation was successful,
     * {@code false} otherwise.
     */
    public boolean createAcc(final String name, final String phNum) {
        return bankApi.registerAccount(name, phNum);
    }
}
