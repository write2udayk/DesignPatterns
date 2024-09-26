package adapter.desgin.pattern;

public class ICICIBankClient {


	// Simulate checking balance for an account
	public double getBalance(String accountNumber) {
		// Implementation that interacts with the actual bank's system to get the
		// balance
		System.out.println("Checking balance for account: " + accountNumber);
		return 1000.00; // Returning a mock balance
	}

	// Simulate sending money from one account to another
	public boolean transferMoney(String from, double amount, String to) {
		// Implementation that interacts with the actual bank's system to transfer money
		System.out.println("Sending " + amount + " from " + from + " to " + to);
		return true; // Returning a mock success response
	}

	// Simulate registering a new account
	public boolean registerNewAccount(String accountNumber) {
		// Implementation that interacts with the actual bank's system to register an
		// account
		System.out.println("Registering account: " + accountNumber);
		return true; // Returning a mock success response
	}


}
