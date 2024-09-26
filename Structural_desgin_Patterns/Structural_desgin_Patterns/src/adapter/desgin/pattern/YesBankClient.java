package adapter.desgin.pattern;

public class YesBankClient {

	// Simulate checking balance for an account
	public double fetchBalance(String accountNumber) {
		// Implementation that interacts with the actual bank's system to get the
		// balance
		System.out.println("Checking balance for account: " + accountNumber);
		return 1000.00; // Returning a mock balance
	}

	// Simulate sending money from one account to another
	public boolean payMoney(String from, double amount, String to) {
		// Implementation that interacts with the actual bank's system to transfer money
		System.out.println("Sending " + amount + " from " + from + " to " + to);
		return true; // Returning a mock success response
	}

	// Simulate registering a new account
	public boolean registerAccount(String number) {
		// Implementation that interacts with the actual bank's system to register an
		// account
		System.out.println("Registering account from : " + number + " PhoneNumber");
		return true; // Returning a mock success response
	}

}
