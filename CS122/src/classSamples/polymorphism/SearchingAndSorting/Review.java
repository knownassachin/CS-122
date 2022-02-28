package classSamples.polymorphism.SearchingAndSorting;

public class Review {
	// class attributes or properties
	protected String name;
	int players;
	
	//Visibility
	//private -- class only
	//public -- everywhere
	//protected -- this class, child class, and package
	
	// constructor -- any number of parameters
	public Review(String name, int players) {
		this.name = name;
		this.players = players;
	}
	
	//getter or accessor
	public String getName() {
		return this.name;
	}
	
	//setter or mutator
	public void setName(String name) {
		this.name = name;
	}
	// default constructor
	public Review() {
		this.name = "a new sports";
		this.players = 2;
	}
	
	//visibility returnType nameOfMethod(parameterTyoe parameter Name) -- mehtod
	public void printName() {
		System.out.println(this.name);
	}
}
