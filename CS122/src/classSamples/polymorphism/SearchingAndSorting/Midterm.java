package classSamples.polymorphism.SearchingAndSorting;
//extends, it means inheriting everything except constructor
public class Midterm extends Review {
	String type;
	
	//constructor
	public Midterm(String name, int players, String type) {
		//call to parent's constructor should be the 1st line in constructor of a child class
		super(name, players);// will call the constructor of parent class.
		this.type = type;
	}
	
	public void printName() {
		System.out.println(this.name + this.type);
	
	}
	//overrides toString of parent class
	@Override
	public String toString() {
		return super.toString() + this.type;
	}
}
