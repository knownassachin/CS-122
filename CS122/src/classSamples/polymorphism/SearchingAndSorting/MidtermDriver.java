package classSamples.polymorphism.SearchingAndSorting;

public class MidtermDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review tennis = new Review("final", 1);
		//calls default constructor
		Review unknown = new Review();
		//calls constructor of parent class
		Review polo = new Midterm("finals", 2, null);
		
		System.out.println(tennis);
		System.out.println(polo);
	}

}

Object class:
	
	toString
	equals
