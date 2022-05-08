package projects.project1;

public class LinkedList {
	private IntNode first; // first node in list
	private IntNode list;

	
//)constructor; creates an empty list of integer
	public LinkedList() {
		first = null;
		list = null;
	}
	
	 public void add(int val) {
	       IntNode node = new IntNode(val,null);
	        if(this.list==null){
	            this.list = node;
	        } else {
	            IntNode current = list;
//	            current.next == null
//	            move it to next node until next variable is null
	            while(current.next != null)
	                current = current.next;

	            current.next = node;
	        }
	 }

//-----------------------------------------
// Adds given integer to front of list.
//-----------------------------------------
	public void addToFront(int val) {
		first = new IntNode(val, first);
	}
	

//-----------------------------------------
// Adds given integer to end of list.
//-----------------------------------------
	public void addToEnd(int val) {
		IntNode newnode = new IntNode(val, null);
//if list is empty, this will be the only node in it
		if (first == null)
			first = newnode;
		else {
//make temp point to last thing in list
			IntNode temp = first;
			while (temp.next != null)
				temp = temp.next;
//link new node into list
			temp.next = newnode;
		}
	}

//-----------------------------------------
//Removes the first node from the list.
//If the list is empty, does nothing.
//-----------------------------------------
	public void removeFirst() {
		if (first != null)
			first = first.next;
	}

//------------------------------------------------
//Prints the list elements from first to last.
//------------------------------------------------
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = first;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}

	private class IntNode {
		public int val; // value stored in node
		public IntNode next; // link to next node in list

		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		} 
	}

//	1. public int length()returns the number of elements in the list
	public  int length1() {
		int count = 0;
		IntNode temp = first;
		while (temp != null) {
			count = count + 1;
			temp = temp.next;
		}
		return count;
	}
	public void clear() {
		 first = null;	
		
	}

	// 2. public String toString()returns a String containing the print value of
	// the list.
	public String toString() {
		String s = "";
		IntNode current = first;
		while(current != null)	
		{
			s += current.val + " -> ";
			current = current.next;
		}

        s+= "null";
		return s;
	}

	public void removeLast()
	{
		if (first != null)
		{
			IntNode current = first;
			IntNode previous = null;

			while (current.next != null)
			{
				previous = current;
				current = current.next;
			}

			if (previous == null)
			{
				first = null;
			}
			else
			{
				previous.next = null;
			}
		}
	}
}