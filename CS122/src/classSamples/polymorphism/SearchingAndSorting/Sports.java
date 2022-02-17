package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports> {
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
	public boolean equals(Object o) {
		return this.name.equals(((Sports) o).getName());
	}

	@Override
	public int compareTo(Sports o) {
		return this.name.compareTo(o.getName());
	}

	public static void main(String[] args) {
		Sports[] rulemSports = new Sports[3];

		rulemSports[0] = new Sports("Baseball", 1);
		rulemSports[1] = new Sports("Basketball", 8);
		rulemSports[2] = new Sports("Rowing", 9);

		Sorting<Sports> sorts = new Sorting<Sports>();
		sorts.selectionSort(rulemSports);

		for (Sports rulemSports1 : rulemSports)
			System.out.println(rulemSports1);
	}

}
