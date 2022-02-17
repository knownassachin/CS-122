package assignments.assignment1;

public class Faculty extends Employee {
	
	protected String officeHours;
	protected String rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, double salary, String office,
			String dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
    	return super.toString();
    }
}