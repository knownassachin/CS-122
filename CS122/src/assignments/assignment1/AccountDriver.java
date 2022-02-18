package assignments.assignment1;

public class AccountDriver {

	public static void main(String[] args) {
		Account familyAcc = new Account(234, 100.50);
		familyAcc.withdraw(40.50);

		Checking rainyDayFund = new Checking(123, 300, 700);
		rainyDayFund.withdraw(10000);
		
		Saving vacationFund = new Saving(123, 20);
		vacationFund.withdraw(100);
	}

}
