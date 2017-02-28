package stacks;

public class Stack 
{
	//Set up instance variables
	private int[] stackElements;
	private int size;//default val starts at 0 
	private int topOfStackPos = 0;
	private int elementPushed;
	private int elementPopped;
	
	public static final int START_CAP = 16;//Set a CONSTANT for the starting default capacity 
	public static final double VERSION = 1.0;
	
	//create a new stack which will be invoked w/ this(START_LIMIT) as the max_capacity
		public Stack(int capacity)//1st Constructor
		{
			stackElements = new int[capacity];
		}
	
	//Make a constructor passing it the default start capacity
	public Stack()//2nd Constructor
	{
		//Use 'this' to invoke the 1st constructor with a START_CAP arg
		//and create an object of this class
		this(START_CAP);//Java REQUIRES this(arg-list) appear 1st in the constructor
	}
	
	
	//PUSH a new integer to the top of the stack
	public void push(int pushVal)//returns nothing
	{
		if (size >= stackElements.length)//check if stack is full BEFORE pushing
		{//ahh...push it
			//...then create a temp array twice the size of the original
			int[] temp = new int[stackElements.length * 2];
			//and copy the original array to the new temp var
			System.arraycopy(stackElements, 0, temp, 0, stackElements.length);
			stackElements = temp;//set the original stack array = to the new, more spacious stack
		}
		//size++;
		stackElements[size++] = pushVal;//1st push the value then increment size by 1
		elementPushed = size;
		topOfStackPos = size;
		
	}
	
	//Return and remove the top element from the stack
	public int pop() //returns int
	{
		--size;//decrement size by one then run the following operations
		this.elementPopped = size;
		this.topOfStackPos = elementPopped -1;
		return stackElements[elementPopped];//pop the top item (size -1) from the top	
		
		
	}
	
	
	

	//Return the top element from the stack w/o decrementing the size
	public int peek()
	{
		return stackElements[size -1];
	}
	
	//Test whether the stack is empty
	public boolean empty()
	{
		return size == 0;//returns true if size == 0 or stack is empty
	}
	
	//return the number of elements in the stack
	public int getSize()
	{
		return size;
	}
	
	
	public int getTopOfStackPos()
	{
		return topOfStackPos;
	}

	public int getElementPushed()
	{
		return elementPushed;
	}
	
	public int getElementPopped()
	{
		return elementPopped;
	}
}//close public class: Stack
