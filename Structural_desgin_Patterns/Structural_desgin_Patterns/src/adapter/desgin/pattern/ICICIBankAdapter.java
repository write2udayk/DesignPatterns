package adapter.desgin.pattern;

public final class ICICIBankAdapter extends BankAPI {
	
    private final ICICIBankClient iciciClient;
	
	public ICICIBankAdapter(ICICIBankClient icici_client) {
		this.iciciClient = icici_client;
	}

	@Override
	public double checkBalance(String accNum) {
		
		return iciciClient.getBalance(accNum);
	}

	@Override
	public boolean sendMoney(String from, double amount, String to) {
		
		return iciciClient.transferMoney(from, amount, to);
	}

	@Override
	public boolean registerAccount(String name, String phoneNumString) {

		return iciciClient.registerNewAccount(name);
	}

}
