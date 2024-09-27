package adapter.desgin.pattern;

/**
 * The {@code YesBankAdapter} class serves as an adapter
 *  that translates the operations of a
 * {@code YesBankClient} into the methods defined in
 * the {@code BankAPI} abstract class.
 */
public class YesBankAdapter extends BankAPI {

    /**
     * The {@code YesBankClient} instance used to perform banking operations.
     */
    private final YesBankClient yesBankclient;

    /**
     * Constructs a {@code YesBankAdapter} with the specified
     * {@code YesBankClient}.
     * @param client The {@code YesBankClient} instance that
     * this adapter will use.
     */
    public YesBankAdapter(final YesBankClient client) {
        this.yesBankclient = client;
    }

    /**
     * Checks the balance of the specified account number.
     *
     * @param accNum The account number for which to check the balance.
     * @return The current balance of the account as a double.
     */
    @Override
    public double checkBalance(final String accNum) {
        return yesBankclient.fetchBalance(accNum);
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
    @Override
    public boolean sendMoney(final String from,
            final double amount, final String to) {
        return yesBankclient.payMoney(from, amount, to);
    }

    /**
     * Registers a new bank account with the specified name and phone number.
     *
     * @param name          The name of the person registering the account.
     * @param phoneNumString The phone number associated with the new account.
     * @return {@code true} if the account registration was successful,
     * {@code false} otherwise.
     */
    @Override
    public boolean registerAccount(final String name,
            final String phoneNumString) {
        return yesBankclient.registerAccount(phoneNumString);
    }
}
