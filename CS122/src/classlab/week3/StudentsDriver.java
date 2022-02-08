package classlab.week3;

public class StudentsDriver {
	public static void main(String[] args) {
		Person.printObjValues();
		Person p = new Person("a",1,"a");
		Student s = new Student("you", 21, "NYC", "Computer Science");
		s.printAge();
		s.printName();
	}
}
