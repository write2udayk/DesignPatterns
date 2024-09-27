package adapter.desgin.pattern;

/**
 * The {@code ICICIBankAdapter} class is an adapter that allows the
 * {@code ICICIBankClient} to be used with the generic {@code BankAPI}. This
 * adapter translates requests from {@code BankAPI} to methods supported by
 * {@code ICICIBankClient}.
 * <p>
 * This is a key part of the Adapter design pattern, where it enables the
 * PhonePe system to work with ICICI Bank by adapting the interface of the
 * {@code ICICIBankClient}.
 */
public final class ICICIBankAdapter extends BankAPI {

    /**
     * The {@code ICICIBankClient} instance used by this adapter to perform
     * operations specific to ICICI Bank.
     */
    private final ICICIBankClient iciciClient;

    /**
     * Constructs an {@code ICICIBankAdapter}
     * with a given {@code ICICIBankClient}.
     * @param client The instance of
     * {@code ICICIBankClient} that this adapter
     *will use.
     */
    public ICICIBankAdapter(final ICICIBankClient client) {
        this.iciciClient = client;
    }

    /**
     * Checks the balance of the account by delegating the call to
     * {@code ICICIBankClient}.
     *
     * @param accNum The account number to check the balance for.
     * @return The current balance of the account.
     */
    @Override
    public double checkBalance(final String accNum) {
        return iciciClient.getBalance(accNum);
    }

    /**
     * Sends money from one account to another by
     *  calling the corresponding method
     * in {@code ICICIBankClient}.
     * @param from   The account number sending the money.
     * @param amount The amount of money to transfer.
     * @param to     The account number receiving the money.
     * @return {@code true} if the transaction is successful, {@code false}
     *         otherwise.
     */
    @Override
    public boolean sendMoney(final String from,
                             final double amount,
                             final String to) {
        return iciciClient.transferMoney(from, amount, to);
    }

    /**
     * Registers a new account in the ICICI Bank system by calling
     * {@code ICICIBankClient}.
     *
     * @param name           The name of the person registering the account.
     * @param phoneNumString The phone number associated with the new account.
     * @return {@code true} if the registration is successful, {@code false}
     *         otherwise.
     */
    @Override
    public boolean registerAccount(final String name,
            final String phoneNumString) {
        return iciciClient.registerNewAccount(name);
    }
}
