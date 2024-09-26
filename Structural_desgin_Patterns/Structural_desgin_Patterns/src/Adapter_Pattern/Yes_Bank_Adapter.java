package Adapter_Pattern;

public class Yes_Bank_Adapter extends BankAPI {

	private final Yes_Bank_Client yesBankclient;

	public Yes_Bank_Adapter(Yes_Bank_Client client) {
		this.yesBankclient = client;
	}

	@Override
	public double checkBalance(String accNum) {

		return yesBankclient.fetchBalance(accNum);
	}

	@Override
	public boolean sendMoney(String from, double amount, String to) {

		return yesBankclient.payMoney(from, amount, to);
	}

	@Override
	public boolean registerAccount(String name, String phoneNumString) {

		return yesBankclient.registerAccount(phoneNumString);
	}

}
