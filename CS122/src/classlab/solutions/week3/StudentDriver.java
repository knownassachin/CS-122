package classlab.solutions.week3;

public class StudentDriver {
	public static void main(String[] args) {
//		Person.printObjValues();
//		Person p = new Person("a",1,"a");
		Student s = new Student("you", 21, "NYC", "CS");
		s.printAge();
		s.printName();
	}
}
