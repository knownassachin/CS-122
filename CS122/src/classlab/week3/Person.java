package classlab.week3;

public abstract class Person {
		public String name;
		private int age;
		protected String city;

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	//accessor and getter
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void printName();
	protected abstract void printAge();
	public static void printObjValues() {
		System.out.println("object");
	}
}
