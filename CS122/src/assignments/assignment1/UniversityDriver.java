package assignments.assignment1;

public class UniversityDriver {

	public static void main(String[] args) {
		Student Jimmy = new Student("Jimmy", "Bronx", "555-555-0000", "jimmyiscool@jimma.com");
		Employee Sharkeisha = new Employee("Sharkeisha", "Brooklyn", "555-456-3476", "keish@cool.com", 70000, "e310", "09/09/21");
		Faculty John = new Faculty("John", "Jersey City", "234-888-2345", "johnnyboy@outlook.com", 6000, "q910", "06/02/21", "7:00am-4:00pm", "CEO");
		Staff Martonie = new Staff("Martonie", "Jamaica", "904-878-3654", "marmar@outlook.com", 10000, "q910", "06/02/21", "OG ChairMan");
		
		System.out.println(Jimmy.toString());
		System.out.println(Sharkeisha.toString());
		System.out.println(John.toString());
		System.out.println(Martonie.toString());
	}

}
