package assignments.assignment1;

public class Student extends Person {
	
	public static final String status = "Freshman";
	public Student(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Status: " + status + "\n";
		return result;
	}
}
