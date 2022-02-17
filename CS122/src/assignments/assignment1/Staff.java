package assignments.assignment1;

public class Staff extends Employee {

	protected String title;
	
	public Staff(String name, String address, String phoneNumber, String email, double salary, String office,
			String dateHired, String title) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
