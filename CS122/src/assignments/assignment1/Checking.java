package assignments.assignment1;

public class Checking extends Account{
	private int overdraftLim;
	
	public Checking(int ID, double bal, int limit) {
		super(ID, bal);
		overdraftLim = limit;
	}
	
	public void withdraw(double withdrawnMoney) {
		if((getBalance() - withdrawnMoney) < (0 - overdraftLim)) {
			System.out.println("Overdraft Limist reached.");
		} else {
			System.out.println("$" + withdrawnMoney + " Withdrawn.");
			setBalance(getBalance() - withdrawnMoney);
		}
	}
}
