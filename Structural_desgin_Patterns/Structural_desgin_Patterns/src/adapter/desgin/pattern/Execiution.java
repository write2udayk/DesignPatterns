package adapter.desgin.pattern;

public class Execiution {

	public static void main(String[] args) {

		YesBankClient yesBankClient = new YesBankClient();

		YesBankAdapter yesBankAdapter = new YesBankAdapter(yesBankClient);

		ICICIBankClient iciciClient = new ICICIBankClient();
		ICICIBankAdapter iciciAdapter = new ICICIBankAdapter(iciciClient);

		PhonePe phone = new PhonePe(iciciAdapter);

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
