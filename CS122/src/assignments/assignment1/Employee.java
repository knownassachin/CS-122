package assignments.assignment1;

public class Employee extends Person{
	
	protected double salary;
    protected String office;
    protected String dateHired;

	public Employee(String name, String address, String phoneNumber, String email, double salary, String office, String dateHired) {
		super(name, address, phoneNumber, email);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    
    @Override
    public String toString() {
    	return super.toSring() + this.salary;
    }
    
}
