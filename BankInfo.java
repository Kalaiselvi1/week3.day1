package banking;

public class BankInfo {

	public void saving() {
		System.out.println("This Is Savings Account.");

	}
	
	public void fixed() {
		System.out.println("This Is Fixed Deposit Account.");

	}
	
	public void deposit() {
		System.out.println("This is deposit.");

	}
	
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();

	}

}
