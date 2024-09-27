package adapter.desgin.pattern;

/**
 * The {@code Execiution} class demonstrates how to use the Adapter design
 * pattern to integrate different bank clients (YesBank, ICICI Bank) with a
 * payment system (PhonePe).
 * <p>
 * This class simulates actions like checking the balance, transferring money,
 * and creating a new account through PhonePe, regardless of the underlying bank
 * API.
 */
public final class Execiution {
    /**
     * static final variable to amount to us .
     * <p>
     */
    private static final int AMOUNT = 100;

    private Execiution() {
    }

    /**
     * The main method that drives the program. It demonstrates how to use the
     * PhonePe app with different bank adapters (YesBank and ICICI Bank).
     * <p>
     * It performs the following operations:
     * <ul>
     * <li>Checks the balance of a given account number.</li>
     * <li>Transfers money from one account to another.</li>
     * <li>Creates a new bank account.</li>
     * </ul>
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(final String[] args) {
        // Initialize the YesBank client and adapter
        YesBankClient yesBankClient = new YesBankClient();
        YesBankAdapter yesBankAdapter = new YesBankAdapter(yesBankClient);

        // Initialize the ICICI Bank client and adapter
        ICICIBankClient iciciClient = new ICICIBankClient();
        ICICIBankAdapter iciciAdapter = new ICICIBankAdapter(iciciClient);

        // Create a PhonePe instance using the ICICI Bank adapter
        PhonePe phone = new PhonePe(iciciAdapter);

        // Example: Checking balance
        String accNum = "9272020001927";
        System.out.println(phone.checkBalance(accNum));

        // Example: Transferring money
        System.out.println(phone.transferMoney(accNum,
         AMOUNT, "87408716587065"));

        // Example: Creating a new account
        String name = "uday";
        String phoneNum = "9538055213";
        System.out.println(phone.createAcc(name, phoneNum));
    }
}
