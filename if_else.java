package university_lab;
import java.util.*;
public class main__ {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int x;
	        int y;
	        String whatOp;      

	        Scanner input = new Scanner(System.in);

	        System.out.println("please enter the first number");
	        x = input.nextInt();

	        System.out.println("please enter the second number");
	        y = input.nextInt();

	        Scanner op = new Scanner(System.in);

	        System.out.println("Please enter the operation you want to use");
	        whatOp = op.next();

	        if (whatOp.equals("+"))
	        {
	            System.out.println("The answer is " + (x + y));
	        }
	        else if  (whatOp.equals("-"))
	        {
	            System.out.println("The answer is " + (x - y));
	        }
	        else if (whatOp.equals("*"))
	        {
	            System.out.println("The answer is " + (x * y));
	        }
	        else if (whatOp.equals("/"))
	        {
	            System.out.println("The answer is " + (x / y));
	        }
	        else
	        {
	           System.out.println("Thats not a choice!");
	        }  
	    }
	

	}


