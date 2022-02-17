package classSamples.polymorphism.Firm;

public class Contact implements Comparable<Contact> {
private final String firstName;
private final String lastName;
private final String phone;

//create a contructor
public Contact(String firstName, String lastName, String phone) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
}
public String toString() {
	return this.lastName+", " + this.firstName + "\t " + this.phone;
}
public boolean equals(Object other) {
	return this.lastName.equals(((Contact)other).getLastName()) && this.firstName.equals(((Contact)other).getFirstName());
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}

public int compareTo(Contact o) {
	int result;
	
	if(this.lastName.equals(o.getLastName())) {
		result = this.firstName.compareTo(o.getFirstName());
	}
	else {
		result = this.lastName.compareTo(o.getLastName());
	}
	return result;
	}

}
