package adapter.desgin.pattern;

public class YesBankAdapter extends BankAPI {

	private final YesBankClient yesBankclient;

	public YesBankAdapter(YesBankClient client) {
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
