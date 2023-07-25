package practice;
//Access control

public class stack 
{
	private int s[] = new int[10]; //we can use this data only inside this class these r private data can be accessed only throough methods
	private int top; //if we dont give any access specifier it will take( default=cannot be accessed from other packages accessed only inside the classes of this package
	
	stack() //constructor
	{
		top = -1;
	}
	
	 public void push(int item)   //methods inside the class
	{
		if(top==s.length)
			System.out.println("stack overflow!");
		else
			s[++top]=item;
	}
	public int pop()
	{
		if(top>=0)
			return top--;
		else
			System.out.println("stack underflow!");
		    return -1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		stack s1 = new stack();
		
		s1.push(5);
		s1.push(6);
		s1.push(8);
		
		s1.s[7]=100;
		

	}

}
