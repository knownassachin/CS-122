package classSamples.collections;

//import java.util.Queue;
import java.util.LinkedList;

public class Queue {
	LinkedList<String> theQueue;
	
	public Queue() {
		this.theQueue = new LinkedList<String>();
	}
	
	
	public void enqueue(String s) {
		// add to the end of the linkedlist
		theQueue.add(s);
	}
	
	public String dequeue() {
		return theQueue.removeFirst();
	}
	
	public String peek() {
		return theQueue.peek();
	}
	
	public Boolean empty() {
		return theQueue.isEmpty();
	}
	
	public String toSting() {
		return theQueue.toString();
	}
	
	
}
