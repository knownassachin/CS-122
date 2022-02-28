package classSamples.polymorphism.SearchingAndSorting;

public class Search<T> {
	// list is an array of type T
	// target is the element you are looking/searching for
	public T linearSearch(T[] list, T target) {
		// initialize index to 0
		int index = 0;
		// initialize flag("go/no go"switch) for item if it is found or not
		boolean found = false;
		// until the item is not found and end of list is not reached
		while(!found && index<list.length) {
			// compare the current item to target
			if(list[index].equals(target)) {
				// if the current item and target are equal
				// set the flag to true
				found = true;
			} else {
				// else increase the counter i.e index
				index++;
			}
		}
		// if item is found, return the item
		if(found)
			return list[index];
		//else return null
		else
			return null;
	}
}
