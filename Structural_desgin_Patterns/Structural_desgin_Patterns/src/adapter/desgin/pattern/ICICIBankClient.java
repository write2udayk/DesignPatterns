package adapter.desgin.pattern;

public class ICICIBankClient {

	public double getBalance(String accountNumber) {
		System.out.println("Checking balance for account: " + accountNumber);
		return 1000.00; // Returning a mock balance
	}

	public boolean transferMoney(String from, double amount, String to) {
		System.out.println("Sending " + amount + " from " + from + " to " + to);
		return true; // Returning a mock success response
	}

	public boolean registerNewAccount(String accountNumber) {
		System.out.println("Registering account: " + accountNumber);
		return true; // Returning a mock success response
	}

}
