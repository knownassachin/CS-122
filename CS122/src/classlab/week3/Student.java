package classlab.week3;

public class Student extends Person {
	public String major;
	
	public Student(String name, int age, String city, String major) {
		super(name, age, city);
		this.major = major;
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

	@Override
	protected void printAge() {
		// TODO Auto-generated method stub
		System.out.println(getAge());
	}
	
}
