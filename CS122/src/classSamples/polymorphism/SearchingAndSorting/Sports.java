package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports>{
	private final String name;
	private final int players;
	
	public Sports(String name, int players) {
		this.name = name;
		this.players = players;
	}
	
	public int getPlayers() {
		return players;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " " + players + "\n";
	}
	
	@Override
	public boolean equals(Object other) {
		return (name.equals(((Sports) other).getName()));
	}
	@Override
	public int compareTo(Sports o) {
		int result;

		if (name.equals(o.getName()))
			result = this.name.compareTo(o.getName());
		return 0;
	}
	public static void main(String[] args) {
		Sports[] rulemSports = new Sports[3];

		rulemSports[0] = new Sports("John", "Smith", "610-555-7384");
		rulemSports[1] = new Sports("Sarah", "Barnes", "215-555-3827");
		rulemSports[2] = new Sports("Mark", "Riley", "733-555-2969");
		
		Sorting<Sports> sorts = new Sorting<Sports>();
		sorts.selectionSort(rulemSports);

		for (Sports rulemSports1 : rulemSports)
			System.out.println(rulemSports1);
	}

}
