package Adapter_Pattern;

public final class ICICI_Bank_Adapter extends BankAPI {
	
	private final ICICI_Bank_Client icici_client;
	
	public ICICI_Bank_Adapter(ICICI_Bank_Client icici_client) {
		this.icici_client = icici_client;
	}

	@Override
	public double checkBalance(String accNum) {
		
		return icici_client.getBalance(accNum);
	}

	@Override
	public boolean sendMoney(String from, double amount, String to) {
		
		return icici_client.transferMoney(from, amount, to);
	}

	@Override
	public boolean registerAccount(String name, String phoneNumString) {

		return icici_client.registerNewAccount(name);
	}

}
