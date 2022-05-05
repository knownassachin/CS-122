package assignment5;

public class LinkedQueue implements QueueADT {
	private Node front, back;
	private int numElements;

	// ---------------------------------------------
	// Constructor; initializes the front and back pointers
// and the number of elements.
	// ---------------------------------------------
	public LinkedQueue() {
		front = null;
		back = null;
		numElements = 0;
	}

	// ---------------------------------------------
	// Puts item on end of queue.
	// ---------------------------------------------
	public void enqueue(Object item) {
		numElements++;
		Node newnode = new Node(null);
		if (front == null)
			front = newnode;
		else {
			Node temp = front;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp = newnode;
		}

 }
	
	// ---------------------------------------------
	// Removes and returns object from front of queue.
	// ---------------------------------------------
	public Object dequeue() {
		numElements--;
		return front.removeFirst();
     }

	// ---------------------------------------------
	// Returns true if queue is empty.
	// ---------------------------------------------
	public boolean isEmpty() {
		if (numElements == 0) {
			return true;
		} else {
			return false;
		}
	}
//		 if(numElements == 0) {
//	            return true;
//	} else {
//	        return false;
//	    }


	   

	// ---------------------------------------------
// Returns true if queue is full, but it never is.
//---------------------------------------------
	public boolean isFull() {
		return false;
	}

	// ---------------------------------------------
// Returns the number of elements in the queue.
//---------------------------------------------
	public int size() {
		return numElements;
		
	}

	// ---------------------------------------------
	// Returns a string containing the elements of the queue
// from first to last
	// ---------------------------------------------
	public String toString() {
		String result = "\n";
		Node temp = front;
		while (temp != null) {
			result += temp.getElement() + "\n";
			temp = temp.getNext();

		}
		return result;
	}
}
