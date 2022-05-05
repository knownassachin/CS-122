package assignment5;

import java.util.Scanner;

public class IntListTest {
	private static Scanner scan;
	private static IntList list = new IntList();

	// ---------------------------------------------------------------- // Creates a
	// list, then repeatedly prints the menu and does what // the user asks until
	// they quit. //----------------------------------------------------------------
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	// ----------------------------------------
//  Does what the menu item calls for.
//----------------------------------------
	public static void dispatch(int choice) {
		int newVal = 0;

		
		
		switch(choice) {
			case 0:
				System.out.println("Bye!");
				break;
			case 1:    //add to front
				System.out.println("Enter integer to add to front");
				newVal = scan.nextInt();
				list.addToFront(newVal);
				break;
			case 2:   //add to end
				System.out.println("Enter integer to add to end");
				newVal = scan.nextInt();
					list.addToEnd(newVal);
				break;
			case 3:  //remove first element
				list.removeFirst();
				break;
			case 4: //remove last element
				list.removeLast();
				break;
			case 5: // allows you to replace a certain index
				list.replace(choice, newVal);
			case 6:  //print
				list.print();
				break;
			default:
				System.out.println("Sorry, invalid choice");
		}
}


	//-----------------------------------------
//  Prints the user's choices
//-----------------------------------------
	public static void printMenu() {
		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Add an integer to the end of the list");
		System.out.println("3: Remove an integer from the front of the list");
		System.out.println("4: Remove an integer from the end of the list");
		System.out.println("5: Replace the old values with new values");
		System.out.println("6: Print the list");
		System.out.print("\nEnter your choice: ");
	}
}