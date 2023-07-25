package practice;

public class Recursion
{
	static int fact(int n)    //without obj i am calling this method directly so we r using static
	{
		if (n==0)
		{
			return 1;
		}
		return n*fact(n-1); //calling a method inside its own method is recursion
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));

	}

}
