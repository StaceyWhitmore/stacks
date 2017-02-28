package stacks;

public class TestStack {

	public static void main(String[] args)
	{
Stack stack = new Stack();
		
		//PUSH all the items onto the stack
		for (int i = 0; i < 10; i++)
		{
			stack.push(i);
			System.out.println("Element # " + stack.getElementPushed() +" has been pushed." 
					+ " Top of the stack: stackElement[" + stack.getTopOfStackPos() + "]");
		}
		
		//Take a peek at the top item before they all get popped off the stack
		System.out.println("\nIs stack empty? "+ stack.empty());
		System.out.println("\nStack Size: "+ stack.getSize());
		System.out.println("\nPeak at the top item on the stack: "+ stack.peek());
		
		//POP each item off the stack 
		while (!stack.empty())
		{
			System.out.println(stack.pop() + " ");
			System.out.print("Element # " + stack.getElementPopped() + " Has been popped. "
					+ "Top of stack -->[" + stack.getTopOfStackPos() + "]");
			
		}
		System.out.println("\nIs stack empty?--"+ stack.empty());
		System.out.println("\nHow big is the stack?--"+ stack.getSize());

	}//close main()

}//Close class:TestStack
