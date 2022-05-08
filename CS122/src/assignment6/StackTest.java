package assignment6;

public class StackTest {
public static void main(String[] args) {
  StackADT stack = new LinkedStack ();
 //push some stuff on the stack
for (int i=0; i<10; i++)
    stack.push(i*2);
//pop and print
//should print 18 16 14 12 10 8 6 4 2 0
while (!stack.isEmpty())
	System.out.print(stack.pop() + " ");
	System.out.println();
	//push a few more things
	for (int i=1; i<=6; i++)
	stack.push(i);
	//should print 6 5 4 3 2 1
	while (!stack.isEmpty())
	System.out.print(stack.pop() + " ");
	System.out.println();
	
	// Declare and instantiate a stack
    LinkedStack stack2 = new LinkedStack();
    //push some stuff on the stack
    for (int i=0; i<10; i++)
    stack2.push(i);

    // call printStack to print the stack
    stack2.printStack();

    // call reverseStack to reverse the stack
    LinkedStack reversedStack = stack2.reverseStack();
    reversedStack.printStack();

    // call printStack to print the stack again
    stack2.printStack();

    // call removeElement to remove all occurrences of the value 5

    // call printStack to print the original stack and the new stack
    //stack2.printStack();
	}
}
