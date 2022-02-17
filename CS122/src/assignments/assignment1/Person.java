package assignments.assignment1;

public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
}
	public String toSring() {
		return this.name+"\t " + this.address + "\t " + this.phoneNumber + "\t " + this.email + "\t";
	}

}
