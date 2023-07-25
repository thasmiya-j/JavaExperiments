package practice;
//stack operations
import java.util.Scanner;

public class stackoperations 
{
	public final static int SIZE = 5;
	public static int top = -1;
	public static int[] stack = new int[SIZE];
	
	public static boolean isFull()
	{
		if(top == SIZE-1)
		{
			return true;
		}
		return false;
	}
	public static boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	public static void push()
	{
		Scanner inp = new Scanner(System.in);
		
		if(isFull())
		{
			System.out.println("\nstack overflow!!");
			
		}
		else
		{
			top++;
			System.out.println("enter the elements:");
			stack[top] = inp.nextInt();
			System.out.println(stack[top]+"has been succesfully pushed into stack:");	
		}
		//inp.close()
	}
	
	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("\nstack under flow!!");
		}
		else
		{
			System.out.println(stack[top]+"has been sucessfully popped out of stack! ");
			top--;
		}
	}
	
	public static void peek()
	{
		if(isEmpty())
		{
			System.out.println("\nstack under flow!");
		}
		else
		{
			System.out.println("top element of ur stack is:" + stack[top]);
		}
	}
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("\nstack under flow!");
		}
		else
		{
			System.out.println("your stack:");
			for (int i = top; i>=0;i--)
			{	
			System.out.println(stack[i]);
			}
		}
	}
	

	public static void main(String[] args)
	{
		int ch;
		Scanner in = new Scanner(System.in);
		System.out.println("$$ STACK IMPLEMENTATION USING ARRAY$$");
		while(true)
		{
			System.out.println("\n enter ur choice:");
			System.out.println("\n1.PUSH \n2.POP \n3.PEEK \n4.DISPLAY \n5.EXIT ");
			ch = in.nextInt();
			
			switch(ch)
			{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
			case 4:
				display();
				break;
			case 5:
				System.out.println("sucessfully exited!");
				System.exit(0);
			default:
				System.out.println("invalid choice");
			
			}
		}
		

		
	}

}
