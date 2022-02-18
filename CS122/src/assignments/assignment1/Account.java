package assignments.assignment1;

public class Account {
	private int id;
	private double annualInterestRate;
	private double balance;

	public Account() {
		setId(0);
		setAnnualInterestate(0);
		setBalance(0);
	}

	public Account(int ID, double bal) {
		setId(ID);
			setBalance(bal);
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestate(double annualInterestRate) {
			this. annualInterestRate = annualInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double d) {
		// TODO Auto-generated method stub
		
	}
}
