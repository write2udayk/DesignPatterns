package adapter.desgin.pattern;

public class YesBankClient {

	public double fetchBalance(String accountNumber) {
		System.out.println("Checking balance for account: " + accountNumber);
		return 1000.00; // Returning a mock balance
	}

	public boolean payMoney(String from, double amount, String to) {
		System.out.println("Sending " + amount + " from " + from + " to " + to);
		return true; // Returning a mock success response
	}

	public boolean registerAccount(String number) {

		System.out.println("Registering account from : " + number + " PhoneNumber");
		return true; // Returning a mock success response
	}

}
