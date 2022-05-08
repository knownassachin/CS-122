package assignment6;

import java.util.EmptyStackException;
import java.util.Stack;

public class LinkedStack implements StackADT {
	private Node top; // reference to top of stack
// ---------------------------------------------------
//Constructor -- initializes top
//---------------------------------------------------
public LinkedStack() {
	top = null;
}
//---------------------------------------------------
//Adds element to top of stack if it's not full, else
//does nothing.
//---------------------------------------------------
public void push(Object val) {
	Node n = new Node(val);
	n.next = top;
	top = n;
}
//---------------------------------------------------
//Removes and returns value at top of stack.  If stack
//is empty returns null.
//---------------------------------------------------
public Object pop() {
	if(isEmpty()) {
		throw new EmptyStackException();
	} else {
		Object result = top.getElement();
		top = top.getNext();
		return result;
	}
}
//---------------------------------------------------
//Returns true if stack is empty, false otherwise.
//---------------------------------------------------
public boolean isEmpty() { 
	return top == null;
}
//---------------------------------------------------
//Returns true if stack is full, false otherwise.
//---------------------------------------------------
public boolean isFull() {
	return false;
}


public void printStack() {
	Node i = top;
	while (i != null) {
		System.out.println(i.getElement());
		i = i.getNext();
	}
	
}

public Stack<Node> reverseStack(LinkedStack s) {
	Stack<Node> reversed = new Stack<Node>();
	Node n = top;
	while (n.next != null) {
		reversed.push(n);
		n = n.next;
	}
	while (!reversed.isEmpty()) {
		n.next = reversed.peek();
		n = n.next;
		reversed.pop();
	}
	n.next = null;
	return reversed;
}

public LinkedStack removeElement(Object val) {
	LinkedStack removedStack = new LinkedStack();
	for (Node n = top; n != null; n = n.next) {
		if (n.getElement() != val) {
			removedStack.push(n);
		}
	} return removedStack;
}

}