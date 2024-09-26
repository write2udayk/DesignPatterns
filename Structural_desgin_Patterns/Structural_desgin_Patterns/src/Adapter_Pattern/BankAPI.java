package Adapter_Pattern;

public abstract class BankAPI {
	public abstract double checkBalance(String accNum);

	public abstract boolean sendMoney(String from, double amount, String to);

	public abstract boolean registerAccount(String name, String phoneNumString);

}
