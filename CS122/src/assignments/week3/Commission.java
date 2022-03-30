package assignments.week3;

public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	public Commission(String name, String address, String phone, String ssn,
	double payRate, int hours, double commissionRate) {
	super(name, address, phone, ssn, payRate, hours);
	this.commissionRate = commissionRate;
	}
	public void setSales(double totalSales) {
	this.totalSales = totalSales;
	}
	public double pay() {
	return super.pay() + commissionRate;
	}
	public String toString() {
	return super.toString() + " , commission rate is " + commissionRate;
	}

}
