package Adapter_Pattern;

public class Execiution {

	public static void main(String[] args) {

		Yes_Bank_Client yesBankClient = new Yes_Bank_Client();

		Yes_Bank_Adapter yesBAnkAdapter = new Yes_Bank_Adapter(yesBankClient);

		
		ICICI_Bank_Client icici_client = new ICICI_Bank_Client();
		ICICI_Bank_Adapter icici_adapter = new ICICI_Bank_Adapter(icici_client);
		
		PhonePe phone = new PhonePe(icici_adapter);

		String accNum = "9272020001927";
		System.out.println(phone.checkBalance(accNum));

		int amount = 500;
		String toAcc = "5672010000765";

		System.out.println(phone.transferMoney(accNum, amount, toAcc));

		String name = "uday";
		String phoneNum = "9538055213";
		System.out.println(phone.createAcc(name, phoneNum));

	}

}
