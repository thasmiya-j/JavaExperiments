import java.util.Scanner;
public class ifdemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a number:");
		num = obj.nextInt();
		
		if(num>0)
		{
			System.out.println(num+"is positive");
			
		}
		else
		{  
			if(num == 0)
			{
				System.out.println(num+" is neutral");
			}
			else
			{
			System.out.println(num+"is negative");
		    }
		

		}
	}
}


