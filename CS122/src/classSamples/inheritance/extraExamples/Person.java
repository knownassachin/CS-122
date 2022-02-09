package classSamples.inheritance.extraExamples;

public abstract class Person {
	public int age;
	protected String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Person";
	}
	protected abstract int printAge();
}
