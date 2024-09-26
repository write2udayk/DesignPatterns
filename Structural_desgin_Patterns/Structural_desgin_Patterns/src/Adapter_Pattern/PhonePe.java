package Adapter_Pattern;

public class PhonePe {

	private final BankAPI bankApi;

	public PhonePe(BankAPI api) {
		this.bankApi = api;
	}

	public double checkBalance(String accNum) {

		return bankApi.checkBalance(accNum);

	}

	public boolean transferMoney(String from, double amount, String to) {

		return bankApi.sendMoney(from, amount, to);

	}

	public boolean createAcc(String name, String phNum) {
		return bankApi.registerAccount(name, phNum);
	}
}
