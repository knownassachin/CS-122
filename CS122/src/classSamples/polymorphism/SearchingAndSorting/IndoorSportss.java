package classSamples.polymorphism.SearchingAndSorting;

public class IndoorSportss extends Review {
	public int seatingCapacity;
	
	
	public IndoorSportss(String name, int players, int seatingCapacity) {
		super(name, players);
		this.seatingCapacity = seatingCapacity;
	}
	
	public void printName() {
		System.out.println();
	}
}
