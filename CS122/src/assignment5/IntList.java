package assignment5;

public class IntList {
	private IntNode front; // first node in list
	public IntNode data;
	
//-----------------------------------------
//  Constructor.  Initially list is empty.
//-----------------------------------------

	public IntList() {
		front = null;
	}

//-----------------------------------------
//   Adds given integer to front of list.
//-----------------------------------------
	public void addToFront(int val) {
		front = new IntNode(val, front);
	}

//-----------------------------------------
//   Adds given integer to end of list.
//-----------------------------------------
	
	public void addToEnd(int val) {
		IntNode newnode = new IntNode(val,null);
		
		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else {
			//make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;
		}
 }

	// -----------------------------------------
	// Removes the first node from the list.
//   If the list is empty, does nothing.
	// -----------------------------------------
	public void removeFirst() {
		if (front != null)
			front = front.next;
	}
	
	public int length() {
		int val = 0;
		   for(IntNode n = front; n.next != null; n = n.next)
		       val++;     
		   return val + 1;
		}
	
	public String toString() { 
		String s = " ";
		for (IntNode n = front; n != null; n = n.next) {
			s = s + n.val + ", ";
		}
			return s;
	}
	
	
	public void removeLast() {
		if(front == null) {
			//throw new NoSuchElementException("List is Empty!!");
		}
		
		IntNode lastNode = front;
		IntNode previousToLastNode = null;
		while(lastNode.next != null) {
			previousToLastNode = lastNode;
			lastNode = lastNode.next;
		}
		previousToLastNode.next = null;
		System.out.println(lastNode);
		
	}
	
	public void replace(int oldVal, int newVal) {
		for (IntNode n = front; n != null; n = n.next) {
			if (n.val == oldVal) {
				n.val = newVal;
			}
		}
//		
    } 
      
	
	// ------------------------------------------------
//   Prints the list elements from first to last.
//------------------------------------------------
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.print("\nNumber of elements: " + length());
		System.out.print("\nPrint Value: " + toString());
		System.out.println("\n-----------------------\n");
	}

	// *************************************************************
// An inner class that represents a node in the integer list.
// The public variables are accessed by the IntList class.
//*************************************************************
	private class IntNode {
		public int val; // value stored in node
		public IntNode next; // link to next node in list
		// ------------------------------------------------------------------ //
		// Constructor; sets up the node given a value and IntNode reference
		// //------------------------------------------------------------------

		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}
}		
